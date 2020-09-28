package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement
 */
public class SDRegulatoryAndLegalAuthorityConfigureInputModelRegulatoryAndLegalAuthorityServiceConfigurationRecordRegulatoryAndLegalAuthorityServiceAgreement   {
  private String regulatoryAndLegalAuthorityServiceAgreementReference = null;

  private String regulatoryAndLegalAuthorityServiceUserReference = null;

  private String regulatoryAndLegalAuthorityServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return regulatoryAndLegalAuthorityServiceAgreementReference
  **/

  public String getRegulatoryAndLegalAuthorityServiceAgreementReference() {
    return regulatoryAndLegalAuthorityServiceAgreementReference;
  }

  public void setRegulatoryAndLegalAuthorityServiceAgreementReference(String regulatoryAndLegalAuthorityServiceAgreementReference) {
    this.regulatoryAndLegalAuthorityServiceAgreementReference = regulatoryAndLegalAuthorityServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return regulatoryAndLegalAuthorityServiceUserReference
  **/

  public String getRegulatoryAndLegalAuthorityServiceUserReference() {
    return regulatoryAndLegalAuthorityServiceUserReference;
  }

  public void setRegulatoryAndLegalAuthorityServiceUserReference(String regulatoryAndLegalAuthorityServiceUserReference) {
    this.regulatoryAndLegalAuthorityServiceUserReference = regulatoryAndLegalAuthorityServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return regulatoryAndLegalAuthorityServiceAgreementTermsandConditions
  **/

  public String getRegulatoryAndLegalAuthorityServiceAgreementTermsandConditions() {
    return regulatoryAndLegalAuthorityServiceAgreementTermsandConditions;
  }

  public void setRegulatoryAndLegalAuthorityServiceAgreementTermsandConditions(String regulatoryAndLegalAuthorityServiceAgreementTermsandConditions) {
    this.regulatoryAndLegalAuthorityServiceAgreementTermsandConditions = regulatoryAndLegalAuthorityServiceAgreementTermsandConditions;
  }


}

