package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityActivateInputModel
 */
public class SDRegulatoryAndLegalAuthorityActivateInputModel   {
  private Object regulatoryAndLegalAuthorityActivationActionTaskRecord = null;

  private String regulatoryAndLegalAuthorityCenterReference = null;

  private String regulatoryAndLegalAuthorityServiceReference = null;

  private SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord regulatoryAndLegalAuthorityServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return regulatoryAndLegalAuthorityCenterReference
  **/

  public String getRegulatoryAndLegalAuthorityCenterReference() {
    return regulatoryAndLegalAuthorityCenterReference;
  }

  public void setRegulatoryAndLegalAuthorityCenterReference(String regulatoryAndLegalAuthorityCenterReference) {
    this.regulatoryAndLegalAuthorityCenterReference = regulatoryAndLegalAuthorityCenterReference;
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

  public SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord getRegulatoryAndLegalAuthorityServiceConfigurationRecord() {
    return regulatoryAndLegalAuthorityServiceConfigurationRecord;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationRecord(SDRegulatoryAndLegalAuthorityActivateInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord regulatoryAndLegalAuthorityServiceConfigurationRecord) {
    this.regulatoryAndLegalAuthorityServiceConfigurationRecord = regulatoryAndLegalAuthorityServiceConfigurationRecord;
  }


}

