package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceAnalysis;
import org.bian.dto.BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintainRelationsRetrieveInputModel
 */
public class BQMaintainRelationsRetrieveInputModel   {
  private Object maintainRelationsRetrieveActionTaskRecord = null;

  private String maintainRelationsRetrieveActionRequest = null;

  private BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceReport maintainRelationsInstanceReport = null;

  private BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceAnalysis maintainRelationsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return maintainRelationsRetrieveActionTaskRecord
  **/

  public Object getMaintainRelationsRetrieveActionTaskRecord() {
    return maintainRelationsRetrieveActionTaskRecord;
  }

  public void setMaintainRelationsRetrieveActionTaskRecord(Object maintainRelationsRetrieveActionTaskRecord) {
    this.maintainRelationsRetrieveActionTaskRecord = maintainRelationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return maintainRelationsRetrieveActionRequest
  **/

  public String getMaintainRelationsRetrieveActionRequest() {
    return maintainRelationsRetrieveActionRequest;
  }

  public void setMaintainRelationsRetrieveActionRequest(String maintainRelationsRetrieveActionRequest) {
    this.maintainRelationsRetrieveActionRequest = maintainRelationsRetrieveActionRequest;
  }


  /**
   * Get maintainRelationsInstanceReport
   * @return maintainRelationsInstanceReport
  **/

  public BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceReport getMaintainRelationsInstanceReport() {
    return maintainRelationsInstanceReport;
  }

  public void setMaintainRelationsInstanceReport(BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceReport maintainRelationsInstanceReport) {
    this.maintainRelationsInstanceReport = maintainRelationsInstanceReport;
  }


  /**
   * Get maintainRelationsInstanceAnalysis
   * @return maintainRelationsInstanceAnalysis
  **/

  public BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceAnalysis getMaintainRelationsInstanceAnalysis() {
    return maintainRelationsInstanceAnalysis;
  }

  public void setMaintainRelationsInstanceAnalysis(BQMaintainRelationsRetrieveInputModelMaintainRelationsInstanceAnalysis maintainRelationsInstanceAnalysis) {
    this.maintainRelationsInstanceAnalysis = maintainRelationsInstanceAnalysis;
  }


}

