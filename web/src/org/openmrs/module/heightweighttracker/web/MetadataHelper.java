package org.openmrs.module.heightweighttracker.web;

import java.io.Reader;
import java.io.StringReader;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Concept;
import org.openmrs.EncounterType;
import org.openmrs.Form;
import org.openmrs.PatientIdentifierType;
import org.openmrs.api.context.Context;

public class MetadataHelper {
	
	private static Log log = LogFactory.getLog(MetadataHelper.class);
    
    public static void setupConstants(){
        String gpString = Context.getAdministrationService().getGlobalProperty("heightweighttracker.constants");
        Reader reader = new StringReader(gpString);
        Properties props = new Properties();
        try{
            props.load(reader);
        } catch (Exception ex){
            throw new RuntimeException("invalid values found in global property heightweighttracker.constants, please correct and try again.");
        } finally {
            reader = null;
        }
        if (props.size() > 0){
        
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.HEIGHT_CM  = setup("HEIGHT_CM", props);
            
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.WEIGHT_KG   = setup("WEIGHT_KG", props);
            
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.Z_SCORE_WEIGHT   = setup("Z_SCORE_WEIGHT", props); 
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.Z_SCORE_HEIGHT   = setup("Z_SCORE_HEIGHT", props);
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.Z_SCORE_BMI   = setup("Z_SCORE_BMI", props);
            
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.BMI   = setup("BMI", props);
            
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.HEIGHT_WEIGHT_PERCENTILE   = setup("HEIGHT_WEIGHT_PERCENTILE", props);
            
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.NEW_FORM = setupForm("heightweighttracker.Form_New");
            
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.GROWTH_ENCOUNTER = setupEncounterTypeId("GROWTH_ENCOUNTER", props);
            
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.PatientIdentiferId_IMB = setupPatientIdentifierType("PatientIdentiferId_IMB", props);
            
            org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary.PatientIdentiferId_PC = setupPatientIdentifierType("PatientIdentiferId_PC", props);
            
        }
    }
    
    private static Integer setup(String key, Properties props){
    	try {
    		String input = props.getProperty(key).trim();
	        if (input != null && !"".equals(input)){
	            Concept c = Context.getConceptService().getConceptByUuid(input);
	        	if (c == null){
	        		try {
	        			c = Context.getConceptService().getConcept(Integer.valueOf(input));
	        		} catch (Exception ex){
	        			//pass, string was not numeric
	        		}
	        	}
	            if (c != null)
	            	return c.getConceptId();
	            else
	            	log.error("no concept found for " + key);
	        } else
	        	log.error("No value found for key " + key);
	           
    	} catch (Exception ex){
    		log.warn("ChildGrowthChartModule unable to load metadata for key " + key + ". Please check your mappings in the global property.");
    	}
    	return -100;
    }
    
    private static Integer setupPatientIdentifierType(String key, Properties props){
        String input = props.getProperty(key).trim();
        if (input != null && !"".equals(input)){
        	PatientIdentifierType c = Context.getPatientService().getPatientIdentifierTypeByUuid(input);
        	if (c == null){
        		try {
        			c = Context.getPatientService().getPatientIdentifierType(Integer.valueOf(input));
        		} catch (Exception ex){
        			//pass, string was not numeric
        		}
        	}
            if (c != null)
            	return c.getPatientIdentifierTypeId();
            else
            	throw new RuntimeException("no concept found for " + key);
        } else
            throw new RuntimeException("No value found for key " + key);
    }
       
    private static Integer setupEncounterTypeId(String key, Properties props){
        String input = props.getProperty(key).trim();
        if (input != null && !"".equals(input)){
        	EncounterType c = Context.getEncounterService().getEncounterTypeByUuid(input);
        	if (c == null){
        		try {
        			c = Context.getEncounterService().getEncounterType(Integer.valueOf(input));
        		} catch (Exception ex){
        			//pass, string was not numeric
        		}
        	}
            if (c != null)
            	return c.getEncounterTypeId();
            else
            	throw new RuntimeException("no concept found for " + key);
        } else
            throw new RuntimeException("No value found for key " + key);
    }
    
    private static Integer setupForm(String key){
        String input = Context.getAdministrationService().getGlobalProperty(key);
        if (input != null && !"".equals(input)){
            Form c = Context.getFormService().getFormByUuid(input);
        	if (c == null){
        		try {
        			c = Context.getFormService().getForm(Integer.valueOf(input));
        		} catch (Exception ex){
        			//pass, string was not numeric
        		}
        	}
            if (c != null)
            	return c.getFormId();
            else
            	throw new RuntimeException("no form found for " + key);
        } else
            throw new RuntimeException("No value found for key " + key);
    }
    
}
