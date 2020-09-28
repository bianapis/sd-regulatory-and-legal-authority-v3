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
 * SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord
 */
public class SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord   {
  private String regulatoryAndLegalAuthorityServiceConfigurationSettingReference = null;

  private String regulatoryAndLegalAuthorityServiceConfigurationSettingType = null;

  private SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup regulatoryAndLegalAuthorityServiceConfigurationSetup = null;

  private SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceSubscription regulatoryAndLegalAuthorityServiceSubscription = null;

  private SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement regulatoryAndLegalAuthorityServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return regulatoryAndLegalAuthorityServiceConfigurationSettingType
  **/

  public String getRegulatoryAndLegalAuthorityServiceConfigurationSettingType() {
    return regulatoryAndLegalAuthorityServiceConfigurationSettingType;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationSettingType(String regulatoryAndLegalAuthorityServiceConfigurationSettingType) {
    this.regulatoryAndLegalAuthorityServiceConfigurationSettingType = regulatoryAndLegalAuthorityServiceConfigurationSettingType;
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


}

