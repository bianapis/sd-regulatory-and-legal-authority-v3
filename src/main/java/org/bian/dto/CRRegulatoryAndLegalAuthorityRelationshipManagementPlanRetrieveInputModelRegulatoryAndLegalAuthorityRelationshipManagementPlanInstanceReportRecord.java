package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveInputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveInputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportReference = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportReference = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportParameters
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportParameters() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportParameters;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportParameters(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportParameters) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportParameters = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportParameters;
  }


}

