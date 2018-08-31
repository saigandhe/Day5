package com.capgemini.exception.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exception.MyCalculator;

class MyCalculatorTest {

	@Test
	void testPowerWithValidInputs() throws Exception {
		assertEquals(243,MyCalculator.power(3,5));
		assertEquals(16,MyCalculator.power(2,4));
		assertEquals(32,MyCalculator.power(2,5));
	}
	@Test
	void testPowerWithZeroInputs() {
		
		Exception e;
		e=assertThrows(Exception.class,()-> MyCalculator.power(0, 0));
		assertEquals("n and p should not be zero", e.getMessage());
	}
	@Test
	void testPowerWithNegativeInput() {
		Exception e;
		e=assertThrows(Exception.class,()-> MyCalculator.power(-2, -5));
		assertEquals("n and p should not be negative", e.getMessage());
		e=assertThrows(Exception.class,()-> MyCalculator.power(-2, 5));
		assertEquals("n and p should not be negative", e.getMessage());
		e=assertThrows(Exception.class,()-> MyCalculator.power(2, -5));
		assertEquals("n and p should not be negative", e.getMessage());


	}

}
