package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceAnalysis
 */
public class BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceAnalysis   {
  private String maintainRelationsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return maintainRelationsInstanceAnalysisReference
  **/

  public String getMaintainRelationsInstanceAnalysisReference() {
    return maintainRelationsInstanceAnalysisReference;
  }

  public void setMaintainRelationsInstanceAnalysisReference(String maintainRelationsInstanceAnalysisReference) {
    this.maintainRelationsInstanceAnalysisReference = maintainRelationsInstanceAnalysisReference;
  }


}

