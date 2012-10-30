package org.openmrs.module.heightweighttracker.mapper;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Person;

public class VisitGroup {
	
	private List<Visit> visits;
	
	private WHOCalculations whoCalculations = new WHOCalculations();
	
	public VisitGroup(List<Visit> row) {
		this.visits = row;
	}
	
	public boolean isEmr() {
		return visits.size() > 0;
	}
	
	public int getAge()
	{
		Person patient = null;
		if(getEncounter() != null)
		{
			patient = getEncounter().getPatient();
		}
		else if(getWeight() != null)
		{
			patient = getWeight().getPerson();
		}
		else if(getHeight() != null)
		{
			patient = getHeight().getPerson();
		}
		
		if(patient != null)
		{
			return patient.getAge(getDate());
		}
		
		return -1;
	}
	
	public Date getDate() {
		if(isEmr())
			return visits.iterator().next().getDate();

		return null;
	}
	
	public Obs getWeight() {
		for(Visit visit : visits) {
			Obs obs = visit.getWeight();
			if(obs != null)
				return obs;
		}
		return null;
	}
	
	public Obs getHeight() {
		for(Visit visit : visits) {
			Obs obs = visit.getHeight();
			if(obs != null)
				return obs;
		}
		return null;
	}
	
	public Obs getZScoreWeight() {
		for(Visit visit : visits) {
			Obs obs = visit.getZScoreWeight();
			if(obs != null)
				return obs;
		}
		return null;
	}
	
	public Obs getZScoreHeight() {
		for(Visit visit : visits) {
			Obs obs = visit.getZScoreHeight();
			if(obs != null)
				return obs;
		}
		return null;
	}
	
	public Obs getHeightWeightPercentile() {
		for(Visit visit : visits) {
			Obs obs = visit.getHeightWeightPercentile();
			if(obs != null)
				return obs;
		}
		return null;
	}
	
	public Obs getBmi() {
		for(Visit visit : visits) {
			Obs obs = visit.getBmi();
			if(obs != null)
				return obs;
		}
		return null;
	}
	
	public Obs getZScoreBmi() {
		for(Visit visit : visits) {
			Obs obs = visit.getZScoreBmi();
			if(obs != null)
				return obs;
		}
		return null;
	}
	
	public String getCalculatedZScoreHeight() {
		Obs height = getHeight();
		
		return whoCalculations.getCalculatedZScoreHeight(height);
	}
	
	public String getCalculatedZScoreWeight() {
		Obs weight = getWeight();
		
		return whoCalculations.getCalculatedZScoreWeight(weight);
		
	}
	
	public String getCalculatedHeightWeightPercentile()
	{
		Obs weight = getWeight();
		Obs height = getHeight();
		
		return whoCalculations.getCalculatedHeightWeightPercentile(height, weight);
	}
	
	public String getCalculatedBmiForAge() {
		
		Obs weight = getWeight();
		Obs height = getHeight();
		
		return whoCalculations.getCalculatedBmiForAge(height, weight);
	}
	
	public String getCalculatedBmi()
	{
		Obs weight = getWeight();
		Obs height = getHeight();
		
		if(weight != null && height != null && weight.getValueNumeric() != null && height.getValueNumeric() != null && weight.getPerson().getAge(getDate()) > 20)
		{
			Double bmi =  weight.getValueNumeric() / (height.getValueNumeric()/100 * height.getValueNumeric()/100);
			
			DecimalFormat twoDigit = new DecimalFormat("#,##0");//formats to 2
			twoDigit.format(bmi);
		}
		return null;
	}
	
	public Encounter getEncounter() {
		if(visits == null || visits.size() == 0)
			return null;
		
		for(Visit obs : visits) {
			if(obs.getEncounter() != null)
				return obs.getEncounter();
		}
		
		return null;
	}
	
	
}