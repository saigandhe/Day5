package com.capgemini.exception;

public class Factorial {
	
	
		public int getFactorial(int num) throws InvalidInputException,FactorialException{
			int fact=1 ;
			if(num<2)
			{
				throw new InvalidInputException("Enter a valid Input") ;
			}
			for(int i=1;i<=num;i++)
			{
				fact=fact*i ;
				if(fact<0)
				{
					throw new FactorialException("Limit Exceeded") ;
				}
				
			}
			return fact ;
		}
	}



