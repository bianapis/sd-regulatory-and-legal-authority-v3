package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceAnalysis
 */
public class BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceAnalysis   {
  private Object establishRelationsInstanceAnalysisRecord = null;

  private String establishRelationsInstanceAnalysisReportType = null;

  private String establishRelationsInstanceAnalysisParameters = null;

  private Object establishRelationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return establishRelationsInstanceAnalysisRecord
  **/

  public Object getEstablishRelationsInstanceAnalysisRecord() {
    return establishRelationsInstanceAnalysisRecord;
  }

  public void setEstablishRelationsInstanceAnalysisRecord(Object establishRelationsInstanceAnalysisRecord) {
    this.establishRelationsInstanceAnalysisRecord = establishRelationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return establishRelationsInstanceAnalysisReportType
  **/

  public String getEstablishRelationsInstanceAnalysisReportType() {
    return establishRelationsInstanceAnalysisReportType;
  }

  public void setEstablishRelationsInstanceAnalysisReportType(String establishRelationsInstanceAnalysisReportType) {
    this.establishRelationsInstanceAnalysisReportType = establishRelationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return establishRelationsInstanceAnalysisParameters
  **/

  public String getEstablishRelationsInstanceAnalysisParameters() {
    return establishRelationsInstanceAnalysisParameters;
  }

  public void setEstablishRelationsInstanceAnalysisParameters(String establishRelationsInstanceAnalysisParameters) {
    this.establishRelationsInstanceAnalysisParameters = establishRelationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return establishRelationsInstanceAnalysisReport
  **/

  public Object getEstablishRelationsInstanceAnalysisReport() {
    return establishRelationsInstanceAnalysisReport;
  }

  public void setEstablishRelationsInstanceAnalysisReport(Object establishRelationsInstanceAnalysisReport) {
    this.establishRelationsInstanceAnalysisReport = establishRelationsInstanceAnalysisReport;
  }


}

