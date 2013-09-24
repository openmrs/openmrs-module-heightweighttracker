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
			if(ageMonths >= 0)
			{
			
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
					try{
					zscore = calculateZScore(height.getValueNumeric(), whoMapping.getHeightForAge5to19GirlsMean().get(ageMonths), whoMapping.getHeightForAge5to19GirlsSD().get(ageMonths)); 
				 }
					catch(NullPointerException e){
						e.printStackTrace();
					}
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
			if(ageMonths >= 0)
			{
			
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
			
		}
		return null;
	}
	
	private String getHeightForWeightZRange(Double patient, Double neg3, Double neg2, Double neg1, Double zero, Double one, Double two, Double three)
	{
		if(patient > zero)
		{
			if(patient >= one && patient < two)
			{
				return "1";
			}
			else if(patient >= two && patient < three)
			{
				return "2";
			}
			else if(patient >= three)
			{
				return "3";
			}
			else
			{
				return "0";
			}
		}
		else if(patient < zero)
		{
			if(patient <= neg1 && patient > neg2)
			{
				return "-1";
			}
			else if(patient <= neg2 && patient > neg3)
			{
				return "-2";
			}
			else if(patient <= neg3)
			{
				return "-3";
			}
			else
			{
				return "0";
			}
		}
		else
		{
			return "0";
		}
	}
	
	public String getHeightForWeightZRange(Obs height, Obs weight)
	{
		if(weight != null && height != null && weight.getValueNumeric() != null && height.getValueNumeric() != null && weight.getPerson().getAge(weight.getObsDatetime()) < 6)
		{
			String range = null;
			int ageMonths = calculateMonthsDifference(weight.getPerson().getBirthdate(), weight.getObsDatetime());
			if(ageMonths >= 0)
			{
				DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
				Double idealToLookFor = Double.parseDouble(oneDigit.format(height.getValueNumeric()));
				
				if(weight.getPerson().getGender().equals("F") && ageMonths < 25 && idealToLookFor < 111 && idealToLookFor > 44)
				{
					range = getHeightForWeightZRange(weight.getValueNumeric(), whoMapping.getWeightForLengthGirlsSD3negMap().get(idealToLookFor), whoMapping.getWeightForLengthGirlsSD2negMap().get(idealToLookFor), whoMapping.getWeightForLengthGirlsSD1negMap().get(idealToLookFor), whoMapping.getWeightForLengthGirlsIdeal().get(idealToLookFor), whoMapping.getWeightForLengthGirlsSD1Map().get(idealToLookFor), whoMapping.getWeightForLengthGirlsSD2Map().get(idealToLookFor), whoMapping.getWeightForLengthGirlsSD3Map().get(idealToLookFor));
				}	
				else if(weight.getPerson().getGender().equals("M") && ageMonths < 25 && idealToLookFor < 111 && idealToLookFor > 44)
				{
					range = getHeightForWeightZRange(weight.getValueNumeric(), whoMapping.getWeightForLengthBoysSD3negMap().get(idealToLookFor), whoMapping.getWeightForLengthBoysSD2negMap().get(idealToLookFor), whoMapping.getWeightForLengthBoysSD1negMap().get(idealToLookFor), whoMapping.getWeightForLengthBoysIdeal().get(idealToLookFor), whoMapping.getWeightForLengthBoysSD1Map().get(idealToLookFor), whoMapping.getWeightForLengthBoysSD2Map().get(idealToLookFor), whoMapping.getWeightForLengthBoysSD3Map().get(idealToLookFor));
				}	
				else if(height.getPerson().getGender().equals("F") && ageMonths < 61 && idealToLookFor < 121 && idealToLookFor > 64)
				{
					range = getHeightForWeightZRange(weight.getValueNumeric(), whoMapping.getWeightForHeightGirlsSD3negMap().get(idealToLookFor), whoMapping.getWeightForHeightGirlsSD2negMap().get(idealToLookFor), whoMapping.getWeightForHeightGirlsSD1negMap().get(idealToLookFor), whoMapping.getWeightForHeightGirlsIdeal().get(idealToLookFor), whoMapping.getWeightForHeightGirlsSD1Map().get(idealToLookFor), whoMapping.getWeightForHeightGirlsSD2Map().get(idealToLookFor), whoMapping.getWeightForHeightGirlsSD3Map().get(idealToLookFor));
				}
				else if(height.getPerson().getGender().equals("M") && ageMonths < 61 && idealToLookFor < 121 && idealToLookFor > 64)
				{
					range = getHeightForWeightZRange(weight.getValueNumeric(), whoMapping.getWeightForHeightBoysSD3negMap().get(idealToLookFor), whoMapping.getWeightForHeightBoysSD2negMap().get(idealToLookFor), whoMapping.getWeightForHeightBoysSD1negMap().get(idealToLookFor), whoMapping.getWeightForHeightBoysIdeal().get(idealToLookFor), whoMapping.getWeightForHeightBoysSD1Map().get(idealToLookFor), whoMapping.getWeightForHeightBoysSD2Map().get(idealToLookFor), whoMapping.getWeightForHeightBoysSD3Map().get(idealToLookFor));
				}
			}
				
			
			return range;
		}
		
		return null;
	}
	
	public String getCalculatedHeightWeightPercentile(Obs height, Obs weight)
	{
		Double percentage = null;
		
		if(weight != null && height != null && weight.getValueNumeric() != null && height.getValueNumeric() != null && weight.getPerson().getAge(weight.getObsDatetime()) < 6)
		{
			int ageMonths = calculateMonthsDifference(weight.getPerson().getBirthdate(), weight.getObsDatetime());
			
			if(ageMonths >= 0)
			{
				DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
				Double idealToLookFor = Double.parseDouble(oneDigit.format(height.getValueNumeric()));
				
				if(weight.getPerson().getGender().equals("F") && ageMonths < 25 && idealToLookFor < 111 && idealToLookFor > 44)
				{
					percentage = calculatePercentage(weight.getValueNumeric(), whoMapping.getWeightForLengthGirlsIdeal().get(idealToLookFor));
				}
				else if(weight.getPerson().getGender().equals("M") && ageMonths < 25 && idealToLookFor < 111 && idealToLookFor > 44)
				{
					percentage = calculatePercentage(weight.getValueNumeric(), whoMapping.getWeightForLengthBoysIdeal().get(idealToLookFor));
				}
				else if(height.getPerson().getGender().equals("F") && ageMonths < 61 && idealToLookFor < 121 && idealToLookFor > 64)
				{
					percentage = calculatePercentage(weight.getValueNumeric(), whoMapping.getWeightForHeightGirlsIdeal().get(idealToLookFor));
				}
				else if(height.getPerson().getGender().equals("M") && ageMonths < 61 && idealToLookFor < 121 && idealToLookFor > 64)
				{
					percentage = calculatePercentage(weight.getValueNumeric(), whoMapping.getWeightForHeightBoysIdeal().get(idealToLookFor));
				}
				
				if(percentage != null)
				{
					DecimalFormat twoDigit = new DecimalFormat("#,##0");//formats to 2
					return  twoDigit.format(percentage);
				}
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
