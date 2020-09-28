package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceAnalysis;
import org.bian.dto.BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEstablishRelationsRetrieveInputModel
 */
public class BQEstablishRelationsRetrieveInputModel   {
  private Object establishRelationsRetrieveActionTaskRecord = null;

  private String establishRelationsRetrieveActionRequest = null;

  private BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceReport establishRelationsInstanceReport = null;

  private BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceAnalysis establishRelationsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return establishRelationsRetrieveActionTaskRecord
  **/

  public Object getEstablishRelationsRetrieveActionTaskRecord() {
    return establishRelationsRetrieveActionTaskRecord;
  }

  public void setEstablishRelationsRetrieveActionTaskRecord(Object establishRelationsRetrieveActionTaskRecord) {
    this.establishRelationsRetrieveActionTaskRecord = establishRelationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return establishRelationsRetrieveActionRequest
  **/

  public String getEstablishRelationsRetrieveActionRequest() {
    return establishRelationsRetrieveActionRequest;
  }

  public void setEstablishRelationsRetrieveActionRequest(String establishRelationsRetrieveActionRequest) {
    this.establishRelationsRetrieveActionRequest = establishRelationsRetrieveActionRequest;
  }


  /**
   * Get establishRelationsInstanceReport
   * @return establishRelationsInstanceReport
  **/

  public BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceReport getEstablishRelationsInstanceReport() {
    return establishRelationsInstanceReport;
  }

  public void setEstablishRelationsInstanceReport(BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceReport establishRelationsInstanceReport) {
    this.establishRelationsInstanceReport = establishRelationsInstanceReport;
  }


  /**
   * Get establishRelationsInstanceAnalysis
   * @return establishRelationsInstanceAnalysis
  **/

  public BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceAnalysis getEstablishRelationsInstanceAnalysis() {
    return establishRelationsInstanceAnalysis;
  }

  public void setEstablishRelationsInstanceAnalysis(BQEstablishRelationsRetrieveInputModelEstablishRelationsInstanceAnalysis establishRelationsInstanceAnalysis) {
    this.establishRelationsInstanceAnalysis = establishRelationsInstanceAnalysis;
  }


}

