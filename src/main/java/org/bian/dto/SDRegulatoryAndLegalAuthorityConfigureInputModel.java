package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityConfigureInputModel
 */
public class SDRegulatoryAndLegalAuthorityConfigureInputModel   {
  private Object regulatoryAndLegalAuthorityConfigurationActionTaskRecord = null;

  private String regulatoryAndLegalAuthorityServicingSessionReference = null;

  private String regulatoryAndLegalAuthorityServiceReference = null;

  private SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord regulatoryAndLegalAuthorityServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return regulatoryAndLegalAuthorityConfigurationActionTaskRecord
  **/

  public Object getRegulatoryAndLegalAuthorityConfigurationActionTaskRecord() {
    return regulatoryAndLegalAuthorityConfigurationActionTaskRecord;
  }

  public void setRegulatoryAndLegalAuthorityConfigurationActionTaskRecord(Object regulatoryAndLegalAuthorityConfigurationActionTaskRecord) {
    this.regulatoryAndLegalAuthorityConfigurationActionTaskRecord = regulatoryAndLegalAuthorityConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return regulatoryAndLegalAuthorityServicingSessionReference
  **/

  public String getRegulatoryAndLegalAuthorityServicingSessionReference() {
    return regulatoryAndLegalAuthorityServicingSessionReference;
  }

  public void setRegulatoryAndLegalAuthorityServicingSessionReference(String regulatoryAndLegalAuthorityServicingSessionReference) {
    this.regulatoryAndLegalAuthorityServicingSessionReference = regulatoryAndLegalAuthorityServicingSessionReference;
  }


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
   * Get regulatoryAndLegalAuthorityServiceConfigurationRecord
   * @return regulatoryAndLegalAuthorityServiceConfigurationRecord
  **/

  public SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord getRegulatoryAndLegalAuthorityServiceConfigurationRecord() {
    return regulatoryAndLegalAuthorityServiceConfigurationRecord;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationRecord(SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord regulatoryAndLegalAuthorityServiceConfigurationRecord) {
    this.regulatoryAndLegalAuthorityServiceConfigurationRecord = regulatoryAndLegalAuthorityServiceConfigurationRecord;
  }


}

