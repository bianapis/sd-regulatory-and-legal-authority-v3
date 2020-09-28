package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityOfferedService;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityRetrieveInputModel
 */
public class SDRegulatoryAndLegalAuthorityRetrieveInputModel   {
  private Object regulatoryAndLegalAuthorityRetrieveActionTaskRecord = null;

  private String regulatoryAndLegalAuthorityRetrieveActionRequest = null;

  private SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecord regulatoryAndLegalAuthorityRetrieveActionRecord = null;

  private SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityOfferedService regulatoryAndLegalAuthorityOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return regulatoryAndLegalAuthorityRetrieveActionTaskRecord
  **/

  public Object getRegulatoryAndLegalAuthorityRetrieveActionTaskRecord() {
    return regulatoryAndLegalAuthorityRetrieveActionTaskRecord;
  }

  public void setRegulatoryAndLegalAuthorityRetrieveActionTaskRecord(Object regulatoryAndLegalAuthorityRetrieveActionTaskRecord) {
    this.regulatoryAndLegalAuthorityRetrieveActionTaskRecord = regulatoryAndLegalAuthorityRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return regulatoryAndLegalAuthorityRetrieveActionRequest
  **/

  public String getRegulatoryAndLegalAuthorityRetrieveActionRequest() {
    return regulatoryAndLegalAuthorityRetrieveActionRequest;
  }

  public void setRegulatoryAndLegalAuthorityRetrieveActionRequest(String regulatoryAndLegalAuthorityRetrieveActionRequest) {
    this.regulatoryAndLegalAuthorityRetrieveActionRequest = regulatoryAndLegalAuthorityRetrieveActionRequest;
  }


  /**
   * Get regulatoryAndLegalAuthorityRetrieveActionRecord
   * @return regulatoryAndLegalAuthorityRetrieveActionRecord
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecord getRegulatoryAndLegalAuthorityRetrieveActionRecord() {
    return regulatoryAndLegalAuthorityRetrieveActionRecord;
  }

  public void setRegulatoryAndLegalAuthorityRetrieveActionRecord(SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecord regulatoryAndLegalAuthorityRetrieveActionRecord) {
    this.regulatoryAndLegalAuthorityRetrieveActionRecord = regulatoryAndLegalAuthorityRetrieveActionRecord;
  }


  /**
   * Get regulatoryAndLegalAuthorityOfferedService
   * @return regulatoryAndLegalAuthorityOfferedService
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityOfferedService getRegulatoryAndLegalAuthorityOfferedService() {
    return regulatoryAndLegalAuthorityOfferedService;
  }

  public void setRegulatoryAndLegalAuthorityOfferedService(SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityOfferedService regulatoryAndLegalAuthorityOfferedService) {
    this.regulatoryAndLegalAuthorityOfferedService = regulatoryAndLegalAuthorityOfferedService;
  }


}

