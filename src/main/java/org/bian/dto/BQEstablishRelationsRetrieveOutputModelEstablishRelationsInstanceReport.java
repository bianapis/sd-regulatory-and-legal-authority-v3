package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceReport
 */
public class BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceReport   {
  private Object establishRelationsInstanceReportRecord = null;

  private String establishRelationsInstanceReportType = null;

  private String establishRelationsInstanceReportParameters = null;

  private Object establishRelationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return establishRelationsInstanceReportRecord
  **/

  public Object getEstablishRelationsInstanceReportRecord() {
    return establishRelationsInstanceReportRecord;
  }

  public void setEstablishRelationsInstanceReportRecord(Object establishRelationsInstanceReportRecord) {
    this.establishRelationsInstanceReportRecord = establishRelationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return establishRelationsInstanceReportType
  **/

  public String getEstablishRelationsInstanceReportType() {
    return establishRelationsInstanceReportType;
  }

  public void setEstablishRelationsInstanceReportType(String establishRelationsInstanceReportType) {
    this.establishRelationsInstanceReportType = establishRelationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return establishRelationsInstanceReportParameters
  **/

  public String getEstablishRelationsInstanceReportParameters() {
    return establishRelationsInstanceReportParameters;
  }

  public void setEstablishRelationsInstanceReportParameters(String establishRelationsInstanceReportParameters) {
    this.establishRelationsInstanceReportParameters = establishRelationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return establishRelationsInstanceReport
  **/

  public Object getEstablishRelationsInstanceReport() {
    return establishRelationsInstanceReport;
  }

  public void setEstablishRelationsInstanceReport(Object establishRelationsInstanceReport) {
    this.establishRelationsInstanceReport = establishRelationsInstanceReport;
  }


}

