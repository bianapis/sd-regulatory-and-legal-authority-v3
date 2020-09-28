package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepresentBankInterestsRetrieveOutputModelRepresentBankInterestsInstanceReport
 */
public class BQRepresentBankInterestsRetrieveOutputModelRepresentBankInterestsInstanceReport   {
  private Object representBankInterestsInstanceReportRecord = null;

  private String representBankInterestsInstanceReportType = null;

  private String representBankInterestsInstanceReportParameters = null;

  private Object representBankInterestsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return representBankInterestsInstanceReportRecord
  **/

  public Object getRepresentBankInterestsInstanceReportRecord() {
    return representBankInterestsInstanceReportRecord;
  }

  public void setRepresentBankInterestsInstanceReportRecord(Object representBankInterestsInstanceReportRecord) {
    this.representBankInterestsInstanceReportRecord = representBankInterestsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return representBankInterestsInstanceReportType
  **/

  public String getRepresentBankInterestsInstanceReportType() {
    return representBankInterestsInstanceReportType;
  }

  public void setRepresentBankInterestsInstanceReportType(String representBankInterestsInstanceReportType) {
    this.representBankInterestsInstanceReportType = representBankInterestsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return representBankInterestsInstanceReportParameters
  **/

  public String getRepresentBankInterestsInstanceReportParameters() {
    return representBankInterestsInstanceReportParameters;
  }

  public void setRepresentBankInterestsInstanceReportParameters(String representBankInterestsInstanceReportParameters) {
    this.representBankInterestsInstanceReportParameters = representBankInterestsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return representBankInterestsInstanceReport
  **/

  public Object getRepresentBankInterestsInstanceReport() {
    return representBankInterestsInstanceReport;
  }

  public void setRepresentBankInterestsInstanceReport(Object representBankInterestsInstanceReport) {
    this.representBankInterestsInstanceReport = representBankInterestsInstanceReport;
  }


}

