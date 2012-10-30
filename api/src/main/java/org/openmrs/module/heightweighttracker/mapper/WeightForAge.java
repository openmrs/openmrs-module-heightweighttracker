package org.openmrs.module.heightweighttracker.mapper;

public class WeightForAge {
	
	private int ageInMonths;
	
	private double ageInMonthsDecimal;
	
	private int weightInKG;
	
	private double weightInKGDecimal;

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
		this.ageInMonthsDecimal = ageInMonths;
	}

	public int getWeightInKG() {
		return weightInKG;
	}

	public void setWeightInKG(int weightInKG) {
		this.weightInKG = weightInKG;
		this.weightInKGDecimal = weightInKG;
	}

	public double getWeightInKGDecimal() {
		return weightInKGDecimal;
	}

	public void setWeightInKGDecimal(double weightInKGDecimal) {
		this.weightInKGDecimal = weightInKGDecimal;
		this.weightInKG = (int)weightInKGDecimal;
	}

	public double getAgeInMonthsDecimal() {
		return ageInMonthsDecimal;
	}

	public void setAgeInMonthsDecimal(double ageInMonthsDecimal) {
		this.ageInMonthsDecimal = ageInMonthsDecimal;
		this.ageInMonths = (int)ageInMonthsDecimal;
	}
}
