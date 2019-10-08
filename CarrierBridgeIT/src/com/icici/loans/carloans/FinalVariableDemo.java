package com.icici.loans.carloans;

public strictfp class FinalVariableDemo 
{
	int a=10;
	static int b=20;
	
	public static void main(String[] args) 
	{
		FinalVariableDemo obj=new FinalVariableDemo();
		 int c=30;
		
		System.out.println(obj.a);
		obj.a=100;
		System.out.println(obj.a);
		
		System.out.println(b);
		b=200;
		System.out.println(b);
		
		System.out.println(c);
		c=300;
		System.out.println(c);

	}

}
