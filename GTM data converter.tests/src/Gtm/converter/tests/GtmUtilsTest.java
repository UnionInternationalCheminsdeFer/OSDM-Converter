package Gtm.converter.tests;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

import Gtm.utils.GtmUtils;


public class GtmUtilsTest {

	
    
	/**
	 * Test encode test tickets in UTC and decode in CET.
	 *
	 * @throws IllegalArgumentException the illegal argument exception
	 * @throws IllegalAccessException the illegal access exception
	 * @throws ParseException 
	 */
	@Test public void testRounding() {
		
		BigDecimal bd00 = new BigDecimal(0.0f).setScale(1,RoundingMode.DOWN);
		BigDecimal bd02 = new BigDecimal(0.2f).setScale(1,RoundingMode.DOWN);
		BigDecimal bd04 = new BigDecimal(0.4f).setScale(1,RoundingMode.DOWN);
		BigDecimal bd05 = new BigDecimal(0.5f).setScale(1,RoundingMode.DOWN);
		BigDecimal bd06 = new BigDecimal(0.6f).setScale(1,RoundingMode.DOWN);
		BigDecimal bd08 = new BigDecimal(0.8f).setScale(1,RoundingMode.DOWN);
		BigDecimal bd10 = new BigDecimal(1.0f).setScale(1,RoundingMode.DOWN);
		
		BigDecimal bd50 = new BigDecimal(0.05f).setScale(1,RoundingMode.DOWN);
		BigDecimal b10 = new BigDecimal(0.10f).setScale(1,RoundingMode.DOWN);

		
		BigDecimal bd = GtmUtils.round(0.0f,1,RoundingMode.HALF_DOWN, 2);
		assert(bd.compareTo(bd00) == 0);
		BigDecimal bd1 = GtmUtils.round(0.1f,1,RoundingMode.HALF_DOWN, 2);
		assert(bd1.compareTo(bd00) == 0);
		assert(GtmUtils.round(0.2f,1,RoundingMode.HALF_DOWN, 2).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.3f,1,RoundingMode.HALF_DOWN, 2).compareTo(bd05) == 0);
		assert(GtmUtils.round(0.4f,1,RoundingMode.HALF_DOWN, 2).compareTo(bd05) == 0);
		assert(GtmUtils.round(0.5f,1,RoundingMode.HALF_DOWN, 2).compareTo(bd05) == 0);
		assert(GtmUtils.round(0.6f,1,RoundingMode.HALF_DOWN, 2).compareTo(bd05) == 0);
		assert(GtmUtils.round(0.7f,1,RoundingMode.HALF_DOWN, 2).compareTo(bd05) == 0);
		assert(GtmUtils.round(0.8f,1,RoundingMode.HALF_DOWN, 2).compareTo(bd10) == 0);
		assert(GtmUtils.round(0.9f,1,RoundingMode.HALF_DOWN, 2).compareTo(bd10) == 0);
		
		
		assert(GtmUtils.round(0.0f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.1f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.2f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.3f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.4f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd04) == 0);
		assert(GtmUtils.round(0.5f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd04) == 0);
		assert(GtmUtils.round(0.6f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd06) == 0);
		assert(GtmUtils.round(0.7f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd06) == 0);
		assert(GtmUtils.round(0.8f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd08) == 0);
		assert(GtmUtils.round(0.9f,1,RoundingMode.HALF_DOWN, 5).compareTo(bd08) == 0);
			
		assert(GtmUtils.round(0.0f,1,RoundingMode.HALF_UP, 5).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.1f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.2f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.3f,1,RoundingMode.HALF_UP, 5).compareTo(bd04) == 0);
		assert(GtmUtils.round(0.4f,1,RoundingMode.HALF_UP, 5).compareTo(bd04) == 0);
		assert(GtmUtils.round(0.5f,1,RoundingMode.HALF_UP, 5).compareTo(bd06) == 0);
		assert(GtmUtils.round(0.6f,1,RoundingMode.HALF_UP, 5).compareTo(bd06) == 0);
		assert(GtmUtils.round(0.7f,1,RoundingMode.HALF_UP, 5).compareTo(bd08) == 0);
		assert(GtmUtils.round(0.8f,1,RoundingMode.HALF_UP, 5).compareTo(bd08) == 0);
		assert(GtmUtils.round(0.9f,1,RoundingMode.HALF_UP, 5).compareTo(bd10) == 0);
						
		
		assert(GtmUtils.round(0.0f,1,RoundingMode.HALF_UP, 5).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.1f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.2f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.3f,1,RoundingMode.HALF_UP, 5).compareTo(bd04) == 0);
		assert(GtmUtils.round(0.4f,1,RoundingMode.HALF_UP, 5).compareTo(bd04) == 0);
		assert(GtmUtils.round(0.5f,1,RoundingMode.HALF_UP, 5).compareTo(bd06) == 0);
		assert(GtmUtils.round(0.6f,1,RoundingMode.HALF_UP, 5).compareTo(bd06) == 0);
		assert(GtmUtils.round(0.7f,1,RoundingMode.HALF_UP, 5).compareTo(bd08) == 0);
		assert(GtmUtils.round(0.8f,1,RoundingMode.HALF_UP, 5).compareTo(bd08) == 0);
		assert(GtmUtils.round(0.9f,1,RoundingMode.HALF_UP, 5).compareTo(bd10) == 0);
		
		//to 20 cent commercial
		assert(GtmUtils.round(0.0f,1,RoundingMode.HALF_UP, 5).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.0999999f,1,RoundingMode.HALF_UP, 5).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.1f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.1000000f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.1000001f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.11f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.2f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.3f,1,RoundingMode.HALF_UP, 5).compareTo(bd02) == 0);
		assert(GtmUtils.round(0.4f,1,RoundingMode.HALF_UP, 5).compareTo(bd04) == 0);
		assert(GtmUtils.round(0.5f,1,RoundingMode.HALF_UP, 5).compareTo(bd04) == 0);
		assert(GtmUtils.round(0.6f,1,RoundingMode.HALF_UP, 5).compareTo(bd06) == 0);
		assert(GtmUtils.round(0.7f,1,RoundingMode.HALF_UP, 5).compareTo(bd06) == 0);
		assert(GtmUtils.round(0.8f,1,RoundingMode.HALF_UP, 5).compareTo(bd08) == 0);
		assert(GtmUtils.round(0.9f,1,RoundingMode.HALF_UP, 5).compareTo(bd08) == 0);
		
		//to 5 cent commercial
		assert(GtmUtils.round(0.00f,2,RoundingMode.HALF_UP, 2).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.01f,2,RoundingMode.HALF_UP, 2).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.02f,2,RoundingMode.HALF_UP, 2).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.021f,2,RoundingMode.HALF_UP, 2).compareTo(bd00) == 0);
		assert(GtmUtils.round(0.024999f,2,RoundingMode.HALF_UP, 2).compareTo(bd50) == 0);
		assert(GtmUtils.round(0.025f,2,RoundingMode.HALF_UP, 2).compareTo(bd50) == 0);
		assert(GtmUtils.round(0.03f,2,RoundingMode.HALF_UP, 2).compareTo(bd50) == 0);
		assert(GtmUtils.round(0.04f,2,RoundingMode.HALF_UP, 2).compareTo(bd50) == 0);
		assert(GtmUtils.round(0.05f,2,RoundingMode.HALF_UP, 2).compareTo(bd50) == 0);
		assert(GtmUtils.round(0.06f,2,RoundingMode.HALF_UP, 2).compareTo(bd50) == 0);
		assert(GtmUtils.round(0.07f,2,RoundingMode.HALF_UP, 2).compareTo(bd50) == 0);
		assert(GtmUtils.round(0.0749f,2,RoundingMode.HALF_UP, 2).compareTo(bd50) == 0);
		assert(GtmUtils.round(0.0750f,2,RoundingMode.HALF_UP, 2).compareTo(b10) == 0);
		assert(GtmUtils.round(0.08f,2,RoundingMode.HALF_UP, 2).compareTo(b10) == 0);
		assert(GtmUtils.round(0.9f,2,RoundingMode.HALF_UP, 2).compareTo(bd10) == 0);
        
    }    
	
}
