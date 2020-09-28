package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityConfigureOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityConfigureOutputModel
 */
public class SDRegulatoryAndLegalAuthorityConfigureOutputModel   {
  private String regulatoryAndLegalAuthorityConfigurationActionTaskReference = null;

  private Object regulatoryAndLegalAuthorityConfigurationActionTaskRecord = null;

  private SDRegulatoryAndLegalAuthorityConfigureOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord regulatoryAndLegalAuthorityServiceConfigurationRecord = null;

  private String regulatoryAndLegalAuthorityServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return regulatoryAndLegalAuthorityConfigurationActionTaskReference
  **/

  public String getRegulatoryAndLegalAuthorityConfigurationActionTaskReference() {
    return regulatoryAndLegalAuthorityConfigurationActionTaskReference;
  }

  public void setRegulatoryAndLegalAuthorityConfigurationActionTaskReference(String regulatoryAndLegalAuthorityConfigurationActionTaskReference) {
    this.regulatoryAndLegalAuthorityConfigurationActionTaskReference = regulatoryAndLegalAuthorityConfigurationActionTaskReference;
  }


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
   * Get regulatoryAndLegalAuthorityServiceConfigurationRecord
   * @return regulatoryAndLegalAuthorityServiceConfigurationRecord
  **/

  public SDRegulatoryAndLegalAuthorityConfigureOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord getRegulatoryAndLegalAuthorityServiceConfigurationRecord() {
    return regulatoryAndLegalAuthorityServiceConfigurationRecord;
  }

  public void setRegulatoryAndLegalAuthorityServiceConfigurationRecord(SDRegulatoryAndLegalAuthorityConfigureOutputModelRegulatoryAndLegalAuthorityServiceConfigurationRecord regulatoryAndLegalAuthorityServiceConfigurationRecord) {
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

