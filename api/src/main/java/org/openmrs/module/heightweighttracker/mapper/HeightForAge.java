package org.openmrs.module.heightweighttracker.mapper;

public class HeightForAge {
	
	private int ageInMonths;
	
	private double ageInMonthsDecimal;
	
	private int heightInCM;
	
	private double heightInCMDecimal;

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
		this.ageInMonthsDecimal = ageInMonths;
	}

	public int getHeightInCM() {
		return heightInCM;
	}

	public void setHeightInCM(int heightInCM) {
		this.heightInCM = heightInCM;
		this.heightInCMDecimal = heightInCM;
	}

	public double getHeightInCMDecimal() {
		return heightInCMDecimal;
	}

	public void setHeightInCMDecimal(double heightInCMDecimal) {
		this.heightInCMDecimal = heightInCMDecimal;
		this.heightInCM = (int) heightInCMDecimal;
	}

	public double getAgeInMonthsDecimal() {
		return ageInMonthsDecimal;
	}

	public void setAgeInMonthsDecimal(double ageInMonthsDecimal) {
		this.ageInMonthsDecimal = ageInMonthsDecimal;
		this.ageInMonths = (int)ageInMonthsDecimal;
	}
}
