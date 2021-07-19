package com.intel.Test;

import com.intel.Test.CalculatorException;

public class Calculator extends Exception {
	
Calculator(String s)
{
	super(s);
}
}
class Calculator1
{
	
public static void main(String[] args) {
		public int power(int n,int p)
		{
			if(n<0 || p<0)
			{
				 throw new Calculator("n and p are non negetive "); 
			}
				
			
			elseif(n==0 || p==0)
			{
				throw new Calculator("n and p are zero "); 
			}
		}

		
		Calculator1 cc=new Calculator1();
		       cc.power(-2,5);
		
	}

}
