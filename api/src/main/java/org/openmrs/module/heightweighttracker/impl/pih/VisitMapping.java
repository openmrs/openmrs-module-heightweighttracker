package org.openmrs.module.heightweighttracker.impl.pih;

import java.util.Date;

import org.openmrs.Obs;
import org.openmrs.module.heightweighttracker.mapper.Visit;

public class VisitMapping extends ObsMapping implements Comparable<VisitMapping>, Visit {
	
	private static WHOMapping whoMapping = new WHOMapping();
	
	public VisitMapping(Obs obs) {
		super(obs);
	}
	
	/* (non-Javadoc)
	 * @see org.openmrs.module.rwandahivflowsheet.web.controller.VisitMapper#getDate()
	 */
	@Override
	public Date getDate() {
		
		
		if(getObs() != null && getObs().getConcept().getConceptId() == ConceptDictionary.WEIGHT_KG)
				return getObs().getObsDatetime();
			
		if (getObs().getEncounter() != null)
			return getObs().getEncounter().getEncounterDatetime();
		return getObsDate();
	}
	
	private Obs getObsOfType(int conceptId) {
		if(getObs() == null)
			return null;
		
		if(getObs().getConcept() != null && getObs().getConcept().getConceptId().equals(conceptId)) {
			return getObs();
		}
		
		if(getObs().getGroupMembers() != null) {
			boolean correctTest = false;
			Obs result = null;
			for(Obs group : getObs().getGroupMembers()) {
				if (!group.isVoided()){
					if(group.getConcept().getConceptId().equals(conceptId))
						return group;
				}
			}
			if(correctTest)
				return result;
		}
		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.openmrs.module.rwandahivflowsheet.web.controller.VisitMapper#getWeight()
	 */
	@Override
	public Obs getWeight() {
		return getObsOfType(ConceptDictionary.WEIGHT_KG);
	}
	
	@Override
	public Obs getHeight() {
		return getObsOfType(ConceptDictionary.HEIGHT_CM);
	}
	
	@Override
	public Obs getZScoreHeight() {
		return getObsOfType(ConceptDictionary.Z_SCORE_HEIGHT);
	}
	
	@Override
	public Obs getZScoreWeight() {
		return getObsOfType(ConceptDictionary.Z_SCORE_WEIGHT);
	}
	
	@Override
	public Obs getHeightWeightPercentile() {
		return getObsOfType(ConceptDictionary.HEIGHT_WEIGHT_PERCENTILE);
	}
	
	@Override
	public Obs getBmi() {
		return getObsOfType(ConceptDictionary.BMI);
	}
	
	@Override
	public Obs getZScoreBmi() {
		return getObsOfType(ConceptDictionary.Z_SCORE_BMI);
	}

	@Override
	public int compareTo(VisitMapping obj) {
		if (this == obj)
			return 0;
		if (obj == null)
			return -1;
		if(getDate() == null && obj.getDate() == null)
			return 0;
		if(getDate() == null)
			return 1;
		return getDate().compareTo(obj.getDate());
	}
}
