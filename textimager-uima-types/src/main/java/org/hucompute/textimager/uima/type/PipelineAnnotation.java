

/* First created by JCasGen Sat Jul 31 13:50:22 CEST 2021 */
package org.hucompute.textimager.uima.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A pipeline annotation for a single document
 * Updated by JCasGen Sat Jul 31 13:50:22 CEST 2021
 * XML source: /home/alexander/docker_test/own_uima/textimager-uima-types/target/jcasgen/typesystem.xml
 * @generated */
public class PipelineAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PipelineAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected PipelineAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PipelineAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PipelineAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PipelineAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: annotator_name

  /** getter for annotator_name - gets The annotator name for which the settings are.
   * @generated */
  public String getAnnotator_name() {
    if (PipelineAnnotation_Type.featOkTst && ((PipelineAnnotation_Type)jcasType).casFeat_annotator_name == null)
      jcasType.jcas.throwFeatMissing("annotator_name", "org.hucompute.textimager.uima.type.PipelineAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PipelineAnnotation_Type)jcasType).casFeatCode_annotator_name);}
    
  /** setter for annotator_name - sets The annotator name for which the settings are. 
   * @generated */
  public void setAnnotator_name(String v) {
    if (PipelineAnnotation_Type.featOkTst && ((PipelineAnnotation_Type)jcasType).casFeat_annotator_name == null)
      jcasType.jcas.throwFeatMissing("annotator_name", "org.hucompute.textimager.uima.type.PipelineAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((PipelineAnnotation_Type)jcasType).casFeatCode_annotator_name, v);}    
   
    
  //*--------------*
  //* Feature: settings

  /** getter for settings - gets The settings for the annotator, comparable to the UIMA Context.
   * @generated */
  public String getSettings() {
    if (PipelineAnnotation_Type.featOkTst && ((PipelineAnnotation_Type)jcasType).casFeat_settings == null)
      jcasType.jcas.throwFeatMissing("settings", "org.hucompute.textimager.uima.type.PipelineAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PipelineAnnotation_Type)jcasType).casFeatCode_settings);}
    
  /** setter for settings - sets The settings for the annotator, comparable to the UIMA Context. 
   * @generated */
  public void setSettings(String v) {
    if (PipelineAnnotation_Type.featOkTst && ((PipelineAnnotation_Type)jcasType).casFeat_settings == null)
      jcasType.jcas.throwFeatMissing("settings", "org.hucompute.textimager.uima.type.PipelineAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((PipelineAnnotation_Type)jcasType).casFeatCode_settings, v);}    
  }

    