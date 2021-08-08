package org.hucompute.textimager;

import org.apache.uima.UIMAException;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.hucompute.textimager.uima.type.PipelineAnnotation;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.json.JSONArray;
import org.json.JSONObject;



public class PipelineAnnotator extends JCasAnnotator_ImplBase {
  private JSONArray _current_pipeline;

  @Override
  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    super.initialize(aContext);
    //Expected to be in the format JSON
    //Input must be [{name: "clasname of annotator", user_settings={}},...]
    _current_pipeline = new JSONArray((String) aContext.getConfigParameterValue("pipeline_configuration"));
  }

  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    for(int i = 0; i < _current_pipeline.length(); i++) {
      PipelineAnnotation pipe = new PipelineAnnotation(aJCas);
      pipe.setAnnotator_name(_current_pipeline.getJSONObject(i).getString("name"));
      pipe.setSettings(_current_pipeline.getJSONObject(i).getJSONObject("annotator_settings").toString());
      pipe.addToIndexes();
    }
  }
}
