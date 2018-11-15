package com.klkgroup.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.klkgroup.calculation;

public class testlogic {
	
	@Test
	public void testfindmax() {
		assertEquals(4,calculation.findmax(new int[] {1,2,3,4}));
		assertEquals(-1,calculation.findmax(new int[] {-1,-2,-3,-4}));
	}
	
	

}
