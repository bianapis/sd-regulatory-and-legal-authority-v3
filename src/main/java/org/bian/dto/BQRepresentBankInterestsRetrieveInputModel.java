package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceAnalysis;
import org.bian.dto.BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRepresentBankInterestsRetrieveInputModel
 */
public class BQRepresentBankInterestsRetrieveInputModel   {
  private Object representBankInterestsRetrieveActionTaskRecord = null;

  private String representBankInterestsRetrieveActionRequest = null;

  private BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceReport representBankInterestsInstanceReport = null;

  private BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceAnalysis representBankInterestsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return representBankInterestsRetrieveActionTaskRecord
  **/

  public Object getRepresentBankInterestsRetrieveActionTaskRecord() {
    return representBankInterestsRetrieveActionTaskRecord;
  }

  public void setRepresentBankInterestsRetrieveActionTaskRecord(Object representBankInterestsRetrieveActionTaskRecord) {
    this.representBankInterestsRetrieveActionTaskRecord = representBankInterestsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return representBankInterestsRetrieveActionRequest
  **/

  public String getRepresentBankInterestsRetrieveActionRequest() {
    return representBankInterestsRetrieveActionRequest;
  }

  public void setRepresentBankInterestsRetrieveActionRequest(String representBankInterestsRetrieveActionRequest) {
    this.representBankInterestsRetrieveActionRequest = representBankInterestsRetrieveActionRequest;
  }


  /**
   * Get representBankInterestsInstanceReport
   * @return representBankInterestsInstanceReport
  **/

  public BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceReport getRepresentBankInterestsInstanceReport() {
    return representBankInterestsInstanceReport;
  }

  public void setRepresentBankInterestsInstanceReport(BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceReport representBankInterestsInstanceReport) {
    this.representBankInterestsInstanceReport = representBankInterestsInstanceReport;
  }


  /**
   * Get representBankInterestsInstanceAnalysis
   * @return representBankInterestsInstanceAnalysis
  **/

  public BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceAnalysis getRepresentBankInterestsInstanceAnalysis() {
    return representBankInterestsInstanceAnalysis;
  }

  public void setRepresentBankInterestsInstanceAnalysis(BQRepresentBankInterestsRetrieveInputModelRepresentBankInterestsInstanceAnalysis representBankInterestsInstanceAnalysis) {
    this.representBankInterestsInstanceAnalysis = representBankInterestsInstanceAnalysis;
  }


}

