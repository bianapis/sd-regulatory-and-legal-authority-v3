package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityFeedbackInputModelRegulatoryAndLegalAuthorityFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityFeedbackInputModel
 */
public class SDRegulatoryAndLegalAuthorityFeedbackInputModel   {
  private Object regulatoryAndLegalAuthorityFeedbackActionTaskRecord = null;

  private SDRegulatoryAndLegalAuthorityFeedbackInputModelRegulatoryAndLegalAuthorityFeedbackActionRecord regulatoryAndLegalAuthorityFeedbackActionRecord = null;


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

  public SDRegulatoryAndLegalAuthorityFeedbackInputModelRegulatoryAndLegalAuthorityFeedbackActionRecord getRegulatoryAndLegalAuthorityFeedbackActionRecord() {
    return regulatoryAndLegalAuthorityFeedbackActionRecord;
  }

  public void setRegulatoryAndLegalAuthorityFeedbackActionRecord(SDRegulatoryAndLegalAuthorityFeedbackInputModelRegulatoryAndLegalAuthorityFeedbackActionRecord regulatoryAndLegalAuthorityFeedbackActionRecord) {
    this.regulatoryAndLegalAuthorityFeedbackActionRecord = regulatoryAndLegalAuthorityFeedbackActionRecord;
  }


}

