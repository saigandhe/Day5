package com.capgemini.exception.Test;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;

public class Student {
	private long rollno;
	private String name;
	private int age;
	private String course;
	
	public Student() {
		super();
	}
	
	public Student(long rollno,String name,int age,String course) throws NameNotValidException, AgeNotWithinRangeException {
		this();
		this.rollno = rollno;
		if(name=="a"&&name=="z"||name=="A"&&name=="Z")
			this.name = name;
		else
			throw new NameNotValidException("Name contains specialcharacters or numbers");
		this.name = name;
		if(age>=15&&age<=21)
			this.age= age;
		  else 
		   throw new AgeNotWithinRangeException("not a valid age");
			
		this.age= age;
		this.course = course;
	}
	
}
/*public boolean validateAge(int age) throws AgeNotWithinRangeException{
	
		}
public boolean checkName(String name) throws NameNotValidException{
	if(name=="a"&&name=="z"||name=="A"&&name=="Z")
		this.name = name;
		
	else
		throw new NameNotValidException("Message");
	
}
	}*/

