package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceReport
 */
public class BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceReport   {
  private String establishRelationsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return establishRelationsInstanceReportReference
  **/

  public String getEstablishRelationsInstanceReportReference() {
    return establishRelationsInstanceReportReference;
  }

  public void setEstablishRelationsInstanceReportReference(String establishRelationsInstanceReportReference) {
    this.establishRelationsInstanceReportReference = establishRelationsInstanceReportReference;
  }


}

