package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup
 */
public class SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceConfigurationSetup   {
  private String regulatoryAndLegalAuthorityServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return regulatoryAndLegalAuthorityServiceConfigurationParameter
  **/

  public String getRegulatoryAndLegalAuthorityServiceConfigurationParameter() {
    return regulatoryAndLegalAuthorityServiceConfigurationParameter;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationParameter(String regulatoryAndLegalAuthorityServiceConfigurationParameter) {
    this.regulatoryAndLegalAuthorityServiceConfigurationParameter = regulatoryAndLegalAuthorityServiceConfigurationParameter;
  }


}

