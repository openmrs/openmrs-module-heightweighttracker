package org.openmrs.module.heightweighttracker.impl.pih;


/**
 * Class mirrors the concept ids in the PIH Concept dictionary. NOTE: We would
 * want an abstraction layer, however, this is being done specifically for
 * Rwanda PIH.
 */
public class ConceptDictionary {
	
	

	public static int HEIGHT_CM ;
	
	public static int WEIGHT_KG;
	
	public static int Z_SCORE_WEIGHT;
	
	public static int Z_SCORE_HEIGHT;
	
	public static int HEIGHT_WEIGHT_PERCENTILE;
	
	public static int NEW_FORM;
	
	public static int GROWTH_ENCOUNTER;
	
	public static int BMI;
	
	public static int Z_SCORE_BMI;
	
	public static int PatientIdentiferId_IMB;

	public static int PatientIdentiferId_PC;
	
	private ConceptDictionary() {
	    org.openmrs.module.heightweighttracker.web.MetadataHelper.setupConstants();
	}

}
