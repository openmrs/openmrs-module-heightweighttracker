package org.openmrs.module.heightweighttracker.impl.pih;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openmrs.module.heightweighttracker.mapper.BMIForAge;
import org.openmrs.module.heightweighttracker.mapper.HeightForAge;
import org.openmrs.module.heightweighttracker.mapper.WeightForAge;
import org.openmrs.module.heightweighttracker.mapper.WeightForHeight;

public class WHOMapping {

	private List<HeightForAge> heightForAge5to19BoysSD3 = new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19BoysSD2= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19BoysSD1= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19BoysSD0= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19BoysSD1neg= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19BoysSD2neg= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19BoysSD3neg= new ArrayList<HeightForAge>();
	private Map<Integer, Double> heightForAge5to19BoysMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> heightForAge5to19BoysSD = new HashMap<Integer, Double>();
	
	private List<HeightForAge> heightForAge5to19GirlsSD3= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19GirlsSD2= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19GirlsSD1= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19GirlsSD0= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19GirlsSD1neg= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19GirlsSD2neg= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAge5to19GirlsSD3neg= new ArrayList<HeightForAge>();
	private Map<Integer, Double> heightForAge5to19GirlsMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> heightForAge5to19GirlsSD = new HashMap<Integer, Double>();
	
	private List<HeightForAge> heightForAgeFromBirthBoysSD3= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAgeFromBirthBoysSD2= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAgeFromBirthBoysSD0= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAgeFromBirthBoysSD2neg= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAgeFromBirthBoysSD3neg= new ArrayList<HeightForAge>();
	private Map<Integer, Double> heightForAgeFromBirthBoysMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> heightForAgeFromBirthBoysSD = new HashMap<Integer, Double>();
	
	private List<HeightForAge> heightForAgeFromBirthGirlsSD3= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAgeFromBirthGirlsSD2= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAgeFromBirthGirlsSD0= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAgeFromBirthGirlsSD2neg= new ArrayList<HeightForAge>();
	private List<HeightForAge> heightForAgeFromBirthGirlsSD3neg= new ArrayList<HeightForAge>();
	private Map<Integer, Double> heightForAgeFromBirthGirlsMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> heightForAgeFromBirthGirlsSD = new HashMap<Integer, Double>();
	
	private List<WeightForAge> weightForAge5to10BoysSD3= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10BoysSD2= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10BoysSD1= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10BoysSD0= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10BoysSD1neg= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10BoysSD2neg= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10BoysSD3neg= new ArrayList<WeightForAge>();
	private Map<Integer, Double> weightForAge5to10BoysMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> weightForAge5to10BoysL = new HashMap<Integer, Double>();
	private Map<Integer, Double> weightForAge5to10BoysS = new HashMap<Integer, Double>();
	
	private List<WeightForAge> weightForAge5to10GirlsSD3= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10GirlsSD2= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10GirlsSD1= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10GirlsSD0= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10GirlsSD1neg= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10GirlsSD2neg= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAge5to10GirlsSD3neg= new ArrayList<WeightForAge>();
	private Map<Integer, Double> weightForAge5to10GirlsMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> weightForAge5to10GirlsL = new HashMap<Integer, Double>();
	private Map<Integer, Double> weightForAge5to10GirlsS = new HashMap<Integer, Double>();
	
	private List<WeightForAge> weightForAgeFromBirthBoysSD3= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAgeFromBirthBoysSD2= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAgeFromBirthBoysSD0= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAgeFromBirthBoysSD2neg= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAgeFromBirthBoysSD3neg= new ArrayList<WeightForAge>();
	private Map<Integer, Double> weightForAgeFromBirthBoysMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> weightForAgeFromBirthBoysL = new HashMap<Integer, Double>();
	private Map<Integer, Double> weightForAgeFromBirthBoysS = new HashMap<Integer, Double>();
	
	private List<WeightForAge> weightForAgeFromBirthGirlsSD3= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAgeFromBirthGirlsSD2= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAgeFromBirthGirlsSD0= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAgeFromBirthGirlsSD2neg= new ArrayList<WeightForAge>();
	private List<WeightForAge> weightForAgeFromBirthGirlsSD3neg= new ArrayList<WeightForAge>();
	private Map<Integer, Double> weightForAgeFromBirthGirlsMean= new HashMap<Integer, Double>();
	private Map<Integer, Double> weightForAgeFromBirthGirlsL= new HashMap<Integer, Double>();
	private Map<Integer, Double> weightForAgeFromBirthGirlsS= new HashMap<Integer, Double>();
	
	private List<WeightForHeight> weightForHeightGirlsSD3= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightGirlsSD2= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightGirlsSD1= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightGirlsSD0= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightGirlsSD1neg= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightGirlsSD2neg= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightGirlsSD3neg= new ArrayList<WeightForHeight>();
	private Map<Double, Double> weightForHeightGirlsIdeal= new HashMap<Double, Double>();
	
	private List<WeightForHeight> weightForHeightBoysSD3= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightBoysSD2= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightBoysSD1= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightBoysSD0= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightBoysSD1neg= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightBoysSD2neg= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForHeightBoysSD3neg= new ArrayList<WeightForHeight>();
	private Map<Double, Double> weightForHeightBoysIdeal= new HashMap<Double, Double>();
	
	private List<WeightForHeight> weightForLengthBoysSD3= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthBoysSD2= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthBoysSD1= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthBoysSD0= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthBoysSD1neg= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthBoysSD2neg= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthBoysSD3neg= new ArrayList<WeightForHeight>();
	private Map<Double, Double> weightForLengthBoysIdeal= new HashMap<Double, Double>();
	
	private List<WeightForHeight> weightForLengthGirlsSD3= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthGirlsSD2= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthGirlsSD1= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthGirlsSD0= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthGirlsSD1neg= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthGirlsSD2neg= new ArrayList<WeightForHeight>();
	private List<WeightForHeight> weightForLengthGirlsSD3neg= new ArrayList<WeightForHeight>();
	private Map<Double, Double> weightForLengthGirlsIdeal= new HashMap<Double, Double>();
	
	private List<BMIForAge> bmiZScoreGirlsSD3= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreGirlsSD2= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreGirlsSD1= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreGirlsSD0= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreGirlsSD1neg= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreGirlsSD2neg= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreGirlsSD3neg= new ArrayList<BMIForAge>();
	private Map<Integer, Double> bmiZScoreGirlsMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> bmiZScoreGirlsL = new HashMap<Integer, Double>();
	private Map<Integer, Double> bmiZScoreGirlsS = new HashMap<Integer, Double>();
	
	private List<BMIForAge> bmiZScoreBoysSD3= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreBoysSD2= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreBoysSD1= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreBoysSD0= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreBoysSD1neg= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreBoysSD2neg= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiZScoreBoysSD3neg= new ArrayList<BMIForAge>();
	private Map<Integer, Double> bmiZScoreBoysMean = new HashMap<Integer, Double>();
	private Map<Integer, Double> bmiZScoreBoysL = new HashMap<Integer, Double>();
	private Map<Integer, Double> bmiZScoreBoysS = new HashMap<Integer, Double>();

	private List<BMIForAge> bmiPercentileGirls3= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiPercentileGirls15= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiPercentileGirls50= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiPercentileGirls85= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiPercentileGirls97= new ArrayList<BMIForAge>();
	private Map<Integer, Double> bmiPercentileGirlsMean = new HashMap<Integer, Double>();
	
	private List<BMIForAge> bmiPercentileBoys3= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiPercentileBoys15= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiPercentileBoys50= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiPercentileBoys85= new ArrayList<BMIForAge>();
	private List<BMIForAge> bmiPercentileBoys97= new ArrayList<BMIForAge>();
	private Map<Integer, Double> bmiPercentileBoysMean = new HashMap<Integer, Double>();
	
	public WHOMapping() {
		super();
		initialiseHeightForAge5to19Boys();
		initialiseHeightForAge5to19Girls();
		initialiseWeightForAge5to10Boys();
		initialiseWeightForAge5to10Girls();
		initialiseHeightForAgeFromBirthBoys();
		initialiseHeightForAgeFromBirthGirls();
		initialiseWeightForAgeFromBirthBoys();
		initialiseWeightForAgeFromBirthGirls();
		initialiseBMIPercentileGirls();
		initialiseBMIPercentileBoys();
		initialiseBMIZscoresGirls();
		initialiseBMIZscoresBoys();
		initialiseWeightForHeightGirls();
		initialiseWeightForHeightBoys();
		initialiseWeightForLengthGirls();
		initialiseWeightForLengthBoys();
	}
	
	private void initialiseHeightForAge5to19Boys()
	{
		String heightForAge5to19Boys = WHOConstants.heightForAge5to19Boys;
		
		heightForAge5to19Boys = heightForAge5to19Boys.trim().replace("\n", ",");
		String[] results = heightForAge5to19Boys.split(",");
		
		for(int i = 15; i < results.length; i++)
		{
			int month = Integer.parseInt(results[i]);
			i = i + 2;
			heightForAge5to19BoysMean.put(month, Double.parseDouble(results[i]));
			i = i + 2;
			heightForAge5to19BoysSD.put(month, Double.parseDouble(results[i]));
			
			i = i + 3;
			HeightForAge hfaSD3neg = new HeightForAge();
			hfaSD3neg.setAgeInMonths(month);
			hfaSD3neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19BoysSD3neg.add(hfaSD3neg);
			
			i++;
			HeightForAge hfaSD2neg = new HeightForAge();
			hfaSD2neg.setAgeInMonths(month);
			hfaSD2neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19BoysSD2neg.add(hfaSD2neg);
			
			i++;
			HeightForAge hfaSD1neg = new HeightForAge();
			hfaSD1neg.setAgeInMonths(month);
			hfaSD1neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19BoysSD1neg.add(hfaSD1neg);
			
			i++;
			HeightForAge hfaSD0 = new HeightForAge();
			hfaSD0.setAgeInMonths(month);
			hfaSD0.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19BoysSD0.add(hfaSD0);
			
			i++;
			HeightForAge hfaSD1 = new HeightForAge();
			hfaSD1.setAgeInMonths(month);
			hfaSD1.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19BoysSD1.add(hfaSD1);
			
			i++;
			HeightForAge hfaSD2 = new HeightForAge();
			hfaSD2.setAgeInMonths(month);
			hfaSD2.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19BoysSD2.add(hfaSD2);
			
			i++;
			HeightForAge hfaSD3 = new HeightForAge();
			hfaSD3.setAgeInMonths(month);
			hfaSD3.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19BoysSD3.add(hfaSD3);
			
			i++;
		}
	}
	
	private void initialiseHeightForAge5to19Girls()
	{
		String heightForAge5to19Girls = WHOConstants.heightForAge5to19Girls;
		heightForAge5to19Girls = heightForAge5to19Girls.trim().replace("\n", ",");
		
		String[] results = heightForAge5to19Girls.split(",");
		
		for(int i = 15; i < results.length; i++)
		{
			int month = Integer.parseInt(results[i]);
			i = i + 2;
			heightForAge5to19GirlsMean.put(month, Double.parseDouble(results[i]));
			i = i + 2;
			heightForAge5to19GirlsSD.put(month, Double.parseDouble(results[i]));

			i = i + 3;
			HeightForAge hfaSD3neg = new HeightForAge();
			hfaSD3neg.setAgeInMonths(month);
			hfaSD3neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19GirlsSD3neg.add(hfaSD3neg);
			
			i++;
			HeightForAge hfaSD2neg = new HeightForAge();
			hfaSD2neg.setAgeInMonths(month);
			hfaSD2neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19GirlsSD2neg.add(hfaSD2neg);
			
			i++;
			HeightForAge hfaSD1neg = new HeightForAge();
			hfaSD1neg.setAgeInMonths(month);
			hfaSD1neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19GirlsSD1neg.add(hfaSD1neg);
			
			i++;
			HeightForAge hfaSD0 = new HeightForAge();
			hfaSD0.setAgeInMonths(month);
			hfaSD0.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19GirlsSD0.add(hfaSD0);
			
			i++;
			HeightForAge hfaSD1 = new HeightForAge();
			hfaSD1.setAgeInMonths(month);
			hfaSD1.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19GirlsSD1.add(hfaSD1);
			
			i++;
			HeightForAge hfaSD2 = new HeightForAge();
			hfaSD2.setAgeInMonths(month);
			hfaSD2.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19GirlsSD2.add(hfaSD2);
			
			i++;
			HeightForAge hfaSD3 = new HeightForAge();
			hfaSD3.setAgeInMonths(month);
			hfaSD3.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAge5to19GirlsSD3.add(hfaSD3);
			
			i++;
		}
	}
	
	private void initialiseWeightForAge5to10Girls()
	{
		String weightForAge5to10Girls = WHOConstants.weightForAge5to10Girls;
		
		weightForAge5to10Girls = weightForAge5to10Girls.trim().replace("\n", ",");
		String[] results = weightForAge5to10Girls.split(",");
		
		for(int i = 13; i < results.length; i++)
		{
			int month = Integer.parseInt(results[i]);
			i++;
			
			weightForAge5to10GirlsL.put(month, Double.parseDouble(results[i]));
			i++;
			weightForAge5to10GirlsMean.put(month, Double.parseDouble(results[i]));
			i++;
			weightForAge5to10GirlsS.put(month, Double.parseDouble(results[i]));
			i++;
			i++;
			
			WeightForAge wfaSD3neg = new WeightForAge();
			wfaSD3neg.setAgeInMonths(month);
			wfaSD3neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10GirlsSD3neg.add(wfaSD3neg);
			
			i++;
			WeightForAge wfaSD2neg = new WeightForAge();
			wfaSD2neg.setAgeInMonths(month);
			wfaSD2neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10GirlsSD2neg.add(wfaSD2neg);
			
			i++;
			WeightForAge wfaSD1neg = new WeightForAge();
			wfaSD1neg.setAgeInMonths(month);
			wfaSD1neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10GirlsSD1neg.add(wfaSD1neg);
			
			i++;
			WeightForAge wfaSD0 = new WeightForAge();
			wfaSD0.setAgeInMonths(month);
			wfaSD0.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10GirlsSD0.add(wfaSD0);
			
			i++;
			WeightForAge wfaSD1 = new WeightForAge();
			wfaSD1.setAgeInMonths(month);
			wfaSD1.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10GirlsSD1.add(wfaSD1);
			
			i++;
			WeightForAge wfaSD2 = new WeightForAge();
			wfaSD2.setAgeInMonths(month);
			wfaSD2.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10GirlsSD2.add(wfaSD2);
			
			i++;
			WeightForAge wfaSD3 = new WeightForAge();
			wfaSD3.setAgeInMonths(month);
			wfaSD3.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10GirlsSD3.add(wfaSD3);
			
			i++;
		}
	}
	
	private void initialiseWeightForAge5to10Boys()
	{
		String weightForAge5to10Boys = WHOConstants.weightForAge5to10Boys;
		
		weightForAge5to10Boys = weightForAge5to10Boys.trim().replace("\n", ",");
		String[] results = weightForAge5to10Boys.split(",");
		
		for(int i = 13; i < results.length; i++)
		{
			int month = Integer.parseInt(results[i]);
			i++;
			
			weightForAge5to10BoysL.put(month, Double.parseDouble(results[i]));
			i++;
			weightForAge5to10BoysMean.put(month, Double.parseDouble(results[i]));
			i++;
			weightForAge5to10BoysS.put(month, Double.parseDouble(results[i]));
			i++;
			i++;
			
			WeightForAge wfaSD3neg = new WeightForAge();
			wfaSD3neg.setAgeInMonths(month);
			wfaSD3neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10BoysSD3neg.add(wfaSD3neg);
			
			i++;
			WeightForAge wfaSD2neg = new WeightForAge();
			wfaSD2neg.setAgeInMonths(month);
			wfaSD2neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10BoysSD2neg.add(wfaSD2neg);
			
			i++;
			WeightForAge wfaSD1neg = new WeightForAge();
			wfaSD1neg.setAgeInMonths(month);
			wfaSD1neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10BoysSD1neg.add(wfaSD1neg);
			
			i++;
			WeightForAge wfaSD0 = new WeightForAge();
			wfaSD0.setAgeInMonths(month);
			wfaSD0.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10BoysSD0.add(wfaSD0);
			
			i++;
			WeightForAge wfaSD1 = new WeightForAge();
			wfaSD1.setAgeInMonths(month);
			wfaSD1.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10BoysSD1.add(wfaSD1);
			
			i++;
			WeightForAge wfaSD2 = new WeightForAge();
			wfaSD2.setAgeInMonths(month);
			wfaSD2.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10BoysSD2.add(wfaSD2);
			
			i++;
			WeightForAge wfaSD3 = new WeightForAge();
			wfaSD3.setAgeInMonths(month);
			wfaSD3.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAge5to10BoysSD3.add(wfaSD3);
			
			i++;
		}
	}
	
	private void initialiseHeightForAgeFromBirthBoys()
	{
		String heightForAgeFromBirthBoys = WHOConstants.heightForAgeFromBirthBoys;
		
		heightForAgeFromBirthBoys = heightForAgeFromBirthBoys.trim().replace("\n", ",");
		String[] results = heightForAgeFromBirthBoys.split(",");
		
		for(int i = 12; i < results.length; i++)
		{
			int months = Integer.parseInt(results[i]);
			i++;
			i++;
			
			heightForAgeFromBirthBoysMean.put(months, Double.parseDouble(results[i]));
			i++;
			i++;
			heightForAgeFromBirthBoysSD.put(months, Double.parseDouble(results[i]));
			i++;
			
			HeightForAge hfaSD3neg = new HeightForAge();
			hfaSD3neg.setAgeInMonths(months);
			hfaSD3neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthBoysSD3neg.add(hfaSD3neg);
			
			i++;
			HeightForAge hfaSD2neg = new HeightForAge();
			hfaSD2neg.setAgeInMonths(months);
			hfaSD2neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthBoysSD2neg.add(hfaSD2neg);
			
			i++;
			i++;
			HeightForAge hfaSD0 = new HeightForAge();
			hfaSD0.setAgeInMonths(months);
			hfaSD0.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthBoysSD0.add(hfaSD0);
			
			i++;
			i++;
			HeightForAge hfaSD2 = new HeightForAge();
			hfaSD2.setAgeInMonths(months);
			hfaSD2.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthBoysSD2.add(hfaSD2);
			
			i++;
			HeightForAge hfaSD3 = new HeightForAge();
			hfaSD3.setAgeInMonths(months);
			hfaSD3.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthBoysSD3.add(hfaSD3);
		}
	}
	
	private void initialiseHeightForAgeFromBirthGirls()
	{
		String heightForAgeFromBirthGirls = WHOConstants.heightForAgeFromBirthGirls;
		
		heightForAgeFromBirthGirls = heightForAgeFromBirthGirls.trim().replace("\n", ",");
		String[] results = heightForAgeFromBirthGirls.split(",");
		
		for(int i = 12; i < results.length; i++)
		{
			int months = Integer.parseInt(results[i]);
			i++;
			i++;
			
			heightForAgeFromBirthGirlsMean.put(months, Double.parseDouble(results[i]));
			i++;
			i++;
			heightForAgeFromBirthGirlsSD.put(months, Double.parseDouble(results[i]));
			i++;
			
			HeightForAge hfaSD3neg = new HeightForAge();
			hfaSD3neg.setAgeInMonths(months);
			hfaSD3neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthGirlsSD3neg.add(hfaSD3neg);
			
			i++;
			HeightForAge hfaSD2neg = new HeightForAge();
			hfaSD2neg.setAgeInMonths(months);
			hfaSD2neg.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthGirlsSD2neg.add(hfaSD2neg);
			
			i++;
			i++;
			HeightForAge hfaSD0 = new HeightForAge();
			hfaSD0.setAgeInMonths(months);
			hfaSD0.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthGirlsSD0.add(hfaSD0);
			
			i++;
			i++;
			HeightForAge hfaSD2 = new HeightForAge();
			hfaSD2.setAgeInMonths(months);
			hfaSD2.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthGirlsSD2.add(hfaSD2);
			
			i++;
			HeightForAge hfaSD3 = new HeightForAge();
			hfaSD3.setAgeInMonths(months);
			hfaSD3.setHeightInCMDecimal(Double.parseDouble(results[i]));
			heightForAgeFromBirthGirlsSD3.add(hfaSD3);
		}
	}
	
	private void initialiseWeightForAgeFromBirthBoys()
	{
		String weightForAgeFromBirthBoys = WHOConstants.weightForAgeFromBirthBoys;
		
		weightForAgeFromBirthBoys = weightForAgeFromBirthBoys.trim().replace("\n", ",");
		String[] results = weightForAgeFromBirthBoys.split(",");
		
		for(int i = 11; i < results.length; i++)
		{
			int months = Integer.parseInt(results[i]);
			i++;
			weightForAgeFromBirthBoysL.put(months, Double.parseDouble(results[i]));
			i++;
			weightForAgeFromBirthBoysMean.put(months, Double.parseDouble(results[i]));
			i++;
			weightForAgeFromBirthBoysS.put(months, Double.parseDouble(results[i]));
			
			i++;
			WeightForAge wfaSD3neg = new WeightForAge();
			wfaSD3neg.setAgeInMonths(months);
			wfaSD3neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthBoysSD3neg.add(wfaSD3neg);
			
			i++;
			WeightForAge wfaSD2neg = new WeightForAge();
			wfaSD2neg.setAgeInMonths(months);
			wfaSD2neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthBoysSD2neg.add(wfaSD2neg);
			
			i++;
			i++;
			WeightForAge wfaSD0 = new WeightForAge();
			wfaSD0.setAgeInMonths(months);
			wfaSD0.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthBoysSD0.add(wfaSD0);
			
			i++;
			i++;
			WeightForAge wfaSD2 = new WeightForAge();
			wfaSD2.setAgeInMonths(months);
			wfaSD2.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthBoysSD2.add(wfaSD2);
			
			i++;
			WeightForAge wfaSD3 = new WeightForAge();
			wfaSD3.setAgeInMonths(months);
			wfaSD3.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthBoysSD3.add(wfaSD3);
		}
	}
	
	private void initialiseWeightForAgeFromBirthGirls()
	{
		String weightForAgeFromBirthGirls = WHOConstants.weightForAgeFromBirthGirls;
		
		weightForAgeFromBirthGirls = weightForAgeFromBirthGirls.trim().replace("\n", ",");
		String[] results = weightForAgeFromBirthGirls.split(",");
		
		for(int i = 11; i < results.length; i++)
		{
			int months = Integer.parseInt(results[i]);
			i++;
			weightForAgeFromBirthGirlsL.put(months, Double.parseDouble(results[i]));
			i++;
			weightForAgeFromBirthGirlsMean.put(months, Double.parseDouble(results[i]));
			i++;
			weightForAgeFromBirthGirlsS.put(months, Double.parseDouble(results[i]));
			i++;
			WeightForAge wfaSD3neg = new WeightForAge();
			wfaSD3neg.setAgeInMonths(months);
			wfaSD3neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthGirlsSD3neg.add(wfaSD3neg);
			
			i++;
			WeightForAge wfaSD2neg = new WeightForAge();
			wfaSD2neg.setAgeInMonths(months);
			wfaSD2neg.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthGirlsSD2neg.add(wfaSD2neg);
			
			i++;
			i++;
			WeightForAge wfaSD0 = new WeightForAge();
			wfaSD0.setAgeInMonths(months);
			wfaSD0.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthGirlsSD0.add(wfaSD0);
			
			i++;
			i++;
			WeightForAge wfaSD2 = new WeightForAge();
			wfaSD2.setAgeInMonths(months);
			wfaSD2.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthGirlsSD2.add(wfaSD2);
			
			i++;
			WeightForAge wfaSD3 = new WeightForAge();
			wfaSD3.setAgeInMonths(months);
			wfaSD3.setWeightInKGDecimal(Double.parseDouble(results[i]));
			weightForAgeFromBirthGirlsSD3.add(wfaSD3);
		}
	}
	
	private void initialiseWeightForHeightGirls()
	{
		String weightForHeightGirls = WHOConstants.weightForHeightGirls;
		
		weightForHeightGirls = weightForHeightGirls.trim().replace("\n", ",");
		String[] results = weightForHeightGirls.split(",");
		
		for(int i = 10; i < results.length; i++)
		{
			double height = Double.parseDouble(results[i]);
			i++;
			i++;
			WeightForHeight wfhSD3Neg = new WeightForHeight();
			wfhSD3Neg.setHeight(height);
			wfhSD3Neg.setWeight(Double.parseDouble(results[i]));
			weightForHeightGirlsSD3neg.add(wfhSD3Neg);
			i++;
			
			WeightForHeight wfhSD2Neg = new WeightForHeight();
			wfhSD2Neg.setHeight(height);
			wfhSD2Neg.setWeight(Double.parseDouble(results[i]));
			weightForHeightGirlsSD2neg.add(wfhSD2Neg);
			i++;
			
			WeightForHeight wfhSD1Neg = new WeightForHeight();
			wfhSD1Neg.setHeight(height);
			wfhSD1Neg.setWeight(Double.parseDouble(results[i]));
			weightForHeightGirlsSD1neg.add(wfhSD1Neg);
			
			i++;
			WeightForHeight wfhSD0 = new WeightForHeight();
			wfhSD0.setHeight(height);
			wfhSD0.setWeight(Double.parseDouble(results[i]));
			weightForHeightGirlsSD0.add(wfhSD0);
			weightForHeightGirlsIdeal.put(height, Double.parseDouble(results[i]));
			
			i++;
			WeightForHeight wfhSD1 = new WeightForHeight();
			wfhSD1.setHeight(height);
			wfhSD1.setWeight(Double.parseDouble(results[i]));
			weightForHeightGirlsSD1.add(wfhSD1);
	
			i++;
			WeightForHeight wfhSD2 = new WeightForHeight();
			wfhSD2.setHeight(height);
			wfhSD2.setWeight(Double.parseDouble(results[i]));
			weightForHeightGirlsSD2.add(wfhSD2);
			i++;
			
			WeightForHeight wfhSD3 = new WeightForHeight();
			wfhSD3.setHeight(height);
			wfhSD3.setWeight(Double.parseDouble(results[i]));
			weightForHeightGirlsSD3.add(wfhSD3);
			i++;
		}
	}
	
	private void initialiseWeightForHeightBoys()
	{
		String weightForHeightBoys = WHOConstants.weightForHeightBoys;
		
		weightForHeightBoys = weightForHeightBoys.trim().replace("\n", ",");
		String[] results = weightForHeightBoys.split(",");
		
		for(int i = 10; i < results.length; i++)
		{
			double height = Double.parseDouble(results[i]);
			i++;
			i++;
			WeightForHeight wfhSD3neg = new WeightForHeight();
			wfhSD3neg.setHeight(height);
			wfhSD3neg.setWeight(Double.parseDouble(results[i]));
			weightForHeightBoysSD3neg.add(wfhSD3neg);
			i++;
			WeightForHeight wfhSD2neg = new WeightForHeight();
			wfhSD2neg.setHeight(height);
			wfhSD2neg.setWeight(Double.parseDouble(results[i]));
			weightForHeightBoysSD2neg.add(wfhSD2neg);
			
			i++;
			WeightForHeight wfhSD1neg = new WeightForHeight();
			wfhSD1neg.setHeight(height);
			wfhSD1neg.setWeight(Double.parseDouble(results[i]));
			weightForHeightBoysSD1neg.add(wfhSD1neg);
			
			i++;
			WeightForHeight wfhSD0 = new WeightForHeight();
			wfhSD0.setHeight(height);
			wfhSD0.setWeight(Double.parseDouble(results[i]));
			weightForHeightBoysSD0.add(wfhSD0);
			weightForHeightBoysIdeal.put(height, Double.parseDouble(results[i]));
			
			i++;
			WeightForHeight wfhSD1 = new WeightForHeight();
			wfhSD1.setHeight(height);
			wfhSD1.setWeight(Double.parseDouble(results[i]));
			weightForHeightBoysSD1.add(wfhSD1);
			i++;
			WeightForHeight wfhSD2 = new WeightForHeight();
			wfhSD2.setHeight(height);
			wfhSD2.setWeight(Double.parseDouble(results[i]));
			weightForHeightBoysSD2.add(wfhSD2);
			i++;
			WeightForHeight wfhSD3 = new WeightForHeight();
			wfhSD3.setHeight(height);
			wfhSD3.setWeight(Double.parseDouble(results[i]));
			weightForHeightBoysSD3.add(wfhSD3);
			i++;
		}
	}
	
	private void initialiseWeightForLengthBoys()
	{
		String weightForLengthBoys = WHOConstants.weightForLengthBoys;
		
		weightForLengthBoys = weightForLengthBoys.trim().replace("\n", ",");
		String[] results = weightForLengthBoys.split(",");
		
		for(int i = 10; i < results.length; i++)
		{
			double length = Double.parseDouble(results[i]);
			i++;
			i++;
			WeightForHeight wfhSD3neg = new WeightForHeight();
			wfhSD3neg.setHeight(length);
			wfhSD3neg.setWeight(Double.parseDouble(results[i]));
			weightForLengthBoysSD3neg.add(wfhSD3neg);
			
			i++;
			WeightForHeight wfhSD2neg = new WeightForHeight();
			wfhSD2neg.setHeight(length);
			wfhSD2neg.setWeight(Double.parseDouble(results[i]));
			weightForLengthBoysSD2neg.add(wfhSD2neg);
	
			i++;
			WeightForHeight wfhSD1neg = new WeightForHeight();
			wfhSD1neg.setHeight(length);
			wfhSD1neg.setWeight(Double.parseDouble(results[i]));
			weightForLengthBoysSD1neg.add(wfhSD1neg);
			
			i++;
			WeightForHeight wfhSD0 = new WeightForHeight();
			wfhSD0.setHeight(length);
			wfhSD0.setWeight(Double.parseDouble(results[i]));
			weightForLengthBoysSD0.add(wfhSD0);
			weightForLengthBoysIdeal.put(length, Double.parseDouble(results[i]));
			
			i++;
			WeightForHeight wfhSD1 = new WeightForHeight();
			wfhSD1.setHeight(length);
			wfhSD1.setWeight(Double.parseDouble(results[i]));
			weightForLengthBoysSD1.add(wfhSD1);
			
			i++;
			WeightForHeight wfhSD2 = new WeightForHeight();
			wfhSD2.setHeight(length);
			wfhSD2.setWeight(Double.parseDouble(results[i]));
			weightForLengthBoysSD2.add(wfhSD2);
			
			i++;
			WeightForHeight wfhSD3 = new WeightForHeight();
			wfhSD3.setHeight(length);
			wfhSD3.setWeight(Double.parseDouble(results[i]));
			weightForLengthBoysSD3.add(wfhSD3);
			i++;
		}
	}
	
	private void initialiseWeightForLengthGirls()
	{
		String weightForLengthGirls = WHOConstants.weightForLengthGirls;
		
		weightForLengthGirls = weightForLengthGirls.trim().replace("\n", ",");
		String[] results = weightForLengthGirls.split(",");
		
		for(int i = 10; i < results.length; i++)
		{
			double length = Double.parseDouble(results[i]);
			i++;
			i++;
			WeightForHeight wfhSD3neg = new WeightForHeight();
			wfhSD3neg.setHeight(length);
			wfhSD3neg.setWeight(Double.parseDouble(results[i]));
			weightForLengthGirlsSD3neg.add(wfhSD3neg);
			i++;
			WeightForHeight wfhSD2neg = new WeightForHeight();
			wfhSD2neg.setHeight(length);
			wfhSD2neg.setWeight(Double.parseDouble(results[i]));
			weightForLengthGirlsSD2neg.add(wfhSD2neg);
			
			i++;
			WeightForHeight wfhSD1neg = new WeightForHeight();
			wfhSD1neg.setHeight(length);
			wfhSD1neg.setWeight(Double.parseDouble(results[i]));
			weightForLengthGirlsSD1neg.add(wfhSD1neg);
			
			i++;
			WeightForHeight wfhSD0 = new WeightForHeight();
			wfhSD0.setHeight(length);
			wfhSD0.setWeight(Double.parseDouble(results[i]));
			weightForLengthGirlsSD0.add(wfhSD0);
			weightForLengthGirlsIdeal.put(length, Double.parseDouble(results[i]));
			
			i++;
			WeightForHeight wfhSD1 = new WeightForHeight();
			wfhSD1.setHeight(length);
			wfhSD1.setWeight(Double.parseDouble(results[i]));
			weightForLengthGirlsSD1.add(wfhSD1);
			
			
			i++;
			WeightForHeight wfhSD2 = new WeightForHeight();
			wfhSD2.setHeight(length);
			wfhSD2.setWeight(Double.parseDouble(results[i]));
			weightForLengthGirlsSD2.add(wfhSD2);
			
			i++;
			WeightForHeight wfhSD3 = new WeightForHeight();
			wfhSD3.setHeight(length);
			wfhSD3.setWeight(Double.parseDouble(results[i]));
			weightForLengthGirlsSD3.add(wfhSD3);
			i++;
		}
	}
	
	private void initialiseBMIPercentileBoys()
	{
		String heightPercentileBoys = WHOConstants.bmiPercentileBoys;
		
		heightPercentileBoys = heightPercentileBoys.trim().replace("\n", ",");
		String[] results = heightPercentileBoys.split(",");
		
		for(int i = 19; i < results.length; i++)
		{
			Integer month = Integer.parseInt(results[i]);
			
			i=i+2;
			bmiPercentileBoysMean.put(month, Double.parseDouble(results[i]));
			
			i = i + 4;
			BMIForAge bmi3 = new BMIForAge();
			bmi3.setAgeInMonthsDecimal(month);
			bmi3.setBmi(Double.parseDouble(results[i]));
			bmiPercentileBoys3.add(bmi3);
			
			i = i + 3;
			BMIForAge bmi15 = new BMIForAge();
			bmi15.setAgeInMonthsDecimal(month);
			bmi15.setBmi(Double.parseDouble(results[i]));
			bmiPercentileBoys15.add(bmi15);
			
			i++;
			i++;
			BMIForAge bmi50 = new BMIForAge();
			bmi50.setAgeInMonthsDecimal(month);
			bmi50.setBmi(Double.parseDouble(results[i]));
			bmiPercentileBoys50.add(bmi50);
			
			i++;
			i++;
			BMIForAge bmi85 = new BMIForAge();
			bmi85.setAgeInMonthsDecimal(month);
			bmi85.setBmi(Double.parseDouble(results[i]));
			bmiPercentileBoys85.add(bmi85);
			
			i++;
			i++;
			i++;
			BMIForAge bmi97 = new BMIForAge();
			bmi97.setAgeInMonthsDecimal(month);
			bmi97.setBmi(Double.parseDouble(results[i]));
			bmiPercentileBoys97.add(bmi97);
			
			i++;
			i++;
		}
	}
	
	private void initialiseBMIPercentileGirls()
	{
		String heightPercentileGirls = WHOConstants.bmiPercentileGirls;
		
		heightPercentileGirls = heightPercentileGirls.trim().replace("\n", ",");
		String[] results = heightPercentileGirls.split(",");
		
		for(int i = 19; i < results.length; i++)
		{
			int month = Integer.parseInt(results[i]);
			
			i=i+2;
			bmiPercentileGirlsMean.put(month, Double.parseDouble(results[i]));
			
			i = i+4;
			BMIForAge bmi3 = new BMIForAge();
			bmi3.setAgeInMonthsDecimal(month);
			bmi3.setBmi(Double.parseDouble(results[i]));
			bmiPercentileGirls3.add(bmi3);
			
			i=i+3;
			BMIForAge bmi15 = new BMIForAge();
			bmi15.setAgeInMonthsDecimal(month);
			bmi15.setBmi(Double.parseDouble(results[i]));
			bmiPercentileGirls15.add(bmi15);
			
			i++;
			i++;
			BMIForAge bmi50 = new BMIForAge();
			bmi50.setAgeInMonthsDecimal(month);
			bmi50.setBmi(Double.parseDouble(results[i]));
			bmiPercentileGirls50.add(bmi50);
			
			i++;
			i++;
			BMIForAge bmi85 = new BMIForAge();
			bmi85.setAgeInMonthsDecimal(month);
			bmi85.setBmi(Double.parseDouble(results[i]));
			bmiPercentileGirls85.add(bmi85);
			
			i++;
			i++;
			i++;
			BMIForAge bmi97 = new BMIForAge();
			bmi97.setAgeInMonthsDecimal(month);
			bmi97.setBmi(Double.parseDouble(results[i]));
			bmiPercentileGirls97.add(bmi97);
	
			i++;
			i++;
		}
	}
	
	private void initialiseBMIZscoresGirls()
	{
		String bmiZScoresGirls = WHOConstants.bmiZScoresGirls;
		
		bmiZScoresGirls = bmiZScoresGirls.trim().replace("\n", ",");
		String[] results = bmiZScoresGirls.split(",");
		
		for(int i = 13; i < results.length; i++)
		{
			int month = Integer.parseInt(results[i]);
			i++;
			
			bmiZScoreGirlsL.put(month, Double.parseDouble(results[i]));
			i++;
			bmiZScoreGirlsMean.put(month, Double.parseDouble(results[i]));
			i++;
			bmiZScoreGirlsS.put(month, Double.parseDouble(results[i]));
			i++;
			i++;
			
			BMIForAge bmiSD3neg = new BMIForAge();
			bmiSD3neg.setAgeInMonths(month);
			bmiSD3neg.setBmi(Double.parseDouble(results[i]));
			bmiZScoreGirlsSD3neg.add(bmiSD3neg);
			
			i++;
			BMIForAge bmiSD2neg = new BMIForAge();
			bmiSD2neg.setAgeInMonths(month);
			bmiSD2neg.setBmi(Double.parseDouble(results[i]));
			bmiZScoreGirlsSD2neg.add(bmiSD2neg);
			
			i++;
			BMIForAge bmiSD1neg = new BMIForAge();
			bmiSD1neg.setAgeInMonths(month);
			bmiSD1neg.setBmi(Double.parseDouble(results[i]));
			bmiZScoreGirlsSD1neg.add(bmiSD1neg);
			
			i++;
			BMIForAge bmiSD0 = new BMIForAge();
			bmiSD0.setAgeInMonths(month);
			bmiSD0.setBmi(Double.parseDouble(results[i]));
			bmiZScoreGirlsSD0.add(bmiSD0);
			
			i++;
			BMIForAge bmiSD1 = new BMIForAge();
			bmiSD1.setAgeInMonths(month);
			bmiSD1.setBmi(Double.parseDouble(results[i]));
			bmiZScoreGirlsSD1.add(bmiSD1);
			
			i++;
			BMIForAge bmiSD2 = new BMIForAge();
			bmiSD2.setAgeInMonths(month);
			bmiSD2.setBmi(Double.parseDouble(results[i]));
			bmiZScoreGirlsSD2.add(bmiSD2);
			
			i++;
			BMIForAge bmiSD3 = new BMIForAge();
			bmiSD3.setAgeInMonths(month);
			bmiSD3.setBmi(Double.parseDouble(results[i]));
			bmiZScoreGirlsSD3.add(bmiSD3);
			
			i++;
		}
	}
	
	private void initialiseBMIZscoresBoys()
	{
		String bmiZScoresBoys = WHOConstants.bmiZScoresBoys;
		
		bmiZScoresBoys = bmiZScoresBoys.trim().replace("\n", ",");
		String[] results = bmiZScoresBoys.split(",");
		
		for(int i = 13; i < results.length; i++)
		{
			int month = Integer.parseInt(results[i]);
			i++;
			
			bmiZScoreBoysL.put(month, Double.parseDouble(results[i]));
			i++;
			bmiZScoreBoysMean.put(month, Double.parseDouble(results[i]));
			i++;
			bmiZScoreBoysS.put(month, Double.parseDouble(results[i]));
			i++;
			i++;
			
			BMIForAge bmiSD3neg = new BMIForAge();
			bmiSD3neg.setAgeInMonths(month);
			bmiSD3neg.setBmi(Double.parseDouble(results[i]));
			bmiZScoreBoysSD3neg.add(bmiSD3neg);
			
			i++;
			BMIForAge bmiSD2neg = new BMIForAge();
			bmiSD2neg.setAgeInMonths(month);
			bmiSD2neg.setBmi(Double.parseDouble(results[i]));
			bmiZScoreBoysSD2neg.add(bmiSD2neg);
			
			i++;
			BMIForAge bmiSD1neg = new BMIForAge();
			bmiSD1neg.setAgeInMonths(month);
			bmiSD1neg.setBmi(Double.parseDouble(results[i]));
			bmiZScoreBoysSD1neg.add(bmiSD1neg);
			
			i++;
			BMIForAge bmiSD0 = new BMIForAge();
			bmiSD0.setAgeInMonths(month);
			bmiSD0.setBmi(Double.parseDouble(results[i]));
			bmiZScoreBoysSD0.add(bmiSD0);
			
			i++;
			BMIForAge bmiSD1 = new BMIForAge();
			bmiSD1.setAgeInMonths(month);
			bmiSD1.setBmi(Double.parseDouble(results[i]));
			bmiZScoreBoysSD1.add(bmiSD1);
			
			i++;
			BMIForAge bmiSD2 = new BMIForAge();
			bmiSD2.setAgeInMonths(month);
			bmiSD2.setBmi(Double.parseDouble(results[i]));
			bmiZScoreBoysSD2.add(bmiSD2);
			
			i++;
			BMIForAge bmiSD3 = new BMIForAge();
			bmiSD3.setAgeInMonths(month);
			bmiSD3.setBmi(Double.parseDouble(results[i]));
			bmiZScoreBoysSD3.add(bmiSD3);
			
			i++;
		}
	}

	public List<HeightForAge> getHeightForAge5to19BoysSD3() {
		return heightForAge5to19BoysSD3;
	}

	public List<HeightForAge> getHeightForAge5to19BoysSD2() {
		return heightForAge5to19BoysSD2;
	}

	public List<HeightForAge> getHeightForAge5to19BoysSD1() {
		return heightForAge5to19BoysSD1;
	}

	public List<HeightForAge> getHeightForAge5to19BoysSD0() {
		return heightForAge5to19BoysSD0;
	}

	public List<HeightForAge> getHeightForAge5to19BoysSD1neg() {
		return heightForAge5to19BoysSD1neg;
	}

	public List<HeightForAge> getHeightForAge5to19BoysSD2neg() {
		return heightForAge5to19BoysSD2neg;
	}

	public List<HeightForAge> getHeightForAge5to19BoysSD3neg() {
		return heightForAge5to19BoysSD3neg;
	}

	public List<HeightForAge> getHeightForAge5to19GirlsSD3() {
		return heightForAge5to19GirlsSD3;
	}

	public List<HeightForAge> getHeightForAge5to19GirlsSD2() {
		return heightForAge5to19GirlsSD2;
	}

	public List<HeightForAge> getHeightForAge5to19GirlsSD1() {
		return heightForAge5to19GirlsSD1;
	}

	public List<HeightForAge> getHeightForAge5to19GirlsSD0() {
		return heightForAge5to19GirlsSD0;
	}

	public List<HeightForAge> getHeightForAge5to19GirlsSD1neg() {
		return heightForAge5to19GirlsSD1neg;
	}

	public List<HeightForAge> getHeightForAge5to19GirlsSD2neg() {
		return heightForAge5to19GirlsSD2neg;
	}

	public List<HeightForAge> getHeightForAge5to19GirlsSD3neg() {
		return heightForAge5to19GirlsSD3neg;
	}

	public List<HeightForAge> getHeightForAgeFromBirthBoysSD3() {
		return heightForAgeFromBirthBoysSD3;
	}

	public List<HeightForAge> getHeightForAgeFromBirthBoysSD2() {
		return heightForAgeFromBirthBoysSD2;
	}

	public List<HeightForAge> getHeightForAgeFromBirthBoysSD0() {
		return heightForAgeFromBirthBoysSD0;
	}

	public List<HeightForAge> getHeightForAgeFromBirthBoysSD2neg() {
		return heightForAgeFromBirthBoysSD2neg;
	}

	public List<HeightForAge> getHeightForAgeFromBirthBoysSD3neg() {
		return heightForAgeFromBirthBoysSD3neg;
	}

	public List<HeightForAge> getHeightForAgeFromBirthGirlsSD3() {
		return heightForAgeFromBirthGirlsSD3;
	}

	public List<HeightForAge> getHeightForAgeFromBirthGirlsSD2() {
		return heightForAgeFromBirthGirlsSD2;
	}

	public List<HeightForAge> getHeightForAgeFromBirthGirlsSD0() {
		return heightForAgeFromBirthGirlsSD0;
	}

	public List<HeightForAge> getHeightForAgeFromBirthGirlsSD2neg() {
		return heightForAgeFromBirthGirlsSD2neg;
	}

	public List<HeightForAge> getHeightForAgeFromBirthGirlsSD3neg() {
		return heightForAgeFromBirthGirlsSD3neg;
	}

	public List<WeightForAge> getWeightForAge5to10BoysSD3() {
		return weightForAge5to10BoysSD3;
	}

	public List<WeightForAge> getWeightForAge5to10BoysSD2() {
		return weightForAge5to10BoysSD2;
	}

	public List<WeightForAge> getWeightForAge5to10BoysSD1() {
		return weightForAge5to10BoysSD1;
	}

	public List<WeightForAge> getWeightForAge5to10BoysSD0() {
		return weightForAge5to10BoysSD0;
	}

	public List<WeightForAge> getWeightForAge5to10BoysSD1neg() {
		return weightForAge5to10BoysSD1neg;
	}

	public List<WeightForAge> getWeightForAge5to10BoysSD2neg() {
		return weightForAge5to10BoysSD2neg;
	}

	public List<WeightForAge> getWeightForAge5to10BoysSD3neg() {
		return weightForAge5to10BoysSD3neg;
	}

	public List<WeightForAge> getWeightForAge5to10GirlsSD3() {
		return weightForAge5to10GirlsSD3;
	}

	public List<WeightForAge> getWeightForAge5to10GirlsSD2() {
		return weightForAge5to10GirlsSD2;
	}

	public List<WeightForAge> getWeightForAge5to10GirlsSD1() {
		return weightForAge5to10GirlsSD1;
	}

	public List<WeightForAge> getWeightForAge5to10GirlsSD0() {
		return weightForAge5to10GirlsSD0;
	}

	public List<WeightForAge> getWeightForAge5to10GirlsSD1neg() {
		return weightForAge5to10GirlsSD1neg;
	}

	public List<WeightForAge> getWeightForAge5to10GirlsSD2neg() {
		return weightForAge5to10GirlsSD2neg;
	}

	public List<WeightForAge> getWeightForAge5to10GirlsSD3neg() {
		return weightForAge5to10GirlsSD3neg;
	}

	public List<WeightForAge> getWeightForAgeFromBirthBoysSD3() {
		return weightForAgeFromBirthBoysSD3;
	}

	public List<WeightForAge> getWeightForAgeFromBirthBoysSD2() {
		return weightForAgeFromBirthBoysSD2;
	}

	public List<WeightForAge> getWeightForAgeFromBirthBoysSD0() {
		return weightForAgeFromBirthBoysSD0;
	}

	public List<WeightForAge> getWeightForAgeFromBirthBoysSD2neg() {
		return weightForAgeFromBirthBoysSD2neg;
	}

	public List<WeightForAge> getWeightForAgeFromBirthBoysSD3neg() {
		return weightForAgeFromBirthBoysSD3neg;
	}

	public List<WeightForAge> getWeightForAgeFromBirthGirlsSD3() {
		return weightForAgeFromBirthGirlsSD3;
	}

	public List<WeightForAge> getWeightForAgeFromBirthGirlsSD2() {
		return weightForAgeFromBirthGirlsSD2;
	}

	public List<WeightForAge> getWeightForAgeFromBirthGirlsSD0() {
		return weightForAgeFromBirthGirlsSD0;
	}

	public List<WeightForAge> getWeightForAgeFromBirthGirlsSD2neg() {
		return weightForAgeFromBirthGirlsSD2neg;
	}

	public List<WeightForAge> getWeightForAgeFromBirthGirlsSD3neg() {
		return weightForAgeFromBirthGirlsSD3neg;
	}

	
	public List<BMIForAge> getBmiPercentileGirls50() {
		return bmiPercentileGirls50;
	}

	public void setBmiPercentileGirls50(List<BMIForAge> bmiPercentileGirls50) {
		this.bmiPercentileGirls50 = bmiPercentileGirls50;
	}
	
    public List<BMIForAge> getBmiPercentileGirls3() {
    	return bmiPercentileGirls3;
    }

	
    public void setBmiPercentileGirls3(List<BMIForAge> bmiPercentileGirls3) {
    	this.bmiPercentileGirls3 = bmiPercentileGirls3;
    }

	
    public List<BMIForAge> getBmiPercentileGirls15() {
    	return bmiPercentileGirls15;
    }

	
    public void setBmiPercentileGirls15(List<BMIForAge> bmiPercentileGirls15) {
    	this.bmiPercentileGirls15 = bmiPercentileGirls15;
    }

	
    public List<BMIForAge> getBmiPercentileGirls85() {
    	return bmiPercentileGirls85;
    }

	
    public void setBmiPercentileGirls85(List<BMIForAge> bmiPercentileGirls85) {
    	this.bmiPercentileGirls85 = bmiPercentileGirls85;
    }

	
    public List<BMIForAge> getBmiPercentileGirls97() {
    	return bmiPercentileGirls97;
    }

	
    public void setBmiPercentileGirls97(List<BMIForAge> bmiPercentileGirls97) {
    	this.bmiPercentileGirls97 = bmiPercentileGirls97;
    }

	
    public Map<Integer, Double> getBmiPercentileGirlsMean() {
    	return bmiPercentileGirlsMean;
    }

	
    public void setBmiPercentileGirlsMean(Map<Integer, Double> bmiPercentileGirlsMean) {
    	this.bmiPercentileGirlsMean = bmiPercentileGirlsMean;
    }

	
    public List<BMIForAge> getBmiPercentileBoys3() {
    	return bmiPercentileBoys3;
    }

	
    public void setBmiPercentileBoys3(List<BMIForAge> bmiPercentileBoys3) {
    	this.bmiPercentileBoys3 = bmiPercentileBoys3;
    }

	
    public List<BMIForAge> getBmiPercentileBoys15() {
    	return bmiPercentileBoys15;
    }

	
    public void setBmiPercentileBoys15(List<BMIForAge> bmiPercentileBoys15) {
    	this.bmiPercentileBoys15 = bmiPercentileBoys15;
    }

	
    public List<BMIForAge> getBmiPercentileBoys85() {
    	return bmiPercentileBoys85;
    }

	
    public void setBmiPercentileBoys85(List<BMIForAge> bmiPercentileBoys85) {
    	this.bmiPercentileBoys85 = bmiPercentileBoys85;
    }

	
    public List<BMIForAge> getBmiPercentileBoys97() {
    	return bmiPercentileBoys97;
    }

	
    public void setBmiPercentileBoys97(List<BMIForAge> bmiPercentileBoys97) {
    	this.bmiPercentileBoys97 = bmiPercentileBoys97;
    }

	
    public Map<Integer, Double> getBmiPercentileBoysMean() {
    	return bmiPercentileBoysMean;
    }

	
    public void setBmiPercentileBoysMean(Map<Integer, Double> bmiPercentileBoysMean) {
    	this.bmiPercentileBoysMean = bmiPercentileBoysMean;
    }

	public List<BMIForAge> getBmiPercentileBoys50() {
		return bmiPercentileBoys50;
	}

	public void setBmiPercentileBoys50(List<BMIForAge> bmiPercentileBoys50) {
		this.bmiPercentileBoys50 = bmiPercentileBoys50;
	}
	
    public Map<Integer, Double> getHeightForAge5to19BoysMean() {
    	return heightForAge5to19BoysMean;
    }

	
    public void setHeightForAge5to19BoysMean(Map<Integer, Double> heightForAge5to19BoysMean) {
    	this.heightForAge5to19BoysMean = heightForAge5to19BoysMean;
    }

	
    public Map<Integer, Double> getHeightForAge5to19GirlsMean() {
    	return heightForAge5to19GirlsMean;
    }

	
    public void setHeightForAge5to19GirlsMean(Map<Integer, Double> heightForAge5to19GirlsMean) {
    	this.heightForAge5to19GirlsMean = heightForAge5to19GirlsMean;
    }

	
    public Map<Integer, Double> getHeightForAgeFromBirthBoysMean() {
    	return heightForAgeFromBirthBoysMean;
    }

	
    public void setHeightForAgeFromBirthBoysMean(Map<Integer, Double> heightForAgeFromBirthBoysMean) {
    	this.heightForAgeFromBirthBoysMean = heightForAgeFromBirthBoysMean;
    }

	
    public Map<Integer, Double> getHeightForAgeFromBirthGirlsMean() {
    	return heightForAgeFromBirthGirlsMean;
    }

	
    public void setHeightForAgeFromBirthGirlsMean(Map<Integer, Double> heightForAgeFromBirthGirlsMean) {
    	this.heightForAgeFromBirthGirlsMean = heightForAgeFromBirthGirlsMean;
    }

	
    public Map<Integer, Double> getWeightForAge5to10BoysMean() {
    	return weightForAge5to10BoysMean;
    }

	
    public void setWeightForAge5to10BoysMean(Map<Integer, Double> weightForAge5to10BoysMean) {
    	this.weightForAge5to10BoysMean = weightForAge5to10BoysMean;
    }

	
    public Map<Integer, Double> getWeightForAge5to10GirlsMean() {
    	return weightForAge5to10GirlsMean;
    }

	
    public void setWeightForAge5to10GirlsMean(Map<Integer, Double> weightForAge5to10GirlsMean) {
    	this.weightForAge5to10GirlsMean = weightForAge5to10GirlsMean;
    }

	
    public Map<Integer, Double> getWeightForAgeFromBirthBoysMean() {
    	return weightForAgeFromBirthBoysMean;
    }

	
    public void setWeightForAgeFromBirthBoysMean(Map<Integer, Double> weightForAgeFromBirthBoysMean) {
    	this.weightForAgeFromBirthBoysMean = weightForAgeFromBirthBoysMean;
    }

	
    public Map<Integer, Double> getWeightForAgeFromBirthGirlsMean() {
    	return weightForAgeFromBirthGirlsMean;
    }

	
    public void setWeightForAgeFromBirthGirlsMean(Map<Integer, Double> weightForAgeFromBirthGirlsMean) {
    	this.weightForAgeFromBirthGirlsMean = weightForAgeFromBirthGirlsMean;
    }

	
    public Map<Integer, Double> getHeightForAge5to19BoysSD() {
    	return heightForAge5to19BoysSD;
    }

	
    public void setHeightForAge5to19BoysSD(Map<Integer, Double> heightForAge5to19BoysSD) {
    	this.heightForAge5to19BoysSD = heightForAge5to19BoysSD;
    }

	
    public Map<Integer, Double> getHeightForAge5to19GirlsSD() {
    	return heightForAge5to19GirlsSD;
    }

	
    public void setHeightForAge5to19GirlsSD(Map<Integer, Double> heightForAge5to19GirlsSD) {
    	this.heightForAge5to19GirlsSD = heightForAge5to19GirlsSD;
    }

	
    public Map<Integer, Double> getHeightForAgeFromBirthBoysSD() {
    	return heightForAgeFromBirthBoysSD;
    }

	
    public void setHeightForAgeFromBirthBoysSD(Map<Integer, Double> heightForAgeFromBirthBoysSD) {
    	this.heightForAgeFromBirthBoysSD = heightForAgeFromBirthBoysSD;
    }

	
    public Map<Integer, Double> getHeightForAgeFromBirthGirlsSD() {
    	return heightForAgeFromBirthGirlsSD;
    }

	
    public void setHeightForAgeFromBirthGirlsSD(Map<Integer, Double> heightForAgeFromBirthGirlsSD) {
    	this.heightForAgeFromBirthGirlsSD = heightForAgeFromBirthGirlsSD;
    }

	
    public Map<Integer, Double> getWeightForAge5to10BoysL() {
    	return weightForAge5to10BoysL;
    }

	
    public void setWeightForAge5to10BoysL(Map<Integer, Double> weightForAge5to10BoysL) {
    	this.weightForAge5to10BoysL = weightForAge5to10BoysL;
    }

	
    public Map<Integer, Double> getWeightForAge5to10BoysS() {
    	return weightForAge5to10BoysS;
    }

	
    public void setWeightForAge5to10BoysS(Map<Integer, Double> weightForAge5to10BoysS) {
    	this.weightForAge5to10BoysS = weightForAge5to10BoysS;
    }

	
    public Map<Integer, Double> getWeightForAge5to10GirlsL() {
    	return weightForAge5to10GirlsL;
    }

	
    public void setWeightForAge5to10GirlsL(Map<Integer, Double> weightForAge5to10GirlsL) {
    	this.weightForAge5to10GirlsL = weightForAge5to10GirlsL;
    }

	
    public Map<Integer, Double> getWeightForAge5to10GirlsS() {
    	return weightForAge5to10GirlsS;
    }

	
    public void setWeightForAge5to10GirlsS(Map<Integer, Double> weightForAge5to10GirlsS) {
    	this.weightForAge5to10GirlsS = weightForAge5to10GirlsS;
    }

	
    public Map<Integer, Double> getWeightForAgeFromBirthBoysL() {
    	return weightForAgeFromBirthBoysL;
    }

	
    public void setWeightForAgeFromBirthBoysL(Map<Integer, Double> weightForAgeFromBirthBoysL) {
    	this.weightForAgeFromBirthBoysL = weightForAgeFromBirthBoysL;
    }

	
    public Map<Integer, Double> getWeightForAgeFromBirthBoysS() {
    	return weightForAgeFromBirthBoysS;
    }

	
    public void setWeightForAgeFromBirthBoysS(Map<Integer, Double> weightForAgeFromBirthBoysS) {
    	this.weightForAgeFromBirthBoysS = weightForAgeFromBirthBoysS;
    }

	
    public Map<Integer, Double> getWeightForAgeFromBirthGirlsL() {
    	return weightForAgeFromBirthGirlsL;
    }

	
    public void setWeightForAgeFromBirthGirlsL(Map<Integer, Double> weightForAgeFromBirthGirlsL) {
    	this.weightForAgeFromBirthGirlsL = weightForAgeFromBirthGirlsL;
    }

	
    public Map<Integer, Double> getWeightForAgeFromBirthGirlsS() {
    	return weightForAgeFromBirthGirlsS;
    }

	
    public void setWeightForAgeFromBirthGirlsS(Map<Integer, Double> weightForAgeFromBirthGirlsS) {
    	this.weightForAgeFromBirthGirlsS = weightForAgeFromBirthGirlsS;
    }
	
    public List<BMIForAge> getBmiZScoreGirlsSD3() {
    	return bmiZScoreGirlsSD3;
    }

	
    public void setBmiZScoreGirlsSD3(List<BMIForAge> bmiZScoreGirlsSD3) {
    	this.bmiZScoreGirlsSD3 = bmiZScoreGirlsSD3;
    }

	
    public List<BMIForAge> getBmiZScoreGirlsSD2() {
    	return bmiZScoreGirlsSD2;
    }

	
    public void setBmiZScoreGirlsSD2(List<BMIForAge> bmiZScoreGirlsSD2) {
    	this.bmiZScoreGirlsSD2 = bmiZScoreGirlsSD2;
    }

	
    public List<BMIForAge> getBmiZScoreGirlsSD1() {
    	return bmiZScoreGirlsSD1;
    }

	
    public void setBmiZScoreGirlsSD1(List<BMIForAge> bmiZScoreGirlsSD1) {
    	this.bmiZScoreGirlsSD1 = bmiZScoreGirlsSD1;
    }

	
    public List<BMIForAge> getBmiZScoreGirlsSD0() {
    	return bmiZScoreGirlsSD0;
    }
    
    public List<WeightForHeight> getWeightForHeightGirlsSD3() {
    	return weightForHeightGirlsSD3;
    }

	
    public void setWeightForHeightGirlsSD3(List<WeightForHeight> weightForHeightGirlsSD3) {
    	this.weightForHeightGirlsSD3 = weightForHeightGirlsSD3;
    }

	
    public List<WeightForHeight> getWeightForHeightGirlsSD2() {
    	return weightForHeightGirlsSD2;
    }

	
    public void setWeightForHeightGirlsSD2(List<WeightForHeight> weightForHeightGirlsSD2) {
    	this.weightForHeightGirlsSD2 = weightForHeightGirlsSD2;
    }

	
    public List<WeightForHeight> getWeightForHeightGirlsSD1() {
    	return weightForHeightGirlsSD1;
    }

	
    public void setWeightForHeightGirlsSD1(List<WeightForHeight> weightForHeightGirlsSD1) {
    	this.weightForHeightGirlsSD1 = weightForHeightGirlsSD1;
    }

	
    public List<WeightForHeight> getWeightForHeightGirlsSD0() {
    	return weightForHeightGirlsSD0;
    }

	
    public void setWeightForHeightGirlsSD0(List<WeightForHeight> weightForHeightGirlsSD0) {
    	this.weightForHeightGirlsSD0 = weightForHeightGirlsSD0;
    }

	
    public List<WeightForHeight> getWeightForHeightGirlsSD1neg() {
    	return weightForHeightGirlsSD1neg;
    }

	
    public void setWeightForHeightGirlsSD1neg(List<WeightForHeight> weightForHeightGirlsSD1neg) {
    	this.weightForHeightGirlsSD1neg = weightForHeightGirlsSD1neg;
    }

	
    public List<WeightForHeight> getWeightForHeightGirlsSD2neg() {
    	return weightForHeightGirlsSD2neg;
    }

	
    public void setWeightForHeightGirlsSD2neg(List<WeightForHeight> weightForHeightGirlsSD2neg) {
    	this.weightForHeightGirlsSD2neg = weightForHeightGirlsSD2neg;
    }

	
    public List<WeightForHeight> getWeightForHeightGirlsSD3neg() {
    	return weightForHeightGirlsSD3neg;
    }

	
    public void setWeightForHeightGirlsSD3neg(List<WeightForHeight> weightForHeightGirlsSD3neg) {
    	this.weightForHeightGirlsSD3neg = weightForHeightGirlsSD3neg;
    }

	
    public List<WeightForHeight> getWeightForHeightBoysSD3() {
    	return weightForHeightBoysSD3;
    }

	
    public void setWeightForHeightBoysSD3(List<WeightForHeight> weightForHeightBoysSD3) {
    	this.weightForHeightBoysSD3 = weightForHeightBoysSD3;
    }

	
    public List<WeightForHeight> getWeightForHeightBoysSD2() {
    	return weightForHeightBoysSD2;
    }

	
    public void setWeightForHeightBoysSD2(List<WeightForHeight> weightForHeightBoysSD2) {
    	this.weightForHeightBoysSD2 = weightForHeightBoysSD2;
    }

	
    public List<WeightForHeight> getWeightForHeightBoysSD1() {
    	return weightForHeightBoysSD1;
    }

	
    public void setWeightForHeightBoysSD1(List<WeightForHeight> weightForHeightBoysSD1) {
    	this.weightForHeightBoysSD1 = weightForHeightBoysSD1;
    }

	
    public List<WeightForHeight> getWeightForHeightBoysSD0() {
    	return weightForHeightBoysSD0;
    }

	
    public void setWeightForHeightBoysSD0(List<WeightForHeight> weightForHeightBoysSD0) {
    	this.weightForHeightBoysSD0 = weightForHeightBoysSD0;
    }

	
    public List<WeightForHeight> getWeightForHeightBoysSD1neg() {
    	return weightForHeightBoysSD1neg;
    }

	
    public void setWeightForHeightBoysSD1neg(List<WeightForHeight> weightForHeightBoysSD1neg) {
    	this.weightForHeightBoysSD1neg = weightForHeightBoysSD1neg;
    }

	
    public List<WeightForHeight> getWeightForHeightBoysSD2neg() {
    	return weightForHeightBoysSD2neg;
    }

	
    public void setWeightForHeightBoysSD2neg(List<WeightForHeight> weightForHeightBoysSD2neg) {
    	this.weightForHeightBoysSD2neg = weightForHeightBoysSD2neg;
    }

	
    public List<WeightForHeight> getWeightForHeightBoysSD3neg() {
    	return weightForHeightBoysSD3neg;
    }

	
    public void setWeightForHeightBoysSD3neg(List<WeightForHeight> weightForHeightBoysSD3neg) {
    	this.weightForHeightBoysSD3neg = weightForHeightBoysSD3neg;
    }

	
    public List<WeightForHeight> getWeightForLengthBoysSD3() {
    	return weightForLengthBoysSD3;
    }

	
    public void setWeightForLengthBoysSD3(List<WeightForHeight> weightForLengthBoysSD3) {
    	this.weightForLengthBoysSD3 = weightForLengthBoysSD3;
    }

	
    public List<WeightForHeight> getWeightForLengthBoysSD2() {
    	return weightForLengthBoysSD2;
    }

	
    public void setWeightForLengthBoysSD2(List<WeightForHeight> weightForLengthBoysSD2) {
    	this.weightForLengthBoysSD2 = weightForLengthBoysSD2;
    }

	
    public List<WeightForHeight> getWeightForLengthBoysSD1() {
    	return weightForLengthBoysSD1;
    }

	
    public void setWeightForLengthBoysSD1(List<WeightForHeight> weightForLengthBoysSD1) {
    	this.weightForLengthBoysSD1 = weightForLengthBoysSD1;
    }

	
    public List<WeightForHeight> getWeightForLengthBoysSD0() {
    	return weightForLengthBoysSD0;
    }

	
    public void setWeightForLengthBoysSD0(List<WeightForHeight> weightForLengthBoysSD0) {
    	this.weightForLengthBoysSD0 = weightForLengthBoysSD0;
    }

	
    public List<WeightForHeight> getWeightForLengthBoysSD1neg() {
    	return weightForLengthBoysSD1neg;
    }

	
    public void setWeightForLengthBoysSD1neg(List<WeightForHeight> weightForLengthBoysSD1neg) {
    	this.weightForLengthBoysSD1neg = weightForLengthBoysSD1neg;
    }

	
    public List<WeightForHeight> getWeightForLengthBoysSD2neg() {
    	return weightForLengthBoysSD2neg;
    }

	
    public void setWeightForLengthBoysSD2neg(List<WeightForHeight> weightForLengthBoysSD2neg) {
    	this.weightForLengthBoysSD2neg = weightForLengthBoysSD2neg;
    }

	
    public List<WeightForHeight> getWeightForLengthBoysSD3neg() {
    	return weightForLengthBoysSD3neg;
    }

	
    public void setWeightForLengthBoysSD3neg(List<WeightForHeight> weightForLengthBoysSD3neg) {
    	this.weightForLengthBoysSD3neg = weightForLengthBoysSD3neg;
    }

	
    public List<WeightForHeight> getWeightForLengthGirlsSD3() {
    	return weightForLengthGirlsSD3;
    }

	
    public void setWeightForLengthGirlsSD3(List<WeightForHeight> weightForLengthGirlsSD3) {
    	this.weightForLengthGirlsSD3 = weightForLengthGirlsSD3;
    }

	
    public List<WeightForHeight> getWeightForLengthGirlsSD2() {
    	return weightForLengthGirlsSD2;
    }

	
    public void setWeightForLengthGirlsSD2(List<WeightForHeight> weightForLengthGirlsSD2) {
    	this.weightForLengthGirlsSD2 = weightForLengthGirlsSD2;
    }

	
    public List<WeightForHeight> getWeightForLengthGirlsSD1() {
    	return weightForLengthGirlsSD1;
    }

	
    public void setWeightForLengthGirlsSD1(List<WeightForHeight> weightForLengthGirlsSD1) {
    	this.weightForLengthGirlsSD1 = weightForLengthGirlsSD1;
    }

	
    public List<WeightForHeight> getWeightForLengthGirlsSD0() {
    	return weightForLengthGirlsSD0;
    }

	
    public void setWeightForLengthGirlsSD0(List<WeightForHeight> weightForLengthGirlsSD0) {
    	this.weightForLengthGirlsSD0 = weightForLengthGirlsSD0;
    }

	
    public List<WeightForHeight> getWeightForLengthGirlsSD1neg() {
    	return weightForLengthGirlsSD1neg;
    }

	
    public void setWeightForLengthGirlsSD1neg(List<WeightForHeight> weightForLengthGirlsSD1neg) {
    	this.weightForLengthGirlsSD1neg = weightForLengthGirlsSD1neg;
    }

	
    public List<WeightForHeight> getWeightForLengthGirlsSD2neg() {
    	return weightForLengthGirlsSD2neg;
    }

	
    public void setWeightForLengthGirlsSD2neg(List<WeightForHeight> weightForLengthGirlsSD2neg) {
    	this.weightForLengthGirlsSD2neg = weightForLengthGirlsSD2neg;
    }

	
    public List<WeightForHeight> getWeightForLengthGirlsSD3neg() {
    	return weightForLengthGirlsSD3neg;
    }

	
    public void setWeightForLengthGirlsSD3neg(List<WeightForHeight> weightForLengthGirlsSD3neg) {
    	this.weightForLengthGirlsSD3neg = weightForLengthGirlsSD3neg;
    }

	public void setBmiZScoreGirlsSD0(List<BMIForAge> bmiZScoreGirlsSD0) {
    	this.bmiZScoreGirlsSD0 = bmiZScoreGirlsSD0;
    }

	
    public List<BMIForAge> getBmiZScoreGirlsSD1neg() {
    	return bmiZScoreGirlsSD1neg;
    }

	
    public void setBmiZScoreGirlsSD1neg(List<BMIForAge> bmiZScoreGirlsSD1neg) {
    	this.bmiZScoreGirlsSD1neg = bmiZScoreGirlsSD1neg;
    }

	
    public List<BMIForAge> getBmiZScoreGirlsSD2neg() {
    	return bmiZScoreGirlsSD2neg;
    }

	
    public void setBmiZScoreGirlsSD2neg(List<BMIForAge> bmiZScoreGirlsSD2neg) {
    	this.bmiZScoreGirlsSD2neg = bmiZScoreGirlsSD2neg;
    }

	
    public List<BMIForAge> getBmiZScoreGirlsSD3neg() {
    	return bmiZScoreGirlsSD3neg;
    }

	
    public void setBmiZScoreGirlsSD3neg(List<BMIForAge> bmiZScoreGirlsSD3neg) {
    	this.bmiZScoreGirlsSD3neg = bmiZScoreGirlsSD3neg;
    }

	
    public Map<Integer, Double> getBmiZScoreGirlsMean() {
    	return bmiZScoreGirlsMean;
    }

	
    public void setBmiZScoreGirlsMean(Map<Integer, Double> bmiZScoreGirlsMean) {
    	this.bmiZScoreGirlsMean = bmiZScoreGirlsMean;
    }

	
    public Map<Integer, Double> getBmiZScoreGirlsL() {
    	return bmiZScoreGirlsL;
    }

	
    public void setBmiZScoreGirlsL(Map<Integer, Double> bmiZScoreGirlsL) {
    	this.bmiZScoreGirlsL = bmiZScoreGirlsL;
    }

	
    public Map<Integer, Double> getBmiZScoreGirlsS() {
    	return bmiZScoreGirlsS;
    }

	
    public void setBmiZScoreGirlsS(Map<Integer, Double> bmiZScoreGirlsS) {
    	this.bmiZScoreGirlsS = bmiZScoreGirlsS;
    }

	
    public List<BMIForAge> getBmiZScoreBoysSD3() {
    	return bmiZScoreBoysSD3;
    }

	
    public void setBmiZScoreBoysSD3(List<BMIForAge> bmiZScoreBoysSD3) {
    	this.bmiZScoreBoysSD3 = bmiZScoreBoysSD3;
    }

	
    public List<BMIForAge> getBmiZScoreBoysSD2() {
    	return bmiZScoreBoysSD2;
    }

	
    public void setBmiZScoreBoysSD2(List<BMIForAge> bmiZScoreBoysSD2) {
    	this.bmiZScoreBoysSD2 = bmiZScoreBoysSD2;
    }

	
    public List<BMIForAge> getBmiZScoreBoysSD1() {
    	return bmiZScoreBoysSD1;
    }

	
    public void setBmiZScoreBoysSD1(List<BMIForAge> bmiZScoreBoysSD1) {
    	this.bmiZScoreBoysSD1 = bmiZScoreBoysSD1;
    }

	
    public List<BMIForAge> getBmiZScoreBoysSD0() {
    	return bmiZScoreBoysSD0;
    }

	
    public void setBmiZScoreBoysSD0(List<BMIForAge> bmiZScoreBoysSD0) {
    	this.bmiZScoreBoysSD0 = bmiZScoreBoysSD0;
    }

	
    public List<BMIForAge> getBmiZScoreBoysSD1neg() {
    	return bmiZScoreBoysSD1neg;
    }

	
    public void setBmiZScoreBoysSD1neg(List<BMIForAge> bmiZScoreBoysSD1neg) {
    	this.bmiZScoreBoysSD1neg = bmiZScoreBoysSD1neg;
    }

	
    public List<BMIForAge> getBmiZScoreBoysSD2neg() {
    	return bmiZScoreBoysSD2neg;
    }

	
    public void setBmiZScoreBoysSD2neg(List<BMIForAge> bmiZScoreBoysSD2neg) {
    	this.bmiZScoreBoysSD2neg = bmiZScoreBoysSD2neg;
    }

	
    public List<BMIForAge> getBmiZScoreBoysSD3neg() {
    	return bmiZScoreBoysSD3neg;
    }

	
    public void setBmiZScoreBoysSD3neg(List<BMIForAge> bmiZScoreBoysSD3neg) {
    	this.bmiZScoreBoysSD3neg = bmiZScoreBoysSD3neg;
    }

	
    public Map<Integer, Double> getBmiZScoreBoysMean() {
    	return bmiZScoreBoysMean;
    }

	
    public void setBmiZScoreBoysMean(Map<Integer, Double> bmiZScoreBoysMean) {
    	this.bmiZScoreBoysMean = bmiZScoreBoysMean;
    }

	
    public Map<Integer, Double> getBmiZScoreBoysL() {
    	return bmiZScoreBoysL;
    }

	
    public void setBmiZScoreBoysL(Map<Integer, Double> bmiZScoreBoysL) {
    	this.bmiZScoreBoysL = bmiZScoreBoysL;
    }

	
    public Map<Integer, Double> getBmiZScoreBoysS() {
    	return bmiZScoreBoysS;
    }

	
    public void setBmiZScoreBoysS(Map<Integer, Double> bmiZScoreBoysS) {
    	this.bmiZScoreBoysS = bmiZScoreBoysS;
    }

	
    public void setHeightForAge5to19BoysSD3(List<HeightForAge> heightForAge5to19BoysSD3) {
    	this.heightForAge5to19BoysSD3 = heightForAge5to19BoysSD3;
    }

	
    public void setHeightForAge5to19BoysSD2(List<HeightForAge> heightForAge5to19BoysSD2) {
    	this.heightForAge5to19BoysSD2 = heightForAge5to19BoysSD2;
    }

	
    public void setHeightForAge5to19BoysSD1(List<HeightForAge> heightForAge5to19BoysSD1) {
    	this.heightForAge5to19BoysSD1 = heightForAge5to19BoysSD1;
    }

	
    public void setHeightForAge5to19BoysSD0(List<HeightForAge> heightForAge5to19BoysSD0) {
    	this.heightForAge5to19BoysSD0 = heightForAge5to19BoysSD0;
    }

	
    public void setHeightForAge5to19BoysSD1neg(List<HeightForAge> heightForAge5to19BoysSD1neg) {
    	this.heightForAge5to19BoysSD1neg = heightForAge5to19BoysSD1neg;
    }

	
    public void setHeightForAge5to19BoysSD2neg(List<HeightForAge> heightForAge5to19BoysSD2neg) {
    	this.heightForAge5to19BoysSD2neg = heightForAge5to19BoysSD2neg;
    }

	
    public void setHeightForAge5to19BoysSD3neg(List<HeightForAge> heightForAge5to19BoysSD3neg) {
    	this.heightForAge5to19BoysSD3neg = heightForAge5to19BoysSD3neg;
    }

	
    public void setHeightForAge5to19GirlsSD3(List<HeightForAge> heightForAge5to19GirlsSD3) {
    	this.heightForAge5to19GirlsSD3 = heightForAge5to19GirlsSD3;
    }

	
    public void setHeightForAge5to19GirlsSD2(List<HeightForAge> heightForAge5to19GirlsSD2) {
    	this.heightForAge5to19GirlsSD2 = heightForAge5to19GirlsSD2;
    }

	
    public void setHeightForAge5to19GirlsSD1(List<HeightForAge> heightForAge5to19GirlsSD1) {
    	this.heightForAge5to19GirlsSD1 = heightForAge5to19GirlsSD1;
    }

	
    public void setHeightForAge5to19GirlsSD0(List<HeightForAge> heightForAge5to19GirlsSD0) {
    	this.heightForAge5to19GirlsSD0 = heightForAge5to19GirlsSD0;
    }

	
    public void setHeightForAge5to19GirlsSD1neg(List<HeightForAge> heightForAge5to19GirlsSD1neg) {
    	this.heightForAge5to19GirlsSD1neg = heightForAge5to19GirlsSD1neg;
    }

	
    public void setHeightForAge5to19GirlsSD2neg(List<HeightForAge> heightForAge5to19GirlsSD2neg) {
    	this.heightForAge5to19GirlsSD2neg = heightForAge5to19GirlsSD2neg;
    }

	
    public void setHeightForAge5to19GirlsSD3neg(List<HeightForAge> heightForAge5to19GirlsSD3neg) {
    	this.heightForAge5to19GirlsSD3neg = heightForAge5to19GirlsSD3neg;
    }

	
    public void setHeightForAgeFromBirthBoysSD3(List<HeightForAge> heightForAgeFromBirthBoysSD3) {
    	this.heightForAgeFromBirthBoysSD3 = heightForAgeFromBirthBoysSD3;
    }

	
    public void setHeightForAgeFromBirthBoysSD2(List<HeightForAge> heightForAgeFromBirthBoysSD2) {
    	this.heightForAgeFromBirthBoysSD2 = heightForAgeFromBirthBoysSD2;
    }

	
    public void setHeightForAgeFromBirthBoysSD0(List<HeightForAge> heightForAgeFromBirthBoysSD0) {
    	this.heightForAgeFromBirthBoysSD0 = heightForAgeFromBirthBoysSD0;
    }

	
    public void setHeightForAgeFromBirthBoysSD2neg(List<HeightForAge> heightForAgeFromBirthBoysSD2neg) {
    	this.heightForAgeFromBirthBoysSD2neg = heightForAgeFromBirthBoysSD2neg;
    }

	
    public void setHeightForAgeFromBirthBoysSD3neg(List<HeightForAge> heightForAgeFromBirthBoysSD3neg) {
    	this.heightForAgeFromBirthBoysSD3neg = heightForAgeFromBirthBoysSD3neg;
    }

	
    public void setHeightForAgeFromBirthGirlsSD3(List<HeightForAge> heightForAgeFromBirthGirlsSD3) {
    	this.heightForAgeFromBirthGirlsSD3 = heightForAgeFromBirthGirlsSD3;
    }

	
    public void setHeightForAgeFromBirthGirlsSD2(List<HeightForAge> heightForAgeFromBirthGirlsSD2) {
    	this.heightForAgeFromBirthGirlsSD2 = heightForAgeFromBirthGirlsSD2;
    }

	
    public void setHeightForAgeFromBirthGirlsSD0(List<HeightForAge> heightForAgeFromBirthGirlsSD0) {
    	this.heightForAgeFromBirthGirlsSD0 = heightForAgeFromBirthGirlsSD0;
    }

	
    public void setHeightForAgeFromBirthGirlsSD2neg(List<HeightForAge> heightForAgeFromBirthGirlsSD2neg) {
    	this.heightForAgeFromBirthGirlsSD2neg = heightForAgeFromBirthGirlsSD2neg;
    }

	
    public void setHeightForAgeFromBirthGirlsSD3neg(List<HeightForAge> heightForAgeFromBirthGirlsSD3neg) {
    	this.heightForAgeFromBirthGirlsSD3neg = heightForAgeFromBirthGirlsSD3neg;
    }

	
    public void setWeightForAge5to10BoysSD3(List<WeightForAge> weightForAge5to10BoysSD3) {
    	this.weightForAge5to10BoysSD3 = weightForAge5to10BoysSD3;
    }

	
    public void setWeightForAge5to10BoysSD2(List<WeightForAge> weightForAge5to10BoysSD2) {
    	this.weightForAge5to10BoysSD2 = weightForAge5to10BoysSD2;
    }

	
    public void setWeightForAge5to10BoysSD1(List<WeightForAge> weightForAge5to10BoysSD1) {
    	this.weightForAge5to10BoysSD1 = weightForAge5to10BoysSD1;
    }

	
    public void setWeightForAge5to10BoysSD0(List<WeightForAge> weightForAge5to10BoysSD0) {
    	this.weightForAge5to10BoysSD0 = weightForAge5to10BoysSD0;
    }

	
    public void setWeightForAge5to10BoysSD1neg(List<WeightForAge> weightForAge5to10BoysSD1neg) {
    	this.weightForAge5to10BoysSD1neg = weightForAge5to10BoysSD1neg;
    }

	
    public void setWeightForAge5to10BoysSD2neg(List<WeightForAge> weightForAge5to10BoysSD2neg) {
    	this.weightForAge5to10BoysSD2neg = weightForAge5to10BoysSD2neg;
    }

	
    public void setWeightForAge5to10BoysSD3neg(List<WeightForAge> weightForAge5to10BoysSD3neg) {
    	this.weightForAge5to10BoysSD3neg = weightForAge5to10BoysSD3neg;
    }

	
    public void setWeightForAge5to10GirlsSD3(List<WeightForAge> weightForAge5to10GirlsSD3) {
    	this.weightForAge5to10GirlsSD3 = weightForAge5to10GirlsSD3;
    }

	
    public void setWeightForAge5to10GirlsSD2(List<WeightForAge> weightForAge5to10GirlsSD2) {
    	this.weightForAge5to10GirlsSD2 = weightForAge5to10GirlsSD2;
    }

	
    public void setWeightForAge5to10GirlsSD1(List<WeightForAge> weightForAge5to10GirlsSD1) {
    	this.weightForAge5to10GirlsSD1 = weightForAge5to10GirlsSD1;
    }

	
    public void setWeightForAge5to10GirlsSD0(List<WeightForAge> weightForAge5to10GirlsSD0) {
    	this.weightForAge5to10GirlsSD0 = weightForAge5to10GirlsSD0;
    }

	
    public void setWeightForAge5to10GirlsSD1neg(List<WeightForAge> weightForAge5to10GirlsSD1neg) {
    	this.weightForAge5to10GirlsSD1neg = weightForAge5to10GirlsSD1neg;
    }

	
    public void setWeightForAge5to10GirlsSD2neg(List<WeightForAge> weightForAge5to10GirlsSD2neg) {
    	this.weightForAge5to10GirlsSD2neg = weightForAge5to10GirlsSD2neg;
    }

	
    public void setWeightForAge5to10GirlsSD3neg(List<WeightForAge> weightForAge5to10GirlsSD3neg) {
    	this.weightForAge5to10GirlsSD3neg = weightForAge5to10GirlsSD3neg;
    }

	
    public void setWeightForAgeFromBirthBoysSD3(List<WeightForAge> weightForAgeFromBirthBoysSD3) {
    	this.weightForAgeFromBirthBoysSD3 = weightForAgeFromBirthBoysSD3;
    }

	
    public void setWeightForAgeFromBirthBoysSD2(List<WeightForAge> weightForAgeFromBirthBoysSD2) {
    	this.weightForAgeFromBirthBoysSD2 = weightForAgeFromBirthBoysSD2;
    }

	
    public void setWeightForAgeFromBirthBoysSD0(List<WeightForAge> weightForAgeFromBirthBoysSD0) {
    	this.weightForAgeFromBirthBoysSD0 = weightForAgeFromBirthBoysSD0;
    }

	
    public void setWeightForAgeFromBirthBoysSD2neg(List<WeightForAge> weightForAgeFromBirthBoysSD2neg) {
    	this.weightForAgeFromBirthBoysSD2neg = weightForAgeFromBirthBoysSD2neg;
    }

	
    public void setWeightForAgeFromBirthBoysSD3neg(List<WeightForAge> weightForAgeFromBirthBoysSD3neg) {
    	this.weightForAgeFromBirthBoysSD3neg = weightForAgeFromBirthBoysSD3neg;
    }

	
    public void setWeightForAgeFromBirthGirlsSD3(List<WeightForAge> weightForAgeFromBirthGirlsSD3) {
    	this.weightForAgeFromBirthGirlsSD3 = weightForAgeFromBirthGirlsSD3;
    }

	
    public void setWeightForAgeFromBirthGirlsSD2(List<WeightForAge> weightForAgeFromBirthGirlsSD2) {
    	this.weightForAgeFromBirthGirlsSD2 = weightForAgeFromBirthGirlsSD2;
    }

	
    public void setWeightForAgeFromBirthGirlsSD0(List<WeightForAge> weightForAgeFromBirthGirlsSD0) {
    	this.weightForAgeFromBirthGirlsSD0 = weightForAgeFromBirthGirlsSD0;
    }

	
    public void setWeightForAgeFromBirthGirlsSD2neg(List<WeightForAge> weightForAgeFromBirthGirlsSD2neg) {
    	this.weightForAgeFromBirthGirlsSD2neg = weightForAgeFromBirthGirlsSD2neg;
    }

	
    public void setWeightForAgeFromBirthGirlsSD3neg(List<WeightForAge> weightForAgeFromBirthGirlsSD3neg) {
    	this.weightForAgeFromBirthGirlsSD3neg = weightForAgeFromBirthGirlsSD3neg;
    }

	
    public Map<Double, Double> getWeightForHeightGirlsIdeal() {
    	return weightForHeightGirlsIdeal;
    }

	
    public void setWeightForHeightGirlsIdeal(Map<Double, Double> weightForHeightGirlsIdeal) {
    	this.weightForHeightGirlsIdeal = weightForHeightGirlsIdeal;
    }

	
    public Map<Double, Double> getWeightForHeightBoysIdeal() {
    	return weightForHeightBoysIdeal;
    }

	
    public void setWeightForHeightBoysIdeal(Map<Double, Double> weightForHeightBoysIdeal) {
    	this.weightForHeightBoysIdeal = weightForHeightBoysIdeal;
    }

	
    public Map<Double, Double> getWeightForLengthBoysIdeal() {
    	return weightForLengthBoysIdeal;
    }

	
    public void setWeightForLengthBoysIdeal(Map<Double, Double> weightForLengthBoysIdeal) {
    	this.weightForLengthBoysIdeal = weightForLengthBoysIdeal;
    }

	
    public Map<Double, Double> getWeightForLengthGirlsIdeal() {
    	return weightForLengthGirlsIdeal;
    }

	
    public void setWeightForLengthGirlsIdeal(Map<Double, Double> weightForLengthGirlsIdeal) {
    	this.weightForLengthGirlsIdeal = weightForLengthGirlsIdeal;
    }
}
