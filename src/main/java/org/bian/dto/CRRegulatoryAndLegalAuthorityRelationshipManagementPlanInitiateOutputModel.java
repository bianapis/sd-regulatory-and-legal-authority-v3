package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateOutputModel
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateOutputModel   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionReference = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Regulatory And Legal Authority Relationship ManagementPlan instance 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionReference = regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord
  **/

  public Object getRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord(Object regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord = regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Regulatory And Legal Authority Relationship ManagementPlan instance (e.g. initialised, pending, active) 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus;
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


}

