<script type="text/javascript" src="girlLength.js"></script>
<script type="text/javascript" src="boyLength.js"></script>

function monthDiff(d1, d2) {
    var months;
    months = (d2.getFullYear() - d1.getFullYear()) * 12;
    months -= d1.getMonth() + 1;
    months += d2.getMonth();
    return months;
}

function calculateZScoreLength(gender, months, length) {
	var zscore = 0;
	
	if(gender = "F")
	{
		zscore = (length - girlLengthMean[months])/girlLengthSD[months]; 
	}
	else if(gender = "M")
	{
		zscore = (length - boyLengthMean[months])/boyLengthSD[months]; 
	}
	
	return zscore;
}

function calculateZScoreWeight(gender, months, length) {
	var zscore = 0;
	
	if(gender = "F")
	{
		zscore = (length - girlWeightMean[months])/girlWeightSD[months]; 
	}
	else if(gender = "M")
	{
		zscore = (length - boyWeightMean[months])/boyWeightSD[months]; 
	}
	
	return zscore;
}