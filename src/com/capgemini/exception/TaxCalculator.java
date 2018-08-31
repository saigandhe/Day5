package com.capgemini.exception;

public class TaxCalculator {
	
		

	public static double calulateTax(String empName,boolean isIndian,double empSal) throws TaxNotElgibleException, CountryInvalidException, EmployeeNameInvalidException {
		
		double taxAmount = 1;
		
		if(!isIndian)
		{
			throw new CountryInvalidException("The Employee should be Indian Citizen for Calculating Tax");
		}
		else if(empName == null || empName.equals(""))
		{
			throw new EmployeeNameInvalidException("Employee name cannot be empty");
		}
		else if(empSal>=100000)
				taxAmount = empSal*8/100;
			else if(empSal>=50000&&empSal<100000)
				taxAmount = empSal*6/100;
			else if(empSal>=30000&&empSal<50000)
				taxAmount = empSal*5/100;
			else if(empSal>=10000&&empSal<30000)
				taxAmount = empSal*4/100;
			else
			{
				throw new CountryInvalidException("The Employee should be Indian Citizen for Calculating Tax");
			}
		return taxAmount;
			
		}
	

	}

