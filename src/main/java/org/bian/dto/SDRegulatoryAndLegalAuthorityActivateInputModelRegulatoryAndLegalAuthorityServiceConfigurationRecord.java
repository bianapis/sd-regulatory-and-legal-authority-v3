package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord
 */
public class SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord   {
  private String regulatoryAndLegalAuthorityServiceConfigurationSettingReference = null;

  private String regulatoryAndLegalAuthorityServiceConfigurationSettingType = null;

  private SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup regulatoryAndLegalAuthorityServiceConfigurationSetup = null;


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

  public SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup getRegulatoryAndLegalAuthorityServiceConfigurationSetup() {
    return regulatoryAndLegalAuthorityServiceConfigurationSetup;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationSetup(SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup regulatoryAndLegalAuthorityServiceConfigurationSetup) {
    this.regulatoryAndLegalAuthorityServiceConfigurationSetup = regulatoryAndLegalAuthorityServiceConfigurationSetup;
  }


}

