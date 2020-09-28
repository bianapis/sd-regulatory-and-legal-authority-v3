package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceReport
 */
public class BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceReport   {
  private Object maintainRelationsInstanceReportRecord = null;

  private String maintainRelationsInstanceReportType = null;

  private String maintainRelationsInstanceReportParameters = null;

  private Object maintainRelationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return maintainRelationsInstanceReportRecord
  **/

  public Object getMaintainRelationsInstanceReportRecord() {
    return maintainRelationsInstanceReportRecord;
  }

  public void setMaintainRelationsInstanceReportRecord(Object maintainRelationsInstanceReportRecord) {
    this.maintainRelationsInstanceReportRecord = maintainRelationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return maintainRelationsInstanceReportType
  **/

  public String getMaintainRelationsInstanceReportType() {
    return maintainRelationsInstanceReportType;
  }

  public void setMaintainRelationsInstanceReportType(String maintainRelationsInstanceReportType) {
    this.maintainRelationsInstanceReportType = maintainRelationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return maintainRelationsInstanceReportParameters
  **/

  public String getMaintainRelationsInstanceReportParameters() {
    return maintainRelationsInstanceReportParameters;
  }

  public void setMaintainRelationsInstanceReportParameters(String maintainRelationsInstanceReportParameters) {
    this.maintainRelationsInstanceReportParameters = maintainRelationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return maintainRelationsInstanceReport
  **/

  public Object getMaintainRelationsInstanceReport() {
    return maintainRelationsInstanceReport;
  }

  public void setMaintainRelationsInstanceReport(Object maintainRelationsInstanceReport) {
    this.maintainRelationsInstanceReport = maintainRelationsInstanceReport;
  }


}

