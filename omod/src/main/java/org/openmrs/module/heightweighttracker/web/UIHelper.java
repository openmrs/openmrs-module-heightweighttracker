package org.openmrs.module.heightweighttracker.web;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.openmrs.Obs;
import org.openmrs.module.heightweighttracker.web.model.HeightWeightTrackerFormData;

public class UIHelper {
	
	public static String getBMIXAxis(HeightWeightTrackerFormData data) {
		Collection<Obs> weightList = data.getObsMapper().getWeightObsList();
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		
		Date minDate = new Date();
		if(weightList != null && weightList.size() > 0) {
			for(Obs obs : weightList) {
				if(obs.getObsDatetime() != null && minDate.after(obs.getObsDatetime())) {
					minDate = obs.getObsDatetime();
				}
			}
		}
		calendar.setTime(minDate);
		int minYear = calendar.get(Calendar.YEAR);
		calendar.clear();
		calendar.set(minYear, 1, 1);
		long min = calendar.getTimeInMillis();
		calendar.set(currentYear, 1, 1);
		long max = calendar.getTimeInMillis();
		
		StringBuilder builder = new StringBuilder();
		builder.append("xaxis: { ");
		builder.append("mode: \"time\"");
		builder.append(", timeformat: \"%y\"");
		builder.append(", min: ").append(min);
		builder.append(", max: ").append(max);
		builder.append(", tickSize: [12, \"month\"]");
		
		builder.append(" }");
		
		return builder.toString();
	}

}
