package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisData = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReportType = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisData
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisData() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisData;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisData(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisData) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisData = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReport
  **/

  public Object getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReport() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReport;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReport(Object regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReport) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReport = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysisReport;
  }


}

