package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportData = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportType = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportData
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportData() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportData;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportData(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportData) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportData = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReport
  **/

  public Object getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReport() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReport;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReport(Object regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReport) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReport = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReport;
  }


}

