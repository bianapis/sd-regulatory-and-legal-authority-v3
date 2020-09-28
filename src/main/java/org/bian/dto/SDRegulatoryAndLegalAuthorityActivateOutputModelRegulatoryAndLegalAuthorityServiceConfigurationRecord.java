package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup;
import org.bian.dto.SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement;
import org.bian.dto.SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord
 */
public class SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord   {
  private String regulatoryAndLegalAuthorityServiceConfigurationSettingReference = null;

  private String regulatoryAndLegalAuthorityServiceConfigurationSettingDescription = null;

  private SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup regulatoryAndLegalAuthorityServiceConfigurationSetup = null;

  private SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription regulatoryAndLegalAuthorityServiceSubscription = null;

  private SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement regulatoryAndLegalAuthorityServiceAgreement = null;

  private String regulatoryAndLegalAuthorityServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return regulatoryAndLegalAuthorityServiceConfigurationSettingReference
  **/

  public String getRegulatoryAndLegalAuthorityServiceConfigurationSettingReference() {
    return regulatoryAndLegalAuthorityServiceConfigurationSettingReference;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationSettingReference(String regulatoryAndLegalAuthorityServiceConfigurationSettingReference) {
    this.regulatoryAndLegalAuthorityServiceConfigurationSettingReference = regulatoryAndLegalAuthorityServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return regulatoryAndLegalAuthorityServiceConfigurationSettingDescription
  **/

  public String getRegulatoryAndLegalAuthorityServiceConfigurationSettingDescription() {
    return regulatoryAndLegalAuthorityServiceConfigurationSettingDescription;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationSettingDescription(String regulatoryAndLegalAuthorityServiceConfigurationSettingDescription) {
    this.regulatoryAndLegalAuthorityServiceConfigurationSettingDescription = regulatoryAndLegalAuthorityServiceConfigurationSettingDescription;
  }


  /**
   * Get regulatoryAndLegalAuthorityServiceConfigurationSetup
   * @return regulatoryAndLegalAuthorityServiceConfigurationSetup
  **/

  public SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup getRegulatoryAndLegalAuthorityServiceConfigurationSetup() {
    return regulatoryAndLegalAuthorityServiceConfigurationSetup;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationSetup(SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup regulatoryAndLegalAuthorityServiceConfigurationSetup) {
    this.regulatoryAndLegalAuthorityServiceConfigurationSetup = regulatoryAndLegalAuthorityServiceConfigurationSetup;
  }


  /**
   * Get regulatoryAndLegalAuthorityServiceSubscription
   * @return regulatoryAndLegalAuthorityServiceSubscription
  **/

  public SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription getRegulatoryAndLegalAuthorityServiceSubscription() {
    return regulatoryAndLegalAuthorityServiceSubscription;
  }

  public void setRegulatoryAndLegalAuthorityServiceSubscription(SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription regulatoryAndLegalAuthorityServiceSubscription) {
    this.regulatoryAndLegalAuthorityServiceSubscription = regulatoryAndLegalAuthorityServiceSubscription;
  }


  /**
   * Get regulatoryAndLegalAuthorityServiceAgreement
   * @return regulatoryAndLegalAuthorityServiceAgreement
  **/

  public SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement getRegulatoryAndLegalAuthorityServiceAgreement() {
    return regulatoryAndLegalAuthorityServiceAgreement;
  }

  public void setRegulatoryAndLegalAuthorityServiceAgreement(SDRegulatoryAndLegalAuthorityActivateOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement regulatoryAndLegalAuthorityServiceAgreement) {
    this.regulatoryAndLegalAuthorityServiceAgreement = regulatoryAndLegalAuthorityServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return regulatoryAndLegalAuthorityServiceStatus
  **/

  public String getRegulatoryAndLegalAuthorityServiceStatus() {
    return regulatoryAndLegalAuthorityServiceStatus;
  }

  public void setRegulatoryAndLegalAuthorityServiceStatus(String regulatoryAndLegalAuthorityServiceStatus) {
    this.regulatoryAndLegalAuthorityServiceStatus = regulatoryAndLegalAuthorityServiceStatus;
  }


}

