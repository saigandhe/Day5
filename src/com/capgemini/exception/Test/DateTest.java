package com.capgemini.exception.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;
import com.capgemini.exception.Date;

class DateTest {

	@Test
	void testValidCases() {
		try {
			Date d1= new Date(29,2,1996) ;
			Date d2= new Date(12,12,1996) ;
			Date d3= new Date(31,3,1996) ;
		}
		catch(Exception e)
		{
			fail("Exception occured") ;
		}
	}
	
	void testInvalidCases() {
		assertThrows(InvalidMonthException.class,()->new Date(12,13,1996));
		assertThrows(InvalidDayException.class,()->new Date(31,11,1996));
		assertThrows(InvalidDayException.class,()->new Date(29,2,1997));
		assertThrows(InvalidDayException.class,()->new Date(32,12,1996));
		
	}

}