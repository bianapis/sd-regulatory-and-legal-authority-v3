package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecordRegulatoryAndLegalAuthorityServicePoliciesandGuidelines
 */
public class SDRegulatoryAndLegalAuthorityRetrieveOutputModelRegulatoryAndLegalAuthorityOfferedServiceRegulatoryAndLegalAuthorityServiceRecordRegulatoryAndLegalAuthorityServicePoliciesandGuidelines   {
  private String regulatoryAndLegalAuthorityServiceEligibility = null;

  private String regulatoryAndLegalAuthorityServiceIntendedUses = null;

  private String regulatoryAndLegalAuthorityServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return regulatoryAndLegalAuthorityServiceEligibility
  **/

  public String getRegulatoryAndLegalAuthorityServiceEligibility() {
    return regulatoryAndLegalAuthorityServiceEligibility;
  }

  public void setRegulatoryAndLegalAuthorityServiceEligibility(String regulatoryAndLegalAuthorityServiceEligibility) {
    this.regulatoryAndLegalAuthorityServiceEligibility = regulatoryAndLegalAuthorityServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return regulatoryAndLegalAuthorityServiceIntendedUses
  **/

  public String getRegulatoryAndLegalAuthorityServiceIntendedUses() {
    return regulatoryAndLegalAuthorityServiceIntendedUses;
  }

  public void setRegulatoryAndLegalAuthorityServiceIntendedUses(String regulatoryAndLegalAuthorityServiceIntendedUses) {
    this.regulatoryAndLegalAuthorityServiceIntendedUses = regulatoryAndLegalAuthorityServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return regulatoryAndLegalAuthorityServicePricingandTerms
  **/

  public String getRegulatoryAndLegalAuthorityServicePricingandTerms() {
    return regulatoryAndLegalAuthorityServicePricingandTerms;
  }

  public void setRegulatoryAndLegalAuthorityServicePricingandTerms(String regulatoryAndLegalAuthorityServicePricingandTerms) {
    this.regulatoryAndLegalAuthorityServicePricingandTerms = regulatoryAndLegalAuthorityServicePricingandTerms;
  }


}

