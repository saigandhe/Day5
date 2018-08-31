package com.capgemini.exception.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;



class StudentTest {

	
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
			assertThrows(NameNotValidException.class,()-> new Student(11,"n@ina",21,"Java"));
			assertThrows(NameNotValidException.class,()-> new Student(11,"naina",22,"Java"));
		
	}

}
