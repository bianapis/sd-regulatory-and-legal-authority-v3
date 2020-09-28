package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepresentBankInterestsRequestOutputModel
 */
public class BQRepresentBankInterestsRequestOutputModel   {
  private String representBankInterestsPreconditions = null;

  private String representBankInterestsBusinessUnitEmployeeReference = null;

  private String representBankInterestsWorkSchedule = null;

  private String businessService = null;

  private String representBankInterestsPostconditions = null;

  private String representBankInterestsServiceType = null;

  private String representBankInterestsServiceDescription = null;

  private String representBankInterestsServiceInputsandOuputs = null;

  private String representBankInterestsServiceWorkProduct = null;

  private String representBankInterestsRequestActionTaskReference = null;

  private Object representBankInterestsRequestActionTaskRecord = null;

  private String representBankInterestsRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the duty/obligation can be met 
   * @return representBankInterestsPreconditions
  **/

  public String getRepresentBankInterestsPreconditions() {
    return representBankInterestsPreconditions;
  }

  public void setRepresentBankInterestsPreconditions(String representBankInterestsPreconditions) {
    this.representBankInterestsPreconditions = representBankInterestsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for undertaking the duty 
   * @return representBankInterestsBusinessUnitEmployeeReference
  **/

  public String getRepresentBankInterestsBusinessUnitEmployeeReference() {
    return representBankInterestsBusinessUnitEmployeeReference;
  }

  public void setRepresentBankInterestsBusinessUnitEmployeeReference(String representBankInterestsBusinessUnitEmployeeReference) {
    this.representBankInterestsBusinessUnitEmployeeReference = representBankInterestsBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in fulfilling the duty 
   * @return representBankInterestsWorkSchedule
  **/

  public String getRepresentBankInterestsWorkSchedule() {
    return representBankInterestsWorkSchedule;
  }

  public void setRepresentBankInterestsWorkSchedule(String representBankInterestsWorkSchedule) {
    this.representBankInterestsWorkSchedule = representBankInterestsWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Regulatory And Legal Authority Relationship ManagementPlan specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently) 
   * @return representBankInterestsPostconditions
  **/

  public String getRepresentBankInterestsPostconditions() {
    return representBankInterestsPostconditions;
  }

  public void setRepresentBankInterestsPostconditions(String representBankInterestsPostconditions) {
    this.representBankInterestsPostconditions = representBankInterestsPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return representBankInterestsServiceType
  **/

  public String getRepresentBankInterestsServiceType() {
    return representBankInterestsServiceType;
  }

  public void setRepresentBankInterestsServiceType(String representBankInterestsServiceType) {
    this.representBankInterestsServiceType = representBankInterestsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return representBankInterestsServiceDescription
  **/

  public String getRepresentBankInterestsServiceDescription() {
    return representBankInterestsServiceDescription;
  }

  public void setRepresentBankInterestsServiceDescription(String representBankInterestsServiceDescription) {
    this.representBankInterestsServiceDescription = representBankInterestsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return representBankInterestsServiceInputsandOuputs
  **/

  public String getRepresentBankInterestsServiceInputsandOuputs() {
    return representBankInterestsServiceInputsandOuputs;
  }

  public void setRepresentBankInterestsServiceInputsandOuputs(String representBankInterestsServiceInputsandOuputs) {
    this.representBankInterestsServiceInputsandOuputs = representBankInterestsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return representBankInterestsServiceWorkProduct
  **/

  public String getRepresentBankInterestsServiceWorkProduct() {
    return representBankInterestsServiceWorkProduct;
  }

  public void setRepresentBankInterestsServiceWorkProduct(String representBankInterestsServiceWorkProduct) {
    this.representBankInterestsServiceWorkProduct = representBankInterestsServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Represent Bank Interests instance request service call 
   * @return representBankInterestsRequestActionTaskReference
  **/

  public String getRepresentBankInterestsRequestActionTaskReference() {
    return representBankInterestsRequestActionTaskReference;
  }

  public void setRepresentBankInterestsRequestActionTaskReference(String representBankInterestsRequestActionTaskReference) {
    this.representBankInterestsRequestActionTaskReference = representBankInterestsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return representBankInterestsRequestActionTaskRecord
  **/

  public Object getRepresentBankInterestsRequestActionTaskRecord() {
    return representBankInterestsRequestActionTaskRecord;
  }

  public void setRepresentBankInterestsRequestActionTaskRecord(Object representBankInterestsRequestActionTaskRecord) {
    this.representBankInterestsRequestActionTaskRecord = representBankInterestsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Represent Bank Interests service request record 
   * @return representBankInterestsRequestRecordReference
  **/

  public String getRepresentBankInterestsRequestRecordReference() {
    return representBankInterestsRequestRecordReference;
  }

  public void setRepresentBankInterestsRequestRecordReference(String representBankInterestsRequestRecordReference) {
    this.representBankInterestsRequestRecordReference = representBankInterestsRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

