package com.icici.loans.carloans;

public  class A 
{
	public int x=100;
	
	public  void m1()
	{
		System.out.println("iam m1 from class A");
	}
	
	static
	{
		System.out.println("iam 1st static block");
	}
	
	static
	{
		System.out.println("iam 2nd static block");
	}
	
	public static void m4()
	{
		System.out.println("iam static method...");
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
		m4();
	}

}
