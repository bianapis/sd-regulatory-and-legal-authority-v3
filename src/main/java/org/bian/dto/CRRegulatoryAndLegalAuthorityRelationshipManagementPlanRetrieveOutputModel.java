package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis;
import org.bian.dto.CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModel
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModel   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanReference = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanDescription = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskReference = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskRecord = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionResponse = null;

  private CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord = null;

  private CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Regulatory And Legal Authority Relationship ManagementPlan 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanType
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanType() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanType;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanType(String regulatoryAndLegalAuthorityRelationshipManagementPlanType) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanType = regulatoryAndLegalAuthorityRelationshipManagementPlanType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Regulatory And Legal Authority Relationship ManagementPlan 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanReference = regulatoryAndLegalAuthorityRelationshipManagementPlanReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within Regulatory And Legal Authority Relationship ManagementPlan according to the type of resource and/or activity that is budgetted 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType(String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for Regulatory And Legal Authority Relationship ManagementPlan 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanAssignment() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanAssignment(String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to Regulatory And Legal Authority Relationship ManagementPlan  
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanPlan
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanPlan() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanPlan;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanPlan(String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = regulatoryAndLegalAuthorityRelationshipManagementPlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Regulatory And Legal Authority Relationship ManagementPlan 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanDescription
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanDescription() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanDescription;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanDescription(String regulatoryAndLegalAuthorityRelationshipManagementPlanDescription) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanDescription = regulatoryAndLegalAuthorityRelationshipManagementPlanDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory And Legal Authority Relationship ManagementPlan instance retrieve service call 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskReference = regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskRecord
  **/

  public Object getRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskRecord() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskRecord;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskRecord(Object regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskRecord) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskRecord = regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionResponse
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionResponse() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionResponse;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionResponse(String regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionResponse) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionResponse = regulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveActionResponse;
  }


  /**
   * Get regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord
  **/

  public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord(CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReportRecord;
  }


  /**
   * Get regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis
  **/

  public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis(CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModelRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceAnalysis;
  }


}

