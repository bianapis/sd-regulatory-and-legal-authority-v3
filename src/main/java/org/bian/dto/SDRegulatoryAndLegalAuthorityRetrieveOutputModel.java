package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedService;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityRetrieveOutputModel
 */
public class SDRegulatoryAndLegalAuthorityRetrieveOutputModel   {
  private String regulatoryAndLegalAuthorityRetrieveActionTaskReference = null;

  private Object regulatoryAndLegalAuthorityRetrieveActionTaskRecord = null;

  private String regulatoryAndLegalAuthorityRetrieveActionResponse = null;

  private SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityRetrieveActionRecord regulatoryAndLegalAuthorityRetrieveActionRecord = null;

  private SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedService regulatoryAndLegalAuthorityOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return regulatoryAndLegalAuthorityRetrieveActionTaskReference
  **/

  public String getRegulatoryAndLegalAuthorityRetrieveActionTaskReference() {
    return regulatoryAndLegalAuthorityRetrieveActionTaskReference;
  }

  public void setRegulatoryAndLegalAuthorityRetrieveActionTaskReference(String regulatoryAndLegalAuthorityRetrieveActionTaskReference) {
    this.regulatoryAndLegalAuthorityRetrieveActionTaskReference = regulatoryAndLegalAuthorityRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return regulatoryAndLegalAuthorityRetrieveActionResponse
  **/

  public String getRegulatoryAndLegalAuthorityRetrieveActionResponse() {
    return regulatoryAndLegalAuthorityRetrieveActionResponse;
  }

  public void setRegulatoryAndLegalAuthorityRetrieveActionResponse(String regulatoryAndLegalAuthorityRetrieveActionResponse) {
    this.regulatoryAndLegalAuthorityRetrieveActionResponse = regulatoryAndLegalAuthorityRetrieveActionResponse;
  }


  /**
   * Get regulatoryAndLegalAuthorityRetrieveActionRecord
   * @return regulatoryAndLegalAuthorityRetrieveActionRecord
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityRetrieveActionRecord getRegulatoryAndLegalAuthorityRetrieveActionRecord() {
    return regulatoryAndLegalAuthorityRetrieveActionRecord;
  }

  public void setRegulatoryAndLegalAuthorityRetrieveActionRecord(SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityRetrieveActionRecord regulatoryAndLegalAuthorityRetrieveActionRecord) {
    this.regulatoryAndLegalAuthorityRetrieveActionRecord = regulatoryAndLegalAuthorityRetrieveActionRecord;
  }


  /**
   * Get regulatoryAndLegalAuthorityOfferedService
   * @return regulatoryAndLegalAuthorityOfferedService
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedService getRegulatoryAndLegalAuthorityOfferedService() {
    return regulatoryAndLegalAuthorityOfferedService;
  }

  public void setRegulatoryAndLegalAuthorityOfferedService(SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedService regulatoryAndLegalAuthorityOfferedService) {
    this.regulatoryAndLegalAuthorityOfferedService = regulatoryAndLegalAuthorityOfferedService;
  }


}

