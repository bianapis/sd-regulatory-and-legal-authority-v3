package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlOutputModel
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlOutputModel   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskReference = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskRecord = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory And Legal Authority Relationship ManagementPlan instance control processing service call 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskReference = regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskRecord
  **/

  public Object getRegulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskRecord() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskRecord;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskRecord(Object regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskRecord) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskRecord = regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionResponse
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanControlActionResponse() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionResponse;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanControlActionResponse(String regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionResponse) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionResponse = regulatoryAndLegalAuthorityRelationshipManagementPlanControlActionResponse;
  }


}

