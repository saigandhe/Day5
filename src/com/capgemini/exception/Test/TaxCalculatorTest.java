package com.capgemini.exception.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exception.CountryInvalidException;
import com.capgemini.exception.EmployeeNameInvalidException;
import com.capgemini.exception.TaxCalculator;
import com.capgemini.exception.TaxNotElgibleException;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInput() throws TaxNotElgibleException, CountryInvalidException, EmployeeNameInvalidException {
		assertEquals(3300,TaxCalculator.calulateTax("tim",true,55000),1);
		

	}

}
