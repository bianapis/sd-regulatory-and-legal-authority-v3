/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class RegulatoryAndLegalAuthorityApiServiceImpl implements RegulatoryAndLegalAuthorityApiService {

	public SDRegulatoryAndLegalAuthorityActivateOutputModel activate(SDRegulatoryAndLegalAuthorityActivateInputModel request){
		return JsonReader.read("activate-SDRegulatoryAndLegalAuthorityActivateOutputModel.json",new TypeReference<SDRegulatoryAndLegalAuthorityActivateOutputModel>(){});
	}
	
	public BQTroubleshootingCaptureOutputModel captureTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingCaptureInputModel request){
		return JsonReader.read("capture-BQTroubleshootingCaptureOutputModel.json",new TypeReference<BQTroubleshootingCaptureOutputModel>(){});
	}
	
	public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanCaptureInputModel request){
		return JsonReader.read("capture-CRRegulatoryAndLegalAuthorityRelationshipManagementPlanCaptureOutputModel.json",new TypeReference<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanCaptureOutputModel>(){});
	}
	
	public SDRegulatoryAndLegalAuthorityConfigureOutputModel configure(String sdReferenceId, SDRegulatoryAndLegalAuthorityConfigureInputModel request){
		return JsonReader.read("configure-SDRegulatoryAndLegalAuthorityConfigureOutputModel.json",new TypeReference<SDRegulatoryAndLegalAuthorityConfigureOutputModel>(){});
	}
	
	public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlInputModel request){
		return JsonReader.read("control-CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlOutputModel.json",new TypeReference<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanControlOutputModel>(){});
	}
	
	public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeOutputModel.json",new TypeReference<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanExchangeOutputModel>(){});
	}
	
	public SDRegulatoryAndLegalAuthorityFeedbackOutputModel feedback(String sdReferenceId, SDRegulatoryAndLegalAuthorityFeedbackInputModel request){
		return JsonReader.read("feedback-SDRegulatoryAndLegalAuthorityFeedbackOutputModel.json",new TypeReference<SDRegulatoryAndLegalAuthorityFeedbackOutputModel>(){});
	}
	
	public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModel.json",new TypeReference<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanGrantOutputModel>(){});
	}
	
	public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateOutputModel initiate(String sdReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateInputModel request){
		return JsonReader.read("initiate-CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateOutputModel.json",new TypeReference<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanInitiateOutputModel>(){});
	}
	
	public BQEstablishRelationsInitiateOutputModel initiateEstablishrelations(String sdReferenceId, String crReferenceId, BQEstablishRelationsInitiateInputModel request){
		return JsonReader.read("initiate-BQEstablishRelationsInitiateOutputModel.json",new TypeReference<BQEstablishRelationsInitiateOutputModel>(){});
	}
	
	public BQMaintainRelationsInitiateOutputModel initiateMaintainrelations(String sdReferenceId, String crReferenceId, BQMaintainRelationsInitiateInputModel request){
		return JsonReader.read("initiate-BQMaintainRelationsInitiateOutputModel.json",new TypeReference<BQMaintainRelationsInitiateOutputModel>(){});
	}
	
	public BQRepresentBankInterestsInitiateOutputModel initiateRepresentbankinterests(String sdReferenceId, String crReferenceId, BQRepresentBankInterestsInitiateInputModel request){
		return JsonReader.read("initiate-BQRepresentBankInterestsInitiateOutputModel.json",new TypeReference<BQRepresentBankInterestsInitiateOutputModel>(){});
	}
	
	public BQTroubleshootingInitiateOutputModel initiateTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingInitiateInputModel request){
		return JsonReader.read("initiate-BQTroubleshootingInitiateOutputModel.json",new TypeReference<BQTroubleshootingInitiateOutputModel>(){});
	}
	
	public BQEstablishRelationsRequestOutputModel requestEstablishrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEstablishRelationsRequestInputModel request){
		return JsonReader.read("request-BQEstablishRelationsRequestOutputModel.json",new TypeReference<BQEstablishRelationsRequestOutputModel>(){});
	}
	
	public BQMaintainRelationsRequestOutputModel requestMaintainrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintainRelationsRequestInputModel request){
		return JsonReader.read("request-BQMaintainRelationsRequestOutputModel.json",new TypeReference<BQMaintainRelationsRequestOutputModel>(){});
	}
	
	public BQRepresentBankInterestsRequestOutputModel requestRepresentbankinterests(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepresentBankInterestsRequestInputModel request){
		return JsonReader.read("request-BQRepresentBankInterestsRequestOutputModel.json",new TypeReference<BQRepresentBankInterestsRequestOutputModel>(){});
	}
	
	public BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request){
		return JsonReader.read("request-BQTroubleshootingRequestOutputModel.json",new TypeReference<BQTroubleshootingRequestOutputModel>(){});
	}
	
	public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestOutputModel.json",new TypeReference<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRequestOutputModel>(){});
	}
	
	public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModel.json",new TypeReference<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQEstablishRelationsRetrieveOutputModel retrieveEstablishrelations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQEstablishRelationsRetrieveOutputModel.json",new TypeReference<BQEstablishRelationsRetrieveOutputModel>(){});
	}
	
	public BQMaintainRelationsRetrieveOutputModel retrieveMaintainrelations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintainRelationsRetrieveOutputModel.json",new TypeReference<BQMaintainRelationsRetrieveOutputModel>(){});
	}
	
	public BQRepresentBankInterestsRetrieveOutputModel retrieveRepresentbankinterests(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRepresentBankInterestsRetrieveOutputModel.json",new TypeReference<BQRepresentBankInterestsRetrieveOutputModel>(){});
	}
	
	public BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTroubleshootingRetrieveOutputModel.json",new TypeReference<BQTroubleshootingRetrieveOutputModel>(){});
	}
	
	public SDRegulatoryAndLegalAuthorityRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDRegulatoryAndLegalAuthorityRetrieveOutputModel.json",new TypeReference<SDRegulatoryAndLegalAuthorityRetrieveOutputModel>(){});
	}
	
	public CRRegulatoryAndLegalAuthorityRelationshipManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRegulatoryAndLegalAuthorityRelationshipManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRRegulatoryAndLegalAuthorityRelationshipManagementPlanUpdateOutputModel.json",new TypeReference<CRRegulatoryAndLegalAuthorityRelationshipManagementPlanUpdateOutputModel>(){});
	}
	
	public BQEstablishRelationsUpdateOutputModel updateEstablishrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEstablishRelationsUpdateInputModel request){
		return JsonReader.read("update-BQEstablishRelationsUpdateOutputModel.json",new TypeReference<BQEstablishRelationsUpdateOutputModel>(){});
	}
	
	public BQMaintainRelationsUpdateOutputModel updateMaintainrelations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintainRelationsUpdateInputModel request){
		return JsonReader.read("update-BQMaintainRelationsUpdateOutputModel.json",new TypeReference<BQMaintainRelationsUpdateOutputModel>(){});
	}
	
	public BQRepresentBankInterestsUpdateOutputModel updateRepresentbankinterests(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepresentBankInterestsUpdateInputModel request){
		return JsonReader.read("update-BQRepresentBankInterestsUpdateOutputModel.json",new TypeReference<BQRepresentBankInterestsUpdateOutputModel>(){});
	}
	
	public BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request){
		return JsonReader.read("update-BQTroubleshootingUpdateOutputModel.json",new TypeReference<BQTroubleshootingUpdateOutputModel>(){});
	}
	
}
