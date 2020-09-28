package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeOutputModel
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeOutputModel   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskReference = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskRecord = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory And Legal Authority Relationship ManagementPlan instance exchange service call 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskReference = regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskRecord
  **/

  public Object getRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskRecord() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskRecord;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskRecord(Object regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskRecord) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskRecord = regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionResponse
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionResponse() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionResponse;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionResponse(String regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionResponse) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionResponse = regulatoryAndLegalAuthorityRelationshipManagementPlanExchangeActionResponse;
  }


}

