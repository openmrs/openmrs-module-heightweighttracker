package org.openmrs.module.heightweighttracker.mapper;

public class BMIForAge {
	
	private int ageInMonths;
	
	private double ageInMonthsDecimal;
	
	private double bmi;

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
		this.ageInMonthsDecimal = ageInMonths;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public double getAgeInMonthsDecimal() {
		return ageInMonthsDecimal;
	}

	public void setAgeInMonthsDecimal(double ageInMonthsDecimal) {
		this.ageInMonthsDecimal = ageInMonthsDecimal;
		this.ageInMonths = (int)ageInMonthsDecimal;
	}
}
