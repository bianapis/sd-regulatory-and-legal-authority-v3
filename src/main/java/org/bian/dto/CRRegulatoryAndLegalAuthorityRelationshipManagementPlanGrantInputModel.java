package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModel
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModel   {
  private String regulatoryAndLegalAuthorityServicingSessionReference = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanReference = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanDescription = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord
  **/

  public Object getRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord(Object regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord = regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

