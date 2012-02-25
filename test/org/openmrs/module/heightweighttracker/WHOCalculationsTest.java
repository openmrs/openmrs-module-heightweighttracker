package org.openmrs.module.heightweighttracker;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.heightweighttracker.impl.pih.ConceptDictionary;
import org.openmrs.module.heightweighttracker.mapper.WHOCalculations;
import org.openmrs.test.BaseContextSensitiveTest;

public class WHOCalculationsTest {
	
	private WHOCalculations whoCalculations = new WHOCalculations();
	
	private Date millenium;
	private Date years6;
	private Date years1;
	private Date years3;
	private Date years12;
	private Date years21;
	
	
	@Before
	public void runBeforeAllTests() throws Exception {
	
		Calendar cal = Calendar.getInstance();
		cal.set(2000, 1, 1);
		millenium = cal.getTime();
		cal.set(2006,2,2);
		years6 = cal.getTime();
		cal.set(2001,2,2);
		years1 = cal.getTime();
		cal.set(2012,2,2);
		years12 = cal.getTime();
		cal.set(2021,2,2);
		years21 = cal.getTime();
		cal.set(2003,2,2);
		years3 = cal.getTime();
	}
	
	@Test
	public void testCalculatedBMIForAgeGirl() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years6);
		height.setPerson(patient);
		height.setValueNumeric(new Double(120));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years6);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(20));
		
		Double bmiForAge = new Double(whoCalculations.getCalculatedBmiForAge(height, weight));
		Assert.assertTrue(bmiForAge < -0.9 && bmiForAge > -1);
	}
	
	@Test
	public void testCalculatedBMIForAgeBoy() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years6);
		height.setPerson(patient);
		height.setValueNumeric(new Double(120));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years6);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(20));
		
		Double bmiForAge = new Double(whoCalculations.getCalculatedBmiForAge(height, weight));
		Assert.assertTrue(bmiForAge < -1.1 && bmiForAge > -1.2);
	}
	
	@Test
	public void testCalculatedBMIForUnderAge() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years1);
		height.setPerson(patient);
		height.setValueNumeric(new Double(120));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years1);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(20));
		
		String bmiForAge = whoCalculations.getCalculatedBmiForAge(height, weight);
		Assert.assertTrue(bmiForAge == null);
	}
	
	@Test
	public void testCalculatedBMIForOverAge() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years21);
		height.setPerson(patient);
		height.setValueNumeric(new Double(120));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years21);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(20));
		
		String bmiForAge = whoCalculations.getCalculatedBmiForAge(height, weight);
		Assert.assertTrue(bmiForAge == null);
	}
	
	@Test
	public void testCalculatedHeightWeightPercentileAgeGirlLength() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years1);
		height.setPerson(patient);
		height.setValueNumeric(new Double(45.9));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years1);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(2.614));
		
		Double percentile = new Double(whoCalculations.getCalculatedHeightWeightPercentile(height, weight));
		Assert.assertTrue(percentile == 100);
	}
	
	@Test
	public void testCalculatedHeightWeightPercentileAgeGirlHeight() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years3);
		height.setPerson(patient);
		height.setValueNumeric(new Double(67.2));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years3);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(7.723));
		
		Double percentile = new Double(whoCalculations.getCalculatedHeightWeightPercentile(height, weight));
		Assert.assertTrue(percentile == 100);
	}
	
	@Test
	public void testCalculatedHeightWeightPercentileAgeBoysLength() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years1);
		height.setPerson(patient);
		height.setValueNumeric(new Double(47.1));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years1);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(2.792));
		
		Double percentile = new Double(whoCalculations.getCalculatedHeightWeightPercentile(height, weight));
		Assert.assertTrue(percentile == 100);
	}
	
	@Test
	public void testCalculatedHeightWeightPercentileAgeBoysHeight() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years3);
		height.setPerson(patient);
		height.setValueNumeric(new Double(66.8));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years3);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(7.853));
		
		Double percentile = new Double(whoCalculations.getCalculatedHeightWeightPercentile(height, weight));
		Assert.assertTrue(percentile == 100);
	}
	
	@Test
	public void testCalculatedHeightWeightPercentileOverAge() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years6);
		height.setPerson(patient);
		height.setValueNumeric(new Double(66.8));
		
		Obs weight = new Obs();
		//weight.setConcept(Context.getConceptService().getConcept(ConceptDictionary.WEIGHT_KG));
		weight.setObsDatetime(years6);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(7.853));
		
		String percentile = whoCalculations.getCalculatedHeightWeightPercentile(height, weight);
		Assert.assertTrue(percentile == null);
	}
	
	@Test
	public void testCalculatedHeightZScoreGirlTwo() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years1);
		height.setPerson(patient);
		height.setValueNumeric(new Double(80.5));
		
		Double percentile = new Double(whoCalculations.getCalculatedZScoreHeight(height));
		Assert.assertTrue(percentile > 2 && percentile < 2.02);
	}
	
	
	@Test
	public void testCalculatedHeightZScoreGirlTen() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years6);
		height.setPerson(patient);
		height.setValueNumeric(new Double(136.2));
		
		Double percentile = new Double(whoCalculations.getCalculatedZScoreHeight(height));
		Assert.assertTrue(percentile == 4);
	}
	
	@Test
	public void testCalculatedHeightZScoreOverAge() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years21);
		height.setPerson(patient);
		height.setValueNumeric(new Double(136.2));
		
		String percentile = whoCalculations.getCalculatedZScoreHeight(height);
		Assert.assertTrue(percentile == null);
	}
	
	@Test
	public void testCalculatedHeightZScoreBoyTwo() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years1);
		height.setPerson(patient);
		height.setValueNumeric(new Double(81.8));
		
		Double percentile = new Double(whoCalculations.getCalculatedZScoreHeight(height));
		Assert.assertTrue(percentile > 2 && percentile < 2.02);
	}
	
	
	@Test
	public void testCalculatedHeightZScoreBoyTen() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs height = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		height.setObsDatetime(years6);
		height.setPerson(patient);
		height.setValueNumeric(new Double(136.271));
		
		Double percentile = new Double(whoCalculations.getCalculatedZScoreHeight(height));
		Assert.assertTrue(percentile == 4);
	}
	
	@Test
	public void testCalculatedWeightZScoreGirlTwo() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs weight = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		weight.setObsDatetime(years1);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(11.8));
		
		Double percentile = new Double(whoCalculations.getCalculatedZScoreWeight(weight));
		Assert.assertTrue(percentile == 2);
	}
	
	
	@Test
	public void testCalculatedWeightZScoreGirlTen() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs weight = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		weight.setObsDatetime(years6);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(33.822));
		
		Double percentile = new Double(whoCalculations.getCalculatedZScoreWeight(weight));
		Assert.assertTrue(percentile == 3);
	}
	
	@Test
	public void testCalculatedWeightZScoreOverAge() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("F");
		
		Obs weight = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		weight.setObsDatetime(years12);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(136.2));
		
		String percentile = whoCalculations.getCalculatedZScoreWeight(weight);
		Assert.assertTrue(percentile == null);
	}
	
	@Test
	public void testCalculatedWeightZScoreBoyTwo() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs weight = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		weight.setObsDatetime(years1);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(12.3));
		
		Double percentile = new Double(whoCalculations.getCalculatedZScoreWeight(weight));
		Assert.assertTrue(percentile > 2 && percentile < 2.03);
	}
	
	
	@Test
	public void testCalculatedWeightZScoreBoyTen() throws Exception {
		
		Patient patient = new Patient();
		patient.setBirthdate(millenium);
		patient.setGender("M");
		
		Obs weight = new Obs();
		//height.setConcept(Context.getConceptService().getConcept(ConceptDictionary.HEIGHT_CM));
		weight.setObsDatetime(years6);
		weight.setPerson(patient);
		weight.setValueNumeric(new Double(31.868));
		
		Double percentile = new Double(whoCalculations.getCalculatedZScoreWeight(weight));
		Assert.assertTrue(percentile == 3);
	}
}