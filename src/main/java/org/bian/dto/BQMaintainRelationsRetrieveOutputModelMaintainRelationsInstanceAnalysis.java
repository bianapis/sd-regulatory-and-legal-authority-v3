package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceAnalysis
 */
public class BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceAnalysis   {
  private Object maintainRelationsInstanceAnalysisRecord = null;

  private String maintainRelationsInstanceAnalysisReportType = null;

  private String maintainRelationsInstanceAnalysisParameters = null;

  private Object maintainRelationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return maintainRelationsInstanceAnalysisRecord
  **/

  public Object getMaintainRelationsInstanceAnalysisRecord() {
    return maintainRelationsInstanceAnalysisRecord;
  }

  public void setMaintainRelationsInstanceAnalysisRecord(Object maintainRelationsInstanceAnalysisRecord) {
    this.maintainRelationsInstanceAnalysisRecord = maintainRelationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return maintainRelationsInstanceAnalysisReportType
  **/

  public String getMaintainRelationsInstanceAnalysisReportType() {
    return maintainRelationsInstanceAnalysisReportType;
  }

  public void setMaintainRelationsInstanceAnalysisReportType(String maintainRelationsInstanceAnalysisReportType) {
    this.maintainRelationsInstanceAnalysisReportType = maintainRelationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return maintainRelationsInstanceAnalysisParameters
  **/

  public String getMaintainRelationsInstanceAnalysisParameters() {
    return maintainRelationsInstanceAnalysisParameters;
  }

  public void setMaintainRelationsInstanceAnalysisParameters(String maintainRelationsInstanceAnalysisParameters) {
    this.maintainRelationsInstanceAnalysisParameters = maintainRelationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return maintainRelationsInstanceAnalysisReport
  **/

  public Object getMaintainRelationsInstanceAnalysisReport() {
    return maintainRelationsInstanceAnalysisReport;
  }

  public void setMaintainRelationsInstanceAnalysisReport(Object maintainRelationsInstanceAnalysisReport) {
    this.maintainRelationsInstanceAnalysisReport = maintainRelationsInstanceAnalysisReport;
  }


}

