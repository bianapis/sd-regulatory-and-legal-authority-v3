/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface RegulatoryAndLegalAuthorityApiService {

	SDRegulatoryAndLegalAuthorityActivateOutputModel activate(SDRegulatoryAndLegalAuthorityActivateInputModel request);
	
	BQTroubleshootingCaptureOutputModel captureTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingCaptureInputModel request);
	
	CRRegulatoryAndLegalAuthorityRelationshipManagementPlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanCaptureInputModel request);
	
	SDRegulatoryAndLegalAuthorityConfigureOutputModel configure(String sdReferenceId, SDRegulatoryAndLegalAuthorityConfigureInputModel request);
	
	CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlInputModel request);
	
	CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeInputModel request);
	
	SDRegulatoryAndLegalAuthorityFeedbackOutputModel feedback(String sdReferenceId, SDRegulatoryAndLegalAuthorityFeedbackInputModel request);
	
	CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModel request);
	
	CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateOutputModel initiate(String sdReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateInputModel request);
	
	BQEstablishRelationsInitiateOutputModel initiateEstablishrelations(String sdReferenceId, String crReferenceId, BQEstablishRelationsInitiateInputModel request);
	
	BQMaintainRelationsInitiateOutputModel initiateMaintainrelations(String sdReferenceId, String crReferenceId, BQMaintainRelationsInitiateInputModel request);
	
	BQRepresentBankInterestsInitiateOutputModel initiateRepresentbankinterests(String sdReferenceId, String crReferenceId, BQRepresentBankInterestsInitiateInputModel request);
	
	BQTroubleshootingInitiateOutputModel initiateTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingInitiateInputModel request);
	
	BQEstablishRelationsRequestOutputModel requestEstablishrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEstablishRelationsRequestInputModel request);
	
	BQMaintainRelationsRequestOutputModel requestMaintainrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintainRelationsRequestInputModel request);
	
	BQRepresentBankInterestsRequestOutputModel requestRepresentbankinterests(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepresentBankInterestsRequestInputModel request);
	
	BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request);
	
	CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestInputModel request);
	
	CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQEstablishRelationsRetrieveOutputModel retrieveEstablishrelations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintainRelationsRetrieveOutputModel retrieveMaintainrelations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRepresentBankInterestsRetrieveOutputModel retrieveRepresentbankinterests(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDRegulatoryAndLegalAuthorityRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRRegulatoryAndLegalAuthorityRelationshipManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanUpdateInputModel request);
	
	BQEstablishRelationsUpdateOutputModel updateEstablishrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEstablishRelationsUpdateInputModel request);
	
	BQMaintainRelationsUpdateOutputModel updateMaintainrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintainRelationsUpdateInputModel request);
	
	BQRepresentBankInterestsUpdateOutputModel updateRepresentbankinterests(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepresentBankInterestsUpdateInputModel request);
	
	BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request);
	
}
