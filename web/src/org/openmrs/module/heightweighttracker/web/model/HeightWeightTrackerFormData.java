package org.openmrs.module.heightweighttracker.web.model;

import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;
import org.openmrs.module.heightweighttracker.impl.pih.HeightWeightTrackerObsMapper;
import org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary;
import org.openmrs.module.heightweighttracker.impl.pih.WHOMapping;

public class HeightWeightTrackerFormData extends FormDataModel {
	
	public static final String FormatDate_General = "dd/MM/yyyy";
	public static final String DateTextPlaceHolder = "__/__/____";
	
	private WHOMapping whoMapping = null;
	
	protected HeightWeightTrackerObsMapper obsMapper;

	public HeightWeightTrackerFormData(Patient p) {
		setPatient(p);
		obsMapper = new HeightWeightTrackerObsMapper(p);
	}
	
	public HeightWeightTrackerObsMapper getObsMapper() {
		return obsMapper;
	}

	public String getGender()
	{
		return getPatient().getGender();
	}
    
    public WHOMapping getWhoMapping()
    {
    	if(whoMapping == null)
    	{
    		whoMapping = new WHOMapping();
    	}
    	
    	return whoMapping;
    }
    
    public int getVisitFormId()
    {
    	return ConceptDictionary.NEW_FORM;
    }
    
    public String getImbId() {
		PatientIdentifier identifier = getPatient().getPatientIdentifier(ConceptDictionary.PatientIdentiferId_IMB);
		
		if((identifier == null || identifier.getIdentifier() == null) && ConceptDictionary.PatientIdentiferId_PC > 0)
		{
			identifier = getPatient().getPatientIdentifier(ConceptDictionary.PatientIdentiferId_PC);
		}
		
		if(identifier != null)
			return identifier.getIdentifier();
		
		return "";
	}
}
