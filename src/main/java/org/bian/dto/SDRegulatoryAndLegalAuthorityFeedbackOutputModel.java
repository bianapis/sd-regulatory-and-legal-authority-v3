package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityFeedbackOutputModelRegulatoryAndLegalAuthorityFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityFeedbackOutputModel
 */
public class SDRegulatoryAndLegalAuthorityFeedbackOutputModel   {
  private String regulatoryAndLegalAuthorityFeedbackActionTaskReference = null;

  private Object regulatoryAndLegalAuthorityFeedbackActionTaskRecord = null;

  private SDRegulatoryAndLegalAuthorityFeedbackOutputModelRegulatoryAndLegalAuthorityFeedbackActionRecord regulatoryAndLegalAuthorityFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return regulatoryAndLegalAuthorityFeedbackActionTaskReference
  **/

  public String getRegulatoryAndLegalAuthorityFeedbackActionTaskReference() {
    return regulatoryAndLegalAuthorityFeedbackActionTaskReference;
  }

  public void setRegulatoryAndLegalAuthorityFeedbackActionTaskReference(String regulatoryAndLegalAuthorityFeedbackActionTaskReference) {
    this.regulatoryAndLegalAuthorityFeedbackActionTaskReference = regulatoryAndLegalAuthorityFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return regulatoryAndLegalAuthorityFeedbackActionTaskRecord
  **/

  public Object getRegulatoryAndLegalAuthorityFeedbackActionTaskRecord() {
    return regulatoryAndLegalAuthorityFeedbackActionTaskRecord;
  }

  public void setRegulatoryAndLegalAuthorityFeedbackActionTaskRecord(Object regulatoryAndLegalAuthorityFeedbackActionTaskRecord) {
    this.regulatoryAndLegalAuthorityFeedbackActionTaskRecord = regulatoryAndLegalAuthorityFeedbackActionTaskRecord;
  }


  /**
   * Get regulatoryAndLegalAuthorityFeedbackActionRecord
   * @return regulatoryAndLegalAuthorityFeedbackActionRecord
  **/

  public SDRegulatoryAndLegalAuthorityFeedbackOutputModelRegulatoryAndLegalAuthorityFeedbackActionRecord getRegulatoryAndLegalAuthorityFeedbackActionRecord() {
    return regulatoryAndLegalAuthorityFeedbackActionRecord;
  }

  public void setRegulatoryAndLegalAuthorityFeedbackActionRecord(SDRegulatoryAndLegalAuthorityFeedbackOutputModelRegulatoryAndLegalAuthorityFeedbackActionRecord regulatoryAndLegalAuthorityFeedbackActionRecord) {
    this.regulatoryAndLegalAuthorityFeedbackActionRecord = regulatoryAndLegalAuthorityFeedbackActionRecord;
  }


}

