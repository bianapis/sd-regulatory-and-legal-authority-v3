package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceAnalysis;
import org.bian.dto.BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintainRelationsRetrieveOutputModel
 */
public class BQMaintainRelationsRetrieveOutputModel   {
  private String maintainRelationsPreconditions = null;

  private String maintainRelationsBusinessUnitEmployeeReference = null;

  private String maintainRelationsWorkSchedule = null;

  private String maintainRelationsPostconditions = null;

  private String maintainRelationsMaintainRelationsServiceType = null;

  private String maintainRelationsMaintainRelationsServiceDescription = null;

  private String maintainRelationsMaintainRelationsServiceInputsandOuputs = null;

  private String maintainRelationsMaintainRelationsServiceWorkProduct = null;

  private String maintainRelationsMaintainRelationsServiceName = null;

  private String maintainRelationsRetrieveActionTaskReference = null;

  private Object maintainRelationsRetrieveActionTaskRecord = null;

  private String maintainRelationsRetrieveActionResponse = null;

  private BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceReport maintainRelationsInstanceReport = null;

  private BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceAnalysis maintainRelationsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintain Relations instance retrieve service call 
   * @return maintainRelationsRetrieveActionTaskReference
  **/

  public String getMaintainRelationsRetrieveActionTaskReference() {
    return maintainRelationsRetrieveActionTaskReference;
  }

  public void setMaintainRelationsRetrieveActionTaskReference(String maintainRelationsRetrieveActionTaskReference) {
    this.maintainRelationsRetrieveActionTaskReference = maintainRelationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return maintainRelationsRetrieveActionTaskRecord
  **/

  public Object getMaintainRelationsRetrieveActionTaskRecord() {
    return maintainRelationsRetrieveActionTaskRecord;
  }

  public void setMaintainRelationsRetrieveActionTaskRecord(Object maintainRelationsRetrieveActionTaskRecord) {
    this.maintainRelationsRetrieveActionTaskRecord = maintainRelationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return maintainRelationsRetrieveActionResponse
  **/

  public String getMaintainRelationsRetrieveActionResponse() {
    return maintainRelationsRetrieveActionResponse;
  }

  public void setMaintainRelationsRetrieveActionResponse(String maintainRelationsRetrieveActionResponse) {
    this.maintainRelationsRetrieveActionResponse = maintainRelationsRetrieveActionResponse;
  }


  /**
   * Get maintainRelationsInstanceReport
   * @return maintainRelationsInstanceReport
  **/

  public BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceReport getMaintainRelationsInstanceReport() {
    return maintainRelationsInstanceReport;
  }

  public void setMaintainRelationsInstanceReport(BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceReport maintainRelationsInstanceReport) {
    this.maintainRelationsInstanceReport = maintainRelationsInstanceReport;
  }


  /**
   * Get maintainRelationsInstanceAnalysis
   * @return maintainRelationsInstanceAnalysis
  **/

  public BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceAnalysis getMaintainRelationsInstanceAnalysis() {
    return maintainRelationsInstanceAnalysis;
  }

  public void setMaintainRelationsInstanceAnalysis(BQMaintainRelationsRetrieveOutputModelMaintainRelationsInstanceAnalysis maintainRelationsInstanceAnalysis) {
    this.maintainRelationsInstanceAnalysis = maintainRelationsInstanceAnalysis;
  }


}

