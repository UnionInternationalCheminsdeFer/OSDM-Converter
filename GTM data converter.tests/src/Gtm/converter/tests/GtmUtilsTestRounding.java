package Gtm.converter.tests;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

import Gtm.utils.GtmUtils;


public class GtmUtilsTestRounding {

	
    
	/**
	 * Test encode test tickets in UTC and decode in CET.
	 *
	 * @throws IllegalArgumentException the illegal argument exception
	 * @throws IllegalAccessException the illegal access exception
	 * @throws ParseException 
	 */
	@Test public void testRounding() {
		
				
		
		BigDecimal c00 = new BigDecimal(0.0f).setScale(1,RoundingMode.DOWN);
		BigDecimal c20 = new BigDecimal(0.20f).setScale(1,RoundingMode.DOWN);
		BigDecimal c40 = new BigDecimal(0.40f).setScale(1,RoundingMode.DOWN);
		
		BigDecimal r = GtmUtils.round(0.0f,1,RoundingMode.UP, 5);
		assert(r.compareTo(c00) == 0);
		r = GtmUtils.round(0.01f,1,RoundingMode.UP, 5);
		assert(r.compareTo(c20) == 0);
		r = GtmUtils.round(0.2f,1,RoundingMode.UP, 5);
		assert(r.compareTo(c20) == 0);
		r = GtmUtils.round(0.21f,1,RoundingMode.UP, 5);
		assert(r.compareTo(c40) == 0);

		
		r = GtmUtils.round(0.0f,1,RoundingMode.DOWN, 5);
		assert(r.compareTo(c00) == 0);
		r = GtmUtils.round(0.01f,1,RoundingMode.DOWN, 5);
		assert(r.compareTo(c00) == 0);
		r = GtmUtils.round(0.2f,1,RoundingMode.DOWN, 5);
		assert(r.compareTo(c20) == 0);
		r = GtmUtils.round(0.21f,1,RoundingMode.DOWN, 5);
		assert(r.compareTo(c20) == 0);
		r = GtmUtils.round(0.40f,1,RoundingMode.DOWN, 5);
		assert(r.compareTo(c40) == 0);
		r = GtmUtils.round(0.41f,1,RoundingMode.DOWN, 5);
		assert(r.compareTo(c40) == 0);
		
		
		
		
        
    }    
	
}
