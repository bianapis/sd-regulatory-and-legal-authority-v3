package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepresentBankInterestsRetrieveOutputModelRepresentBankInterestsInstanceAnalysis
 */
public class BQRepresentBankInterestsRetrieveOutputModelRepresentBankInterestsInstanceAnalysis   {
  private Object representBankInterestsInstanceAnalysisRecord = null;

  private String representBankInterestsInstanceAnalysisReportType = null;

  private String representBankInterestsInstanceAnalysisParameters = null;

  private Object representBankInterestsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return representBankInterestsInstanceAnalysisRecord
  **/

  public Object getRepresentBankInterestsInstanceAnalysisRecord() {
    return representBankInterestsInstanceAnalysisRecord;
  }

  public void setRepresentBankInterestsInstanceAnalysisRecord(Object representBankInterestsInstanceAnalysisRecord) {
    this.representBankInterestsInstanceAnalysisRecord = representBankInterestsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return representBankInterestsInstanceAnalysisReportType
  **/

  public String getRepresentBankInterestsInstanceAnalysisReportType() {
    return representBankInterestsInstanceAnalysisReportType;
  }

  public void setRepresentBankInterestsInstanceAnalysisReportType(String representBankInterestsInstanceAnalysisReportType) {
    this.representBankInterestsInstanceAnalysisReportType = representBankInterestsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return representBankInterestsInstanceAnalysisParameters
  **/

  public String getRepresentBankInterestsInstanceAnalysisParameters() {
    return representBankInterestsInstanceAnalysisParameters;
  }

  public void setRepresentBankInterestsInstanceAnalysisParameters(String representBankInterestsInstanceAnalysisParameters) {
    this.representBankInterestsInstanceAnalysisParameters = representBankInterestsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return representBankInterestsInstanceAnalysisReport
  **/

  public Object getRepresentBankInterestsInstanceAnalysisReport() {
    return representBankInterestsInstanceAnalysisReport;
  }

  public void setRepresentBankInterestsInstanceAnalysisReport(Object representBankInterestsInstanceAnalysisReport) {
    this.representBankInterestsInstanceAnalysisReport = representBankInterestsInstanceAnalysisReport;
  }


}

