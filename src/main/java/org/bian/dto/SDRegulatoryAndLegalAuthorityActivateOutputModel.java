package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityActivateOutputModel
 */
public class SDRegulatoryAndLegalAuthorityActivateOutputModel   {
  private String regulatoryAndLegalAuthorityActivationActionTaskReference = null;

  private Object regulatoryAndLegalAuthorityActivationActionTaskRecord = null;

  private String regulatoryAndLegalAuthorityServicingSessionReference = null;

  private Object regulatoryAndLegalAuthorityServicingSessionRecord = null;

  private SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord regulatoryAndLegalAuthorityServiceConfigurationRecord = null;

  private String regulatoryAndLegalAuthorityServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return regulatoryAndLegalAuthorityActivationActionTaskReference
  **/

  public String getRegulatoryAndLegalAuthorityActivationActionTaskReference() {
    return regulatoryAndLegalAuthorityActivationActionTaskReference;
  }

  public void setRegulatoryAndLegalAuthorityActivationActionTaskReference(String regulatoryAndLegalAuthorityActivationActionTaskReference) {
    this.regulatoryAndLegalAuthorityActivationActionTaskReference = regulatoryAndLegalAuthorityActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return regulatoryAndLegalAuthorityActivationActionTaskRecord
  **/

  public Object getRegulatoryAndLegalAuthorityActivationActionTaskRecord() {
    return regulatoryAndLegalAuthorityActivationActionTaskRecord;
  }

  public void setRegulatoryAndLegalAuthorityActivationActionTaskRecord(Object regulatoryAndLegalAuthorityActivationActionTaskRecord) {
    this.regulatoryAndLegalAuthorityActivationActionTaskRecord = regulatoryAndLegalAuthorityActivationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return regulatoryAndLegalAuthorityServicingSessionRecord
  **/

  public Object getRegulatoryAndLegalAuthorityServicingSessionRecord() {
    return regulatoryAndLegalAuthorityServicingSessionRecord;
  }

  public void setRegulatoryAndLegalAuthorityServicingSessionRecord(Object regulatoryAndLegalAuthorityServicingSessionRecord) {
    this.regulatoryAndLegalAuthorityServicingSessionRecord = regulatoryAndLegalAuthorityServicingSessionRecord;
  }


  /**
   * Get regulatoryAndLegalAuthorityServiceConfigurationRecord
   * @return regulatoryAndLegalAuthorityServiceConfigurationRecord
  **/

  public SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord getRegulatoryAndLegalAuthorityServiceConfigurationRecord() {
    return regulatoryAndLegalAuthorityServiceConfigurationRecord;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationRecord(SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord regulatoryAndLegalAuthorityServiceConfigurationRecord) {
    this.regulatoryAndLegalAuthorityServiceConfigurationRecord = regulatoryAndLegalAuthorityServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return regulatoryAndLegalAuthorityServicingSessionStatus
  **/

  public String getRegulatoryAndLegalAuthorityServicingSessionStatus() {
    return regulatoryAndLegalAuthorityServicingSessionStatus;
  }

  public void setRegulatoryAndLegalAuthorityServicingSessionStatus(String regulatoryAndLegalAuthorityServicingSessionStatus) {
    this.regulatoryAndLegalAuthorityServicingSessionStatus = regulatoryAndLegalAuthorityServicingSessionStatus;
  }


}

