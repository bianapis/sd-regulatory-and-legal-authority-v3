package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceAnalysis;
import org.bian.dto.BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEstablishRelationsRetrieveOutputModel
 */
public class BQEstablishRelationsRetrieveOutputModel   {
  private String establishRelationsPreconditions = null;

  private String establishRelationsBusinessUnitEmployeeReference = null;

  private String establishRelationsWorkSchedule = null;

  private String establishRelationsPostconditions = null;

  private String establishRelationsEstablishRelationsServiceType = null;

  private String establishRelationsEstablishRelationsServiceDescription = null;

  private String establishRelationsEstablishRelationsServiceInputsandOuputs = null;

  private String establishRelationsEstablishRelationsServiceWorkProduct = null;

  private String establishRelationsEstablishRelationsServiceName = null;

  private String establishRelationsRetrieveActionTaskReference = null;

  private Object establishRelationsRetrieveActionTaskRecord = null;

  private String establishRelationsRetrieveActionResponse = null;

  private BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceReport establishRelationsInstanceReport = null;

  private BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceAnalysis establishRelationsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the duty/obligation can be met 
   * @return establishRelationsPreconditions
  **/

  public String getEstablishRelationsPreconditions() {
    return establishRelationsPreconditions;
  }

  public void setEstablishRelationsPreconditions(String establishRelationsPreconditions) {
    this.establishRelationsPreconditions = establishRelationsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for undertaking the duty 
   * @return establishRelationsBusinessUnitEmployeeReference
  **/

  public String getEstablishRelationsBusinessUnitEmployeeReference() {
    return establishRelationsBusinessUnitEmployeeReference;
  }

  public void setEstablishRelationsBusinessUnitEmployeeReference(String establishRelationsBusinessUnitEmployeeReference) {
    this.establishRelationsBusinessUnitEmployeeReference = establishRelationsBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in fulfilling the duty 
   * @return establishRelationsWorkSchedule
  **/

  public String getEstablishRelationsWorkSchedule() {
    return establishRelationsWorkSchedule;
  }

  public void setEstablishRelationsWorkSchedule(String establishRelationsWorkSchedule) {
    this.establishRelationsWorkSchedule = establishRelationsWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently) 
   * @return establishRelationsPostconditions
  **/

  public String getEstablishRelationsPostconditions() {
    return establishRelationsPostconditions;
  }

  public void setEstablishRelationsPostconditions(String establishRelationsPostconditions) {
    this.establishRelationsPostconditions = establishRelationsPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return establishRelationsEstablishRelationsServiceType
  **/

  public String getEstablishRelationsEstablishRelationsServiceType() {
    return establishRelationsEstablishRelationsServiceType;
  }

  public void setEstablishRelationsEstablishRelationsServiceType(String establishRelationsEstablishRelationsServiceType) {
    this.establishRelationsEstablishRelationsServiceType = establishRelationsEstablishRelationsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return establishRelationsEstablishRelationsServiceDescription
  **/

  public String getEstablishRelationsEstablishRelationsServiceDescription() {
    return establishRelationsEstablishRelationsServiceDescription;
  }

  public void setEstablishRelationsEstablishRelationsServiceDescription(String establishRelationsEstablishRelationsServiceDescription) {
    this.establishRelationsEstablishRelationsServiceDescription = establishRelationsEstablishRelationsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return establishRelationsEstablishRelationsServiceInputsandOuputs
  **/

  public String getEstablishRelationsEstablishRelationsServiceInputsandOuputs() {
    return establishRelationsEstablishRelationsServiceInputsandOuputs;
  }

  public void setEstablishRelationsEstablishRelationsServiceInputsandOuputs(String establishRelationsEstablishRelationsServiceInputsandOuputs) {
    this.establishRelationsEstablishRelationsServiceInputsandOuputs = establishRelationsEstablishRelationsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return establishRelationsEstablishRelationsServiceWorkProduct
  **/

  public String getEstablishRelationsEstablishRelationsServiceWorkProduct() {
    return establishRelationsEstablishRelationsServiceWorkProduct;
  }

  public void setEstablishRelationsEstablishRelationsServiceWorkProduct(String establishRelationsEstablishRelationsServiceWorkProduct) {
    this.establishRelationsEstablishRelationsServiceWorkProduct = establishRelationsEstablishRelationsServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return establishRelationsEstablishRelationsServiceName
  **/

  public String getEstablishRelationsEstablishRelationsServiceName() {
    return establishRelationsEstablishRelationsServiceName;
  }

  public void setEstablishRelationsEstablishRelationsServiceName(String establishRelationsEstablishRelationsServiceName) {
    this.establishRelationsEstablishRelationsServiceName = establishRelationsEstablishRelationsServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Establish Relations instance retrieve service call 
   * @return establishRelationsRetrieveActionTaskReference
  **/

  public String getEstablishRelationsRetrieveActionTaskReference() {
    return establishRelationsRetrieveActionTaskReference;
  }

  public void setEstablishRelationsRetrieveActionTaskReference(String establishRelationsRetrieveActionTaskReference) {
    this.establishRelationsRetrieveActionTaskReference = establishRelationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return establishRelationsRetrieveActionTaskRecord
  **/

  public Object getEstablishRelationsRetrieveActionTaskRecord() {
    return establishRelationsRetrieveActionTaskRecord;
  }

  public void setEstablishRelationsRetrieveActionTaskRecord(Object establishRelationsRetrieveActionTaskRecord) {
    this.establishRelationsRetrieveActionTaskRecord = establishRelationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return establishRelationsRetrieveActionResponse
  **/

  public String getEstablishRelationsRetrieveActionResponse() {
    return establishRelationsRetrieveActionResponse;
  }

  public void setEstablishRelationsRetrieveActionResponse(String establishRelationsRetrieveActionResponse) {
    this.establishRelationsRetrieveActionResponse = establishRelationsRetrieveActionResponse;
  }


  /**
   * Get establishRelationsInstanceReport
   * @return establishRelationsInstanceReport
  **/

  public BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceReport getEstablishRelationsInstanceReport() {
    return establishRelationsInstanceReport;
  }

  public void setEstablishRelationsInstanceReport(BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceReport establishRelationsInstanceReport) {
    this.establishRelationsInstanceReport = establishRelationsInstanceReport;
  }


  /**
   * Get establishRelationsInstanceAnalysis
   * @return establishRelationsInstanceAnalysis
  **/

  public BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceAnalysis getEstablishRelationsInstanceAnalysis() {
    return establishRelationsInstanceAnalysis;
  }

  public void setEstablishRelationsInstanceAnalysis(BQEstablishRelationsRetrieveOutputModelEstablishRelationsInstanceAnalysis establishRelationsInstanceAnalysis) {
    this.establishRelationsInstanceAnalysis = establishRelationsInstanceAnalysis;
  }


}

