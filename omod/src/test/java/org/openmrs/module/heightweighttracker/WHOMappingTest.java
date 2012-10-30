package org.openmrs.module.heightweighttracker;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.module.heightweighttracker.impl.pih.WHOMapping;
import org.openmrs.module.heightweighttracker.mapper.BMIForAge;
import org.openmrs.module.heightweighttracker.mapper.HeightForAge;
import org.openmrs.module.heightweighttracker.mapper.WeightForAge;
import org.openmrs.module.heightweighttracker.mapper.WeightForHeight;

public class WHOMappingTest {
	
	WHOMapping mapping = new WHOMapping();
	
	@Test
	public void testBmiPercentileBoys15() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileBoys15().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 14.023);
	}
	
	@Test
	public void testBmiPercentileBoys3() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileBoys3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 13.14);
	}
	
	@Test
	public void testBmiPercentileBoys50() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileBoys50().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 15.26);
	}
	
	@Test
	public void testBmiPercentileBoys85() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileBoys85().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 16.708);
	}
	
	@Test
	public void testBmiPercentileBoys97() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileBoys97().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 18.08);
	}
	
	@Test
	public void testBmiPercentileBoysMean() throws Exception {
		Assert.assertTrue(mapping.getBmiPercentileBoysMean().get(63) == 15.2604);
	}
	
	@Test
	public void testBmiPercentileGirls15() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileGirls15().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 13.835);
	}
	
	@Test
	public void testBmiPercentileGirls3() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileGirls3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 12.861);
	}
	
	@Test
	public void testBmiPercentileGirls50() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileGirls50().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 15.243);
	}
	
	@Test
	public void testBmiPercentileGirls85() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileGirls85().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 16.956);
	}
	
	@Test
	public void testBmiPercentileGirls97() throws Exception {
		
		BMIForAge three = mapping.getBmiPercentileGirls97().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 18.65);
	}
	
	@Test
	public void testBmiPercentileGirlsMean() throws Exception {
	 		
		Assert.assertTrue(mapping.getBmiPercentileGirlsMean().get(63) == 15.2433);
	}
	
	@Test
	public void testBmiZScoreBoysL() throws Exception {
	 		
		Assert.assertTrue(mapping.getBmiZScoreBoysL().get(63) == -0.7856);
	}
	
	
	@Test
	public void testBmiZScoreBoysMean() throws Exception {
		
		Assert.assertTrue(mapping.getBmiZScoreBoysMean().get(63) == 15.2604);
	}
	
	@Test
	public void testBmiZScoreBoysS() throws Exception {
		
		Assert.assertTrue(mapping.getBmiZScoreBoysS().get(63) == 0.08439);
	}
	
	@Test
	public void testBmiZScoreBoysSD0() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreBoysSD0().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 15.26);
	}
	
	@Test
	public void testBmiZScoreBoysSD1() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreBoysSD1().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 16.653);
	}
	
	@Test
	public void testBmiZScoreBoysSD1neg() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreBoysSD1neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 14.063);
	}
	
	@Test
	public void testBmiZScoreBoysSD2() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreBoysSD2().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 18.29);
	}
	
	@Test
	public void testBmiZScoreBoysSD2neg() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreBoysSD2neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 13.024);
	}
	
	@Test
	public void testBmiZScoreBoysSD3() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreBoysSD3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 20.238);
	}
	
	@Test
	public void testBmiZScoreBoysSD3neg() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreBoysSD3neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 12.114);
	}
	
	@Test
	public void testBmiZScoreGirlsL() throws Exception {
	 		
		Assert.assertTrue(mapping.getBmiZScoreGirlsL().get(63) == -0.9248);
	}
	
	
	@Test
	public void testBmiZScoreGirlsMean() throws Exception {
		
		Assert.assertTrue(mapping.getBmiZScoreGirlsMean().get(63) == 15.2433);
	}
	
	@Test
	public void testBmiZScoreGirlsS() throws Exception {
		
		Assert.assertTrue(mapping.getBmiZScoreGirlsS().get(63) == 0.09783);
	}
	
	@Test
	public void testBmiZScoreGirlsSD0() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreGirlsSD0().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 15.243);
	}
	
	@Test
	public void testBmiZScoreGirlsSD1() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreGirlsSD1().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 16.889);
	}
	
	@Test
	public void testBmiZScoreGirlsSD1neg() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreGirlsSD1neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 13.881);
	}
	
	@Test
	public void testBmiZScoreGirlsSD2() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreGirlsSD2().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 18.915);
	}
	
	@Test
	public void testBmiZScoreGirlsSD2neg() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreGirlsSD2neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 12.734);
	}
	
	@Test
	public void testBmiZScoreGirlsSD3() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreGirlsSD3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 21.468);
	}
	
	@Test
	public void testBmiZScoreGirlsSD3neg() throws Exception {
		
		BMIForAge three = mapping.getBmiZScoreGirlsSD3neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getBmi() == 11.757);
	}
	
	
	@Test
	public void testHeightForAge5to19BoysMean() throws Exception {
		
		Assert.assertTrue(mapping.getHeightForAge5to19BoysMean().get(63) == 111.3338);
	}
	
	@Test
	public void testHeightForAge5to19BoysSD() throws Exception {
		
		Assert.assertTrue(mapping.getHeightForAge5to19BoysSD().get(63) == 4.6538);
	}
	
	@Test
	public void testHeightForAge5to19BoysSD0() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19BoysSD0().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 111.334);
	}
	
	@Test
	public void testHeightForAge5to19BoysSD1() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19BoysSD1().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 115.988);
	}
	
	@Test
	public void testHeightForAge5to19BoysSD1neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19BoysSD1neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 106.68);
	}
	
	@Test
	public void testHeightForAge5to19BoysSD2() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19BoysSD2().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 120.641);
	}
	
	@Test
	public void testHeightForAge5to19BoysSD2neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19BoysSD2neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 102.026);
	}
	
	@Test
	public void testHeightForAge5to19BoysSD3() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19BoysSD3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 125.295);
	}
	
	@Test
	public void testHeightForAge5to19BoysSD3neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19BoysSD3neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 97.373);
	}
	
	@Test
	public void testHeightForAge5to19GirlsMean() throws Exception {
		
		Assert.assertTrue(mapping.getHeightForAge5to19GirlsMean().get(63) == 110.6451);
	}
	
	@Test
	public void testHeightForAge5to19GirlsSD() throws Exception {
		
		Assert.assertTrue(mapping.getHeightForAge5to19GirlsSD().get(63) == 4.8385);
	}
	
	@Test
	public void testHeightForAge5to19GirlsSD0() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19GirlsSD0().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 110.645);
	}
	
	@Test
	public void testHeightForAge5to19GirlsSD1() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19GirlsSD1().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 115.484);
	}
	
	@Test
	public void testHeightForAge5to19GirlsSD1neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19GirlsSD1neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 105.807);
	}
	
	@Test
	public void testHeightForAge5to19GirlsSD2() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19GirlsSD2().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 120.322);
	}
	
	@Test
	public void testHeightForAge5to19GirlsSD2neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19GirlsSD2neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 100.968);
	}
	
	@Test
	public void testHeightForAge5to19GirlsSD3() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19GirlsSD3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 125.161);
	}
	
	@Test
	public void testHeightForAge5to19GirlsSD3neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAge5to19GirlsSD3neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getHeightInCMDecimal() == 96.13);
	}
	
	@Test
	public void testHeightForAgeFromBirthBoysMean() throws Exception {
		
		Assert.assertTrue(mapping.getHeightForAgeFromBirthBoysMean().get(2) == 58.4249 && mapping.getHeightForAgeFromBirthBoysMean().get(25) == 87.9720);
	}
	
	
	@Test
	public void testHeightForAgeFromBirthBoysSD() throws Exception {
		
		Assert.assertTrue(mapping.getHeightForAgeFromBirthBoysSD().get(2) == 2.0005 && mapping.getHeightForAgeFromBirthBoysSD().get(25) == 3.1160);
	}
	
	@Test
	public void testHeightForAgeFromBirthBoysSD0() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthBoysSD0().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthBoysSD0().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 58.4 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 88.0);
	}
	
	
	@Test
	public void testHeightForAgeFromBirthBoysSD2() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthBoysSD2().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthBoysSD2().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 62.4 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 94.2);
	}
	
	@Test
	public void testHeightForAgeFromBirthBoysSD2neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthBoysSD2neg().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthBoysSD2neg().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 54.4 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 81.7);
	}
	
	@Test
	public void testHeightForAgeFromBirthBoysSD3() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthBoysSD3().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthBoysSD3().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 64.4 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 97.3);
	}
	
	@Test
	public void testHeightForAgeFromBirthBoysSD3neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthBoysSD3neg().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthBoysSD3neg().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 52.4 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 78.6);
	}
	
	@Test
	public void testHeightForAgeFromBirthGirlsMean() throws Exception {
		
		Assert.assertTrue(mapping.getHeightForAgeFromBirthGirlsMean().get(2) == 57.0673 && mapping.getHeightForAgeFromBirthGirlsMean().get(25) == 86.5904);
	}
	
	
	@Test
	public void testHeightForAgeFromBirthGirlsSD() throws Exception {
		
		Assert.assertTrue(mapping.getHeightForAgeFromBirthGirlsSD().get(2) == 2.0362 && mapping.getHeightForAgeFromBirthGirlsSD().get(25) == 3.2783);
	}
	
	@Test
	public void testHeightForAgeFromBirthGirlsSD0() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthGirlsSD0().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthGirlsSD0().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 57.1 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 86.6);
	}
	
	
	@Test
	public void testHeightForAgeFromBirthGirlsSD2() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthGirlsSD2().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthGirlsSD2().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 61.1 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 93.1);
	}
	
	@Test
	public void testHeightForAgeFromBirthGirlsSD2neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthGirlsSD2neg().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthGirlsSD2neg().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 53.0 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 80.0);
	}
	
	@Test
	public void testHeightForAgeFromBirthGirlsSD3() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthGirlsSD3().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthGirlsSD3().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 63.2 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 96.4);
	}
	
	@Test
	public void testHeightForAgeFromBirthGirlsSD3neg() throws Exception {
		
		HeightForAge three = mapping.getHeightForAgeFromBirthGirlsSD3neg().get(2);
		HeightForAge twentySix = mapping.getHeightForAgeFromBirthGirlsSD3neg().get(25);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getHeightInCMDecimal() == 51.0 && twentySix.getAgeInMonths() == 25 && twentySix.getHeightInCMDecimal() == 76.8);
	}
	
	@Test
	public void testWeightForAge5to10BoysL() throws Exception {
	 		
		Assert.assertTrue(mapping.getWeightForAge5to10BoysL().get(63) == -0.2234);
	}
	
	
	@Test
	public void testWeightForAge5to10BoysMean() throws Exception {
		
		Assert.assertTrue(mapping.getWeightForAge5to10BoysMean().get(63) == 18.8563);
	}
	
	@Test
	public void testWeightForAge5to10BoysS() throws Exception {
		
		Assert.assertTrue(mapping.getWeightForAge5to10BoysS().get(63) == 0.13067);
	}
	
	@Test
	public void testWeightForAge5to10BoysSD0() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10BoysSD0().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 18.856);
	}
	
	@Test
	public void testWeightForAge5to10BoysSD1() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10BoysSD1().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 21.53);
	}
	
	@Test
	public void testWeightForAge5to10BoysSD1neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10BoysSD1neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 16.578);
	}
	
	@Test
	public void testWeightForAge5to10BoysSD2() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10BoysSD2().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 24.683);
	}
	
	@Test
	public void testWeightForAge5to10BoysSD2neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10BoysSD2neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 14.627);
	}
	
	@Test
	public void testWeightForAge5to10BoysSD3() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10BoysSD3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 28.42);
	}
	
	@Test
	public void testWeightForAge5to10BoysSD3neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10BoysSD3neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 12.95);
	}
	
	@Test
	public void testWeightForAge5to10GirlsL() throws Exception {
	 		
		Assert.assertTrue(mapping.getWeightForAge5to10GirlsL().get(63) == -0.4742);
	}
	
	
	@Test
	public void testWeightForAge5to10GirlsMean() throws Exception {
		
		Assert.assertTrue(mapping.getWeightForAge5to10GirlsMean().get(63) == 18.6073);
	}
	
	@Test
	public void testWeightForAge5to10GirlsS() throws Exception {
		
		Assert.assertTrue(mapping.getWeightForAge5to10GirlsS().get(63) == 0.14404);
	}
	
	@Test
	public void testWeightForAge5to10GirlsSD0() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10GirlsSD0().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 18.607);
	}
	
	@Test
	public void testWeightForAge5to10GirlsSD1() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10GirlsSD1().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 21.601);
	}
	
	@Test
	public void testWeightForAge5to10GirlsSD1neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10GirlsSD1neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 16.187);
	}
	
	@Test
	public void testWeightForAge5to10GirlsSD2() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10GirlsSD2().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 25.363);
	}
	
	@Test
	public void testWeightForAge5to10GirlsSD2neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10GirlsSD2neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 14.204);
	}
	
	@Test
	public void testWeightForAge5to10GirlsSD3() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10GirlsSD3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 30.178);
	}
	
	@Test
	public void testWeightForAge5to10GirlsSD3neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAge5to10GirlsSD3neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 63 && three.getWeightInKGDecimal() == 12.559);
	}
	
	@Test
	public void testWeightForAgeFromBirthBoysL() throws Exception {
	 		
		Assert.assertTrue(mapping.getWeightForAgeFromBirthBoysL().get(2) == 0.1970);
	}
	
	
	@Test
	public void testWeightForAgeFromBirthBoysMean() throws Exception {
		
		Assert.assertTrue(mapping.getWeightForAgeFromBirthBoysMean().get(2) == 5.5675);
	}
	
	@Test
	public void tesWeightForAgeFromBirthBoysS() throws Exception {
		
		Assert.assertTrue(mapping.getWeightForAgeFromBirthBoysS().get(2) == 0.12385);
	}
	
	@Test
	public void testWeightForAgeFromBirthBoysSD0() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthBoysSD0().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 5.6);
	}
	
	@Test
	public void testWeightForAgeFromBirthBoysSD2() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthBoysSD2().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 7.1);
	}
	
	@Test
	public void testWeightForAgeFromBirthBoysSD2neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthBoysSD2neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 4.3);
	}
	
	@Test
	public void testWeightForAgeFromBirthBoysSD3() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthBoysSD3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 8.0);
	}
	
	@Test
	public void testWeightForAgeFromBirthBoysSD3neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthBoysSD3neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 3.8);
	}
	
	@Test
	public void testWeightForAgeFromBirthGirlsL() throws Exception {
	 		
		Assert.assertTrue(mapping.getWeightForAgeFromBirthGirlsL().get(2) == 0.0962);
	}
	
	
	@Test
	public void testWeightForAgeFromBirthGirlsMean() throws Exception {
		
		Assert.assertTrue(mapping.getWeightForAgeFromBirthGirlsMean().get(2) == 5.1282);
	}
	
	@Test
	public void tesWeightForAgeFromBirthGirlsS() throws Exception {
		
		Assert.assertTrue(mapping.getWeightForAgeFromBirthGirlsS().get(2) == 0.13000);
	}
	
	@Test
	public void testWeightForAgeFromBirthGirlsSD0() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthGirlsSD0().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 5.1);
	}
	
	@Test
	public void testWeightForAgeFromBirthGirlsSD2() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthGirlsSD2().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 6.6);
	}
	
	@Test
	public void testWeightForAgeFromBirthGirlsSD2neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthGirlsSD2neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 3.9);
	}
	
	@Test
	public void testWeightForAgeFromBirthGirlsSD3() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthGirlsSD3().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 7.5);
	}
	
	@Test
	public void testWeightForAgeFromBirthGirlsSD3neg() throws Exception {
		
		WeightForAge three = mapping.getWeightForAgeFromBirthGirlsSD3neg().get(2);
		Assert.assertTrue(three.getAgeInMonths() == 2 && three.getWeightInKGDecimal() == 3.4);
	}
		
	@Test
	public void testWeightForHeightBoysIdeal() throws Exception {
		
		Assert.assertTrue( mapping.getWeightForHeightBoysIdeal().get(65.2) == 7.480);
	}
	
	@Test
	public void testWeightForHeightBoysSD0() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightBoysSD0().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 7.480);
	}
	
	@Test
	public void testWeightForHeightBoysSD1() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightBoysSD1().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 8.130);
	}
	
	@Test
	public void testWeightForHeightBoysSD1neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightBoysSD1neg().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 6.898);
	}
	
	@Test
	public void testWeightForHeightBoysSD2() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightBoysSD2().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 8.859);
	}
	
	@Test
	public void testWeightForHeightBoysSD2neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightBoysSD2neg().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 6.376);
	}
	
	@Test
	public void testWeightForHeightBoysSD3() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightBoysSD3().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 9.680);
	}
	
	@Test
	public void testWeightForHeightBoysSD3neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightBoysSD3neg().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 5.905);
	}	
	
	@Test
	public void testWeightForHeightGirlsIdeal() throws Exception {
		
		Assert.assertTrue( mapping.getWeightForHeightGirlsIdeal().get(65.2) == 7.285);
	}
	
	@Test
	public void testWeightForHeightGirlsSD0() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightGirlsSD0().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 7.285);
	}
	
	@Test
	public void testWeightForHeightGirlsSD1() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightGirlsSD1().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 7.993);
	}
	
	@Test
	public void testWeightForHeightGirlsSD1neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightGirlsSD1neg().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 6.661);
	}
	
	@Test
	public void testWeightForHeightGirlsSD2() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightGirlsSD2().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 8.800);
	}
	
	@Test
	public void testWeightForHeightGirlsSD2neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightGirlsSD2neg().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 6.109);
	}
	
	@Test
	public void testWeightForHeightGirlsSD3() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightGirlsSD3().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 9.724);
	}
	
	@Test
	public void testWeightForHeightGirlsSD3neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForHeightGirlsSD3neg().get(2);
		Assert.assertTrue(three.getHeight() == 65.2 && three.getWeight() == 5.618);
	}
	
	@Test
	public void testWeightForLengthBoysIdeal() throws Exception {
		
		Assert.assertTrue( mapping.getWeightForLengthBoysIdeal().get(45.2) == 2.474);
	}
	
	@Test
	public void testWeightForLengthBoysSD0() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthBoysSD0().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.474);
	}
	
	@Test
	public void testWeightForLengthBoysSD1() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthBoysSD1().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.716);
	}
	
	@Test
	public void testWeightForLengthBoysSD1neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthBoysSD1neg().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.261);
	}
	
	@Test
	public void testWeightForLengthBoysSD2() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthBoysSD2().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.991);
	}
	
	@Test
	public void testWeightForLengthBoysSD2neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthBoysSD2neg().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.072);
	}
	
	@Test
	public void testWeightForLengthBoysSD3() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthBoysSD3().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 3.305);
	}
	
	@Test
	public void testWeightForLengthBoysSD3neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthBoysSD3neg().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 1.903);
	}
	
	@Test
	public void testWeightForLengthGirlsIdeal() throws Exception {
		
		Assert.assertTrue( mapping.getWeightForLengthGirlsIdeal().get(45.2) == 2.495);
	}
	
	@Test
	public void testWeightForLengthGirlsSD0() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthGirlsSD0().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.495);
	}
	
	@Test
	public void testWeightForLengthGirlsSD1() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthGirlsSD1().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.735);
	}
	
	@Test
	public void testWeightForLengthGirlsSD1neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthGirlsSD1neg().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.283);
	}
	
	@Test
	public void testWeightForLengthGirlsSD2() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthGirlsSD2().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 3.008);
	}
	
	@Test
	public void testWeightForLengthGirlsSD2neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthGirlsSD2neg().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 2.095);
	}
	
	@Test
	public void testWeightForLengthGirlsSD3() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthGirlsSD3().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 3.321);
	}
	
	@Test
	public void testWeightForLengthGirlsSD3neg() throws Exception {
		
		WeightForHeight three = mapping.getWeightForLengthGirlsSD3neg().get(2);
		Assert.assertTrue(three.getHeight() == 45.2 && three.getWeight() == 1.928);
	}	
}
