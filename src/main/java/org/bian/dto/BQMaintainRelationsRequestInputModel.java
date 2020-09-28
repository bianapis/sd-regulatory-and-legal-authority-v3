package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQMaintainRelationsRequestInputModel
 */
public class BQMaintainRelationsRequestInputModel   {
  private String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference = null;

  private String maintainRelationsInstanceReference = null;

  private String maintainRelationsPreconditions = null;

  private String maintainRelationsBusinessUnitEmployeeReference = null;

  private String maintainRelationsWorkSchedule = null;

  private String maintainRelationsPostconditions = null;

  private String maintainRelationsMaintainRelationsServiceType = null;

  private String maintainRelationsMaintainRelationsServiceDescription = null;

  private String maintainRelationsMaintainRelationsServiceInputsandOuputs = null;

  private String maintainRelationsMaintainRelationsServiceWorkProduct = null;

  private String maintainRelationsMaintainRelationsServiceName = null;

  private Object maintainRelationsRequestActionTaskRecord = null;

  private CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Regulatory And Legal Authority Relationship ManagementPlan instance 
   * @return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference
  **/

  public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference() {
    return regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference;
  }

  public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference(String regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference) {
    this.regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference = regulatoryAndLegalAuthorityRelationshipManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintain Relations instance 
   * @return maintainRelationsInstanceReference
  **/

  public String getMaintainRelationsInstanceReference() {
    return maintainRelationsInstanceReference;
  }

  public void setMaintainRelationsInstanceReference(String maintainRelationsInstanceReference) {
    this.maintainRelationsInstanceReference = maintainRelationsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the duty/obligation can be met 
   * @return maintainRelationsPreconditions
  **/

  public String getMaintainRelationsPreconditions() {
    return maintainRelationsPreconditions;
  }

  public void setMaintainRelationsPreconditions(String maintainRelationsPreconditions) {
    this.maintainRelationsPreconditions = maintainRelationsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for undertaking the duty 
   * @return maintainRelationsBusinessUnitEmployeeReference
  **/

  public String getMaintainRelationsBusinessUnitEmployeeReference() {
    return maintainRelationsBusinessUnitEmployeeReference;
  }

  public void setMaintainRelationsBusinessUnitEmployeeReference(String maintainRelationsBusinessUnitEmployeeReference) {
    this.maintainRelationsBusinessUnitEmployeeReference = maintainRelationsBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in fulfilling the duty 
   * @return maintainRelationsWorkSchedule
  **/

  public String getMaintainRelationsWorkSchedule() {
    return maintainRelationsWorkSchedule;
  }

  public void setMaintainRelationsWorkSchedule(String maintainRelationsWorkSchedule) {
    this.maintainRelationsWorkSchedule = maintainRelationsWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently) 
   * @return maintainRelationsPostconditions
  **/

  public String getMaintainRelationsPostconditions() {
    return maintainRelationsPostconditions;
  }

  public void setMaintainRelationsPostconditions(String maintainRelationsPostconditions) {
    this.maintainRelationsPostconditions = maintainRelationsPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return maintainRelationsMaintainRelationsServiceType
  **/

  public String getMaintainRelationsMaintainRelationsServiceType() {
    return maintainRelationsMaintainRelationsServiceType;
  }

  public void setMaintainRelationsMaintainRelationsServiceType(String maintainRelationsMaintainRelationsServiceType) {
    this.maintainRelationsMaintainRelationsServiceType = maintainRelationsMaintainRelationsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return maintainRelationsMaintainRelationsServiceDescription
  **/

  public String getMaintainRelationsMaintainRelationsServiceDescription() {
    return maintainRelationsMaintainRelationsServiceDescription;
  }

  public void setMaintainRelationsMaintainRelationsServiceDescription(String maintainRelationsMaintainRelationsServiceDescription) {
    this.maintainRelationsMaintainRelationsServiceDescription = maintainRelationsMaintainRelationsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return maintainRelationsMaintainRelationsServiceInputsandOuputs
  **/

  public String getMaintainRelationsMaintainRelationsServiceInputsandOuputs() {
    return maintainRelationsMaintainRelationsServiceInputsandOuputs;
  }

  public void setMaintainRelationsMaintainRelationsServiceInputsandOuputs(String maintainRelationsMaintainRelationsServiceInputsandOuputs) {
    this.maintainRelationsMaintainRelationsServiceInputsandOuputs = maintainRelationsMaintainRelationsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return maintainRelationsMaintainRelationsServiceWorkProduct
  **/

  public String getMaintainRelationsMaintainRelationsServiceWorkProduct() {
    return maintainRelationsMaintainRelationsServiceWorkProduct;
  }

  public void setMaintainRelationsMaintainRelationsServiceWorkProduct(String maintainRelationsMaintainRelationsServiceWorkProduct) {
    this.maintainRelationsMaintainRelationsServiceWorkProduct = maintainRelationsMaintainRelationsServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return maintainRelationsMaintainRelationsServiceName
  **/

  public String getMaintainRelationsMaintainRelationsServiceName() {
    return maintainRelationsMaintainRelationsServiceName;
  }

  public void setMaintainRelationsMaintainRelationsServiceName(String maintainRelationsMaintainRelationsServiceName) {
    this.maintainRelationsMaintainRelationsServiceName = maintainRelationsMaintainRelationsServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return maintainRelationsRequestActionTaskRecord
  **/

  public Object getMaintainRelationsRequestActionTaskRecord() {
    return maintainRelationsRequestActionTaskRecord;
  }

  public void setMaintainRelationsRequestActionTaskRecord(Object maintainRelationsRequestActionTaskRecord) {
    this.maintainRelationsRequestActionTaskRecord = maintainRelationsRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

