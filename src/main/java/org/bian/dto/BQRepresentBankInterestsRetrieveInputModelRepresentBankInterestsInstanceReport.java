package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceReport
 */
public class BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceReport   {
  private String representBankInterestsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return representBankInterestsInstanceReportReference
  **/

  public String getRepresentBankInterestsInstanceReportReference() {
    return representBankInterestsInstanceReportReference;
  }

  public void setRepresentBankInterestsInstanceReportReference(String representBankInterestsInstanceReportReference) {
    this.representBankInterestsInstanceReportReference = representBankInterestsInstanceReportReference;
  }


}

