package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordRegulatoryAndLegalAuthorityActivityAnalysis;
import org.bian.dto.SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordRegulatoryAndLegalAuthorityPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecord
 */
public class SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecord   {
  private SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordRegulatoryAndLegalAuthorityActivityAnalysis regulatoryAndLegalAuthorityActivityAnalysis = null;

  private SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordRegulatoryAndLegalAuthorityPerformanceAnalysis regulatoryAndLegalAuthorityPerformanceAnalysis = null;

  private SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get regulatoryAndLegalAuthorityActivityAnalysis
   * @return regulatoryAndLegalAuthorityActivityAnalysis
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordRegulatoryAndLegalAuthorityActivityAnalysis getRegulatoryAndLegalAuthorityActivityAnalysis() {
    return regulatoryAndLegalAuthorityActivityAnalysis;
  }

  public void setRegulatoryAndLegalAuthorityActivityAnalysis(SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordRegulatoryAndLegalAuthorityActivityAnalysis regulatoryAndLegalAuthorityActivityAnalysis) {
    this.regulatoryAndLegalAuthorityActivityAnalysis = regulatoryAndLegalAuthorityActivityAnalysis;
  }


  /**
   * Get regulatoryAndLegalAuthorityPerformanceAnalysis
   * @return regulatoryAndLegalAuthorityPerformanceAnalysis
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordRegulatoryAndLegalAuthorityPerformanceAnalysis getRegulatoryAndLegalAuthorityPerformanceAnalysis() {
    return regulatoryAndLegalAuthorityPerformanceAnalysis;
  }

  public void setRegulatoryAndLegalAuthorityPerformanceAnalysis(SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordRegulatoryAndLegalAuthorityPerformanceAnalysis regulatoryAndLegalAuthorityPerformanceAnalysis) {
    this.regulatoryAndLegalAuthorityPerformanceAnalysis = regulatoryAndLegalAuthorityPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDRegulatoryAndLegalAuthorityRetrieveInputModelRegulatoryAndLegalAuthorityRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

