package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription
 */
public class SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription   {
  private String regulatoryAndLegalAuthorityServiceSubscriberReference = null;

  private String regulatoryAndLegalAuthorityServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return regulatoryAndLegalAuthorityServiceSubscriberReference
  **/

  public String getRegulatoryAndLegalAuthorityServiceSubscriberReference() {
    return regulatoryAndLegalAuthorityServiceSubscriberReference;
  }

  public void setRegulatoryAndLegalAuthorityServiceSubscriberReference(String regulatoryAndLegalAuthorityServiceSubscriberReference) {
    this.regulatoryAndLegalAuthorityServiceSubscriberReference = regulatoryAndLegalAuthorityServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return regulatoryAndLegalAuthorityServiceSubscriberAccessProfile
  **/

  public String getRegulatoryAndLegalAuthorityServiceSubscriberAccessProfile() {
    return regulatoryAndLegalAuthorityServiceSubscriberAccessProfile;
  }

  public void setRegulatoryAndLegalAuthorityServiceSubscriberAccessProfile(String regulatoryAndLegalAuthorityServiceSubscriberAccessProfile) {
    this.regulatoryAndLegalAuthorityServiceSubscriberAccessProfile = regulatoryAndLegalAuthorityServiceSubscriberAccessProfile;
  }


}

