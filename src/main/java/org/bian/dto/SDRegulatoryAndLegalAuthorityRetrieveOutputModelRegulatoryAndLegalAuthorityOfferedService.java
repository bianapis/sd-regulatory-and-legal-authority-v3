package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedService
 */
public class SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedService   {
  private String regulatoryAndLegalAuthorityServiceReference = null;

  private SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecord regulatoryAndLegalAuthorityServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return regulatoryAndLegalAuthorityServiceReference
  **/

  public String getRegulatoryAndLegalAuthorityServiceReference() {
    return regulatoryAndLegalAuthorityServiceReference;
  }

  public void setRegulatoryAndLegalAuthorityServiceReference(String regulatoryAndLegalAuthorityServiceReference) {
    this.regulatoryAndLegalAuthorityServiceReference = regulatoryAndLegalAuthorityServiceReference;
  }


  /**
   * Get regulatoryAndLegalAuthorityServiceRecord
   * @return regulatoryAndLegalAuthorityServiceRecord
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecord getRegulatoryAndLegalAuthorityServiceRecord() {
    return regulatoryAndLegalAuthorityServiceRecord;
  }

  public void setRegulatoryAndLegalAuthorityServiceRecord(SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecord regulatoryAndLegalAuthorityServiceRecord) {
    this.regulatoryAndLegalAuthorityServiceRecord = regulatoryAndLegalAuthorityServiceRecord;
  }


}

