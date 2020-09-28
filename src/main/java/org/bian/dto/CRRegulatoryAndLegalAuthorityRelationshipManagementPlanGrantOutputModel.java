package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModel
 */
public class CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModel   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = null;

  private String regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskReference = null;

  private Object regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory And Legal Authority Relationship ManagementPlan instance grant service call 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskReference = regulatoryAndLegalAuthorityRelationshipManagementPlanGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

