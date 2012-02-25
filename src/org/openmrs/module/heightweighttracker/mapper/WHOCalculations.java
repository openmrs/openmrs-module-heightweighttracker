package org.openmrs.module.heightweighttracker.mapper;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

import org.openmrs.Obs;
import org.openmrs.module.heightweighttracker.impl.pih.WHOMapping;


public class WHOCalculations {
	
	private static WHOMapping whoMapping = new WHOMapping();

	public String getCalculatedZScoreHeight(Obs height) {
		
		Double zscore = null;
		if(height != null && height.getValueNumeric() != null && height.getPerson().getAge(height.getObsDatetime()) < 20)
		{
			int ageMonths = calculateMonthsDifference(height.getPerson().getBirthdate(), height.getObsDatetime());
			
			if(height.getPerson().getGender().equals("F") && ageMonths < 61)
			{
				zscore = calculateZScore(height.getValueNumeric(), whoMapping.getHeightForAgeFromBirthGirlsMean().get(ageMonths), whoMapping.getHeightForAgeFromBirthGirlsSD().get(ageMonths)); 
			}
			else if(height.getPerson().getGender().equals("M") && ageMonths < 61)
			{
				zscore = calculateZScore(height.getValueNumeric(), whoMapping.getHeightForAgeFromBirthBoysMean().get(ageMonths), whoMapping.getHeightForAgeFromBirthBoysSD().get(ageMonths)); 
			}
			else if(height.getPerson().getGender().equals("F") && ageMonths < 229)
			{
				zscore = calculateZScore(height.getValueNumeric(), whoMapping.getHeightForAge5to19GirlsMean().get(ageMonths), whoMapping.getHeightForAge5to19GirlsSD().get(ageMonths)); 
			}
			else if(height.getPerson().getGender().equals("M") && ageMonths < 229)
			{
				zscore = calculateZScore(height.getValueNumeric(), whoMapping.getHeightForAge5to19BoysMean().get(ageMonths), whoMapping.getHeightForAge5to19BoysSD().get(ageMonths)); 
			}
			
			if(zscore != null)
			{
				DecimalFormat twoDigit = new DecimalFormat("#,##0.00");//formats to 2
				return  twoDigit.format(zscore);
			}
			
		}
		return null;
	}
	
	private Double calculateZScore(double patient, double mean, double sd)
	{
		return (patient - mean)/sd; 
	}
	
	private Double calculateZScore(double patient, double mean, double l, double s)
	{
		Double zscore = patient/mean;
		zscore = Math.pow(zscore, l);
		zscore = zscore - 1;
		zscore = zscore /(s*l);
		return zscore;
	}
	
	public String getCalculatedZScoreWeight(Obs weight) {
		
		Double zscore = null;
		if(weight != null && weight.getValueNumeric() != null && weight.getPerson().getAge(weight.getObsDatetime()) < 11)
		{
			int ageMonths = calculateMonthsDifference(weight.getPerson().getBirthdate(), weight.getObsDatetime());
			
			if(weight.getPerson().getGender().equals("F") && ageMonths < 61)
			{
				zscore = calculateZScore(weight.getValueNumeric(), whoMapping.getWeightForAgeFromBirthGirlsMean().get(ageMonths), whoMapping.getWeightForAgeFromBirthGirlsL().get(ageMonths), whoMapping.getWeightForAgeFromBirthGirlsS().get(ageMonths)); 
			}
			else if(weight.getPerson().getGender().equals("M") && ageMonths < 61)
			{
				zscore = calculateZScore(weight.getValueNumeric(), whoMapping.getWeightForAgeFromBirthBoysMean().get(ageMonths), whoMapping.getWeightForAgeFromBirthBoysL().get(ageMonths), whoMapping.getWeightForAgeFromBirthBoysS().get(ageMonths)); 
			}
			else if(weight.getPerson().getGender().equals("F") && ageMonths < 121)
			{
				zscore = calculateZScore(weight.getValueNumeric(), whoMapping.getWeightForAge5to10GirlsMean().get(ageMonths), whoMapping.getWeightForAge5to10GirlsL().get(ageMonths), whoMapping.getWeightForAge5to10GirlsS().get(ageMonths)); 
			}
			else if(weight.getPerson().getGender().equals("M") && ageMonths < 121)
			{
				zscore = calculateZScore(weight.getValueNumeric(), whoMapping.getWeightForAge5to10BoysMean().get(ageMonths), whoMapping.getWeightForAge5to10BoysL().get(ageMonths), whoMapping.getWeightForAge5to10BoysS().get(ageMonths)); 
			}
			
			if(zscore != null)
			{
				DecimalFormat twoDigit = new DecimalFormat("#,##0.00");//formats to 2
				return  twoDigit.format(zscore);
			}
			
		}
		return null;
	}
	
	public String getCalculatedHeightWeightPercentile(Obs height, Obs weight)
	{
		Double percentage = null;
		
		if(weight != null && height != null && weight.getValueNumeric() != null && height.getValueNumeric() != null && weight.getPerson().getAge(weight.getObsDatetime()) < 6)
		{
			int ageMonths = calculateMonthsDifference(weight.getPerson().getBirthdate(), weight.getObsDatetime());
			
			if(weight.getPerson().getGender().equals("F") && ageMonths < 25)
			{
				percentage = calculatePercentage(weight.getValueNumeric(), whoMapping.getWeightForLengthGirlsIdeal().get(height.getValueNumeric()));
			}
			else if(weight.getPerson().getGender().equals("M") && ageMonths < 25)
			{
				percentage = calculatePercentage(weight.getValueNumeric(), whoMapping.getWeightForLengthBoysIdeal().get(height.getValueNumeric()));
			}
			else if(height.getPerson().getGender().equals("F") && ageMonths < 61)
			{
				percentage = calculatePercentage(weight.getValueNumeric(), whoMapping.getWeightForHeightGirlsIdeal().get(height.getValueNumeric()));
			}
			else if(height.getPerson().getGender().equals("M") && ageMonths < 61)
			{
				percentage = calculatePercentage(weight.getValueNumeric(), whoMapping.getWeightForHeightBoysIdeal().get(height.getValueNumeric()));
			}
			
			if(percentage != null)
			{
				DecimalFormat twoDigit = new DecimalFormat("#,##0");//formats to 2
				return  twoDigit.format(percentage);
			}
		}
		
		return null;
	}
	
	private double calculatePercentage(double patient, double ideal)
	{
		return (patient/ideal) * 100;
	}
	
	public String getCalculatedBmiForAge(Obs height, Obs weight) {
		
		Double zscore = null;
		
		if(weight != null && height != null && weight.getValueNumeric() != null && height.getValueNumeric() != null && weight.getPerson().getAge(weight.getObsDatetime()) < 20 && weight.getPerson().getAge(weight.getObsDatetime()) >= 5)
		{
			Double bmi =  weight.getValueNumeric() / (height.getValueNumeric()/100 * height.getValueNumeric()/100);
			
			int ageMonths = calculateMonthsDifference(weight.getPerson().getBirthdate(), weight.getObsDatetime());
			
			if(weight.getPerson().getGender().equals("F") && ageMonths > 60)
			{
				zscore = calculateZScore(bmi, whoMapping.getBmiZScoreGirlsMean().get(ageMonths), whoMapping.getBmiZScoreGirlsL().get(ageMonths), whoMapping.getBmiZScoreGirlsS().get(ageMonths)); 
			}
			else if(weight.getPerson().getGender().equals("M") && ageMonths > 60)
			{
				zscore = calculateZScore(bmi, whoMapping.getBmiZScoreBoysMean().get(ageMonths), whoMapping.getBmiZScoreBoysL().get(ageMonths), whoMapping.getBmiZScoreBoysS().get(ageMonths)); 
			}
			
			if(zscore != null)
			{
				DecimalFormat twoDigit = new DecimalFormat("#,##0.00");//formats to 2
				return  twoDigit.format(zscore);
			}	
		}
		
		return null;
	}
	
	private int calculateMonthsDifference(Date birthDate, Date obs)
	{
		int diff = 0;
	
		Calendar obsDate = Calendar.getInstance();	
		obsDate.setTime(obs);
	
		Calendar startDate = Calendar.getInstance();
		startDate.setTime(birthDate);
	
		//find out if there is any difference in years first
		diff = obsDate.get(Calendar.YEAR) - startDate.get(Calendar.YEAR);
		diff = diff * 12;
	
		int monthDiff = obsDate.get(Calendar.MONTH) - startDate.get(Calendar.MONTH);
		diff = diff + monthDiff;
	
		return diff;
	}
}
