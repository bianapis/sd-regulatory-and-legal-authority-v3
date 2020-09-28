package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecordRegulatoryAndLegalAuthorityServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecord
 */
public class SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecord   {
  private String regulatoryAndLegalAuthorityServiceType = null;

  private String regulatoryAndLegalAuthorityServiceVersion = null;

  private String regulatoryAndLegalAuthorityServiceDescription = null;

  private SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecordRegulatoryAndLegalAuthorityServicePoliciesandGuidelines regulatoryAndLegalAuthorityServicePoliciesandGuidelines = null;

  private String regulatoryAndLegalAuthorityServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return regulatoryAndLegalAuthorityServiceType
  **/

  public String getRegulatoryAndLegalAuthorityServiceType() {
    return regulatoryAndLegalAuthorityServiceType;
  }

  public void setRegulatoryAndLegalAuthorityServiceType(String regulatoryAndLegalAuthorityServiceType) {
    this.regulatoryAndLegalAuthorityServiceType = regulatoryAndLegalAuthorityServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return regulatoryAndLegalAuthorityServiceVersion
  **/

  public String getRegulatoryAndLegalAuthorityServiceVersion() {
    return regulatoryAndLegalAuthorityServiceVersion;
  }

  public void setRegulatoryAndLegalAuthorityServiceVersion(String regulatoryAndLegalAuthorityServiceVersion) {
    this.regulatoryAndLegalAuthorityServiceVersion = regulatoryAndLegalAuthorityServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return regulatoryAndLegalAuthorityServiceDescription
  **/

  public String getRegulatoryAndLegalAuthorityServiceDescription() {
    return regulatoryAndLegalAuthorityServiceDescription;
  }

  public void setRegulatoryAndLegalAuthorityServiceDescription(String regulatoryAndLegalAuthorityServiceDescription) {
    this.regulatoryAndLegalAuthorityServiceDescription = regulatoryAndLegalAuthorityServiceDescription;
  }


  /**
   * Get regulatoryAndLegalAuthorityServicePoliciesandGuidelines
   * @return regulatoryAndLegalAuthorityServicePoliciesandGuidelines
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecordRegulatoryAndLegalAuthorityServicePoliciesandGuidelines getRegulatoryAndLegalAuthorityServicePoliciesandGuidelines() {
    return regulatoryAndLegalAuthorityServicePoliciesandGuidelines;
  }

  public void setRegulatoryAndLegalAuthorityServicePoliciesandGuidelines(SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecordRegulatoryAndLegalAuthorityServicePoliciesandGuidelines regulatoryAndLegalAuthorityServicePoliciesandGuidelines) {
    this.regulatoryAndLegalAuthorityServicePoliciesandGuidelines = regulatoryAndLegalAuthorityServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return regulatoryAndLegalAuthorityServiceSchedule
  **/

  public String getRegulatoryAndLegalAuthorityServiceSchedule() {
    return regulatoryAndLegalAuthorityServiceSchedule;
  }

  public void setRegulatoryAndLegalAuthorityServiceSchedule(String regulatoryAndLegalAuthorityServiceSchedule) {
    this.regulatoryAndLegalAuthorityServiceSchedule = regulatoryAndLegalAuthorityServiceSchedule;
  }


}

