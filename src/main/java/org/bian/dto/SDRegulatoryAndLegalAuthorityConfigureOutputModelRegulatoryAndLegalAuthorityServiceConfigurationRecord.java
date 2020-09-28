package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement;
import org.bian.dto.SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup;
import org.bian.dto.SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityConfigureOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord
 */
public class SDRegulatoryAndLegalAuthorityConfigureOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord   {
  private String regulatoryAndLegalAuthorityServiceConfigurationSettingDescription = null;

  private SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup regulatoryAndLegalAuthorityServiceConfigurationSetup = null;

  private SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription regulatoryAndLegalAuthorityServiceSubscription = null;

  private SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement regulatoryAndLegalAuthorityServiceAgreement = null;

  private String regulatoryAndLegalAuthorityServiceStatus = null;


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

  public SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup getRegulatoryAndLegalAuthorityServiceConfigurationSetup() {
    return regulatoryAndLegalAuthorityServiceConfigurationSetup;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationSetup(SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup regulatoryAndLegalAuthorityServiceConfigurationSetup) {
    this.regulatoryAndLegalAuthorityServiceConfigurationSetup = regulatoryAndLegalAuthorityServiceConfigurationSetup;
  }


  /**
   * Get regulatoryAndLegalAuthorityServiceSubscription
   * @return regulatoryAndLegalAuthorityServiceSubscription
  **/

  public SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription getRegulatoryAndLegalAuthorityServiceSubscription() {
    return regulatoryAndLegalAuthorityServiceSubscription;
  }

  public void setRegulatoryAndLegalAuthorityServiceSubscription(SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription regulatoryAndLegalAuthorityServiceSubscription) {
    this.regulatoryAndLegalAuthorityServiceSubscription = regulatoryAndLegalAuthorityServiceSubscription;
  }


  /**
   * Get regulatoryAndLegalAuthorityServiceAgreement
   * @return regulatoryAndLegalAuthorityServiceAgreement
  **/

  public SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement getRegulatoryAndLegalAuthorityServiceAgreement() {
    return regulatoryAndLegalAuthorityServiceAgreement;
  }

  public void setRegulatoryAndLegalAuthorityServiceAgreement(SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement regulatoryAndLegalAuthorityServiceAgreement) {
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

