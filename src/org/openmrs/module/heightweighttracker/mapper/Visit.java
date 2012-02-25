package org.openmrs.module.heightweighttracker.mapper;

import org.openmrs.Obs;

public interface Visit extends BaseObs {

	public abstract Obs getWeight();
	
	public abstract Obs getHeight();
	
	public abstract Obs getZScoreWeight();
	
	public abstract Obs getZScoreHeight();
	
	public abstract Obs getHeightWeightPercentile();
	
	public abstract Obs getBmi();
	
	public abstract Obs getZScoreBmi();
}
