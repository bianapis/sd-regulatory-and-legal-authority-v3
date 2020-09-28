/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class RegulatoryAndLegalAuthorityApiController {

	@Autowired
	RegulatoryAndLegalAuthorityApiService service;
	
	@Manage.Activate
	public BianResponse<SDRegulatoryAndLegalAuthorityActivateOutputModel> activate(@RequestBody BianRequest<SDRegulatoryAndLegalAuthorityActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Capture
	public BianResponse<BQTroubleshootingCaptureOutputModel> captureTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Capture
	public BianResponse<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDRegulatoryAndLegalAuthorityConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDRegulatoryAndLegalAuthorityConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Control
	public BianResponse<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Exchange
	public BianResponse<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDRegulatoryAndLegalAuthorityFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDRegulatoryAndLegalAuthorityFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Grant
	public BianResponse<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Initiate
	public BianResponse<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("establishrelations")
	@Manage.Initiate
	public BianResponse<BQEstablishRelationsInitiateOutputModel> initiateEstablishrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQEstablishRelationsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateEstablishrelations(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintainrelations")
	@Manage.Initiate
	public BianResponse<BQMaintainRelationsInitiateOutputModel> initiateMaintainrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQMaintainRelationsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateMaintainrelations(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("representbankinterests")
	@Manage.Initiate
	public BianResponse<BQRepresentBankInterestsInitiateOutputModel> initiateRepresentbankinterests(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQRepresentBankInterestsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateRepresentbankinterests(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Initiate
	public BianResponse<BQTroubleshootingInitiateOutputModel> initiateTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTroubleshootingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTroubleshooting(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("establishrelations")
	@Manage.Request
	public BianResponse<BQEstablishRelationsRequestOutputModel> requestEstablishrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEstablishRelationsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestEstablishrelations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintainrelations")
	@Manage.Request
	public BianResponse<BQMaintainRelationsRequestOutputModel> requestMaintainrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintainRelationsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMaintainrelations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("representbankinterests")
	@Manage.Request
	public BianResponse<BQRepresentBankInterestsRequestOutputModel> requestRepresentbankinterests(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRepresentBankInterestsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestRepresentbankinterests(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Request
	public BianResponse<BQTroubleshootingRequestOutputModel> requestTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Request
	public BianResponse<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Retrieve
	public BianResponse<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("establishrelations")
	@Manage.Retrieve
	public BianResponse<BQEstablishRelationsRetrieveOutputModel> retrieveEstablishrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEstablishrelations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("maintainrelations")
	@Manage.Retrieve
	public BianResponse<BQMaintainRelationsRetrieveOutputModel> retrieveMaintainrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintainrelations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("representbankinterests")
	@Manage.Retrieve
	public BianResponse<BQRepresentBankInterestsRetrieveOutputModel> retrieveRepresentbankinterests(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRepresentbankinterests(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("troubleshooting")
	@Manage.Retrieve
	public BianResponse<BQTroubleshootingRetrieveOutputModel> retrieveTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDRegulatoryAndLegalAuthorityRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("establishrelations")
	@Manage.Update
	public BianResponse<BQEstablishRelationsUpdateOutputModel> updateEstablishrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEstablishRelationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateEstablishrelations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintainrelations")
	@Manage.Update
	public BianResponse<BQMaintainRelationsUpdateOutputModel> updateMaintainrelations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintainRelationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMaintainrelations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("representbankinterests")
	@Manage.Update
	public BianResponse<BQRepresentBankInterestsUpdateOutputModel> updateRepresentbankinterests(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRepresentBankInterestsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRepresentbankinterests(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("troubleshooting")
	@Manage.Update
	public BianResponse<BQTroubleshootingUpdateOutputModel> updateTroubleshooting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTroubleshootingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTroubleshooting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
