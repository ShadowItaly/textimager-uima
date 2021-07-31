
/* First created by JCasGen Sat Jul 31 13:50:22 CEST 2021 */
package org.hucompute.textimager.uima.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** A pipeline annotation for a single document
 * Updated by JCasGen Sat Jul 31 13:50:22 CEST 2021
 * @generated */
public class PipelineAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PipelineAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PipelineAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PipelineAnnotation(addr, PipelineAnnotation_Type.this);
  			   PipelineAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PipelineAnnotation(addr, PipelineAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PipelineAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.textimager.uima.type.PipelineAnnotation");
 
  /** @generated */
  final Feature casFeat_annotator_name;
  /** @generated */
  final int     casFeatCode_annotator_name;
  /** @generated */ 
  public String getAnnotator_name(int addr) {
        if (featOkTst && casFeat_annotator_name == null)
      jcas.throwFeatMissing("annotator_name", "org.hucompute.textimager.uima.type.PipelineAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotator_name);
  }
  /** @generated */    
  public void setAnnotator_name(int addr, String v) {
        if (featOkTst && casFeat_annotator_name == null)
      jcas.throwFeatMissing("annotator_name", "org.hucompute.textimager.uima.type.PipelineAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotator_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_settings;
  /** @generated */
  final int     casFeatCode_settings;
  /** @generated */ 
  public String getSettings(int addr) {
        if (featOkTst && casFeat_settings == null)
      jcas.throwFeatMissing("settings", "org.hucompute.textimager.uima.type.PipelineAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_settings);
  }
  /** @generated */    
  public void setSettings(int addr, String v) {
        if (featOkTst && casFeat_settings == null)
      jcas.throwFeatMissing("settings", "org.hucompute.textimager.uima.type.PipelineAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_settings, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PipelineAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_annotator_name = jcas.getRequiredFeatureDE(casType, "annotator_name", "uima.cas.String", featOkTst);
    casFeatCode_annotator_name  = (null == casFeat_annotator_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotator_name).getCode();

 
    casFeat_settings = jcas.getRequiredFeatureDE(casType, "settings", "uima.cas.String", featOkTst);
    casFeatCode_settings  = (null == casFeat_settings) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_settings).getCode();

  }
}



    