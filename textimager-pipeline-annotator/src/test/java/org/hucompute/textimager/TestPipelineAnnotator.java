package org.hucompute.textimager;

import org.apache.uima.UIMAException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.junit.Test;
import org.hucompute.textimager.uima.type.PipelineAnnotation;

import static org.junit.Assert.assertEquals;

public class TestPipelineAnnotator {
    @Test
    public void test_type_available() throws UIMAException {
        JCas jcas = JCasFactory.createJCas();
        jcas.setDocumentLanguage("de");
        jcas.setDocumentText("Sein oder nicht sein das ist hier die Frage.");
        //Just check that the type exists and we can query from the jCAS object
        PipelineAnnotation pipe = new PipelineAnnotation(jcas);
        pipe.setAnnotator_name("spacy_multi_tagger");
        pipe.setSettings("{}");
        pipe.addToIndexes();

        int count = 0;
        for(PipelineAnnotation x : JCasUtil.select(jcas,PipelineAnnotation.class)) {
            assertEquals(x.getAnnotator_name(),"spacy_multi_tagger");
            assertEquals(x.getSettings(),"{}");
            count+=1;
        }
        assertEquals(count,1);
    }
}
