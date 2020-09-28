package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateInputModel
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateInputModel   {
  private String regulatoryAndLegalAuthorityServicingSessionReference = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanInitiateActionRecord = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceStatus = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanReference = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanDescription = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return regulatoryAndLegalAuthorityServicingSessionReference
  **/

  public String getRegulatoryAndLegalAuthorityServicingSessionReference() {
    return regulatoryAndLegalAuthorityServicingSessionReference;
  }

  public void setRegulatoryAndLegalAuthorityServicingSessionReference(String regulatoryAndLegalAuthorityServicingSessionReference) {
    this.regulatoryAndLegalAuthorityServicingSessionReference = regulatoryAndLegalAuthorityServicingSessionReference;
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


}

