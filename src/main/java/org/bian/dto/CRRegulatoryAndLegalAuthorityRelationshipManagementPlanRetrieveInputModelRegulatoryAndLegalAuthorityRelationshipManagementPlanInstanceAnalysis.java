package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveInputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveInputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReference = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReference = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisParameters
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisParameters() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisParameters;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisParameters(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisParameters) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisParameters = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisParameters;
  }


}

