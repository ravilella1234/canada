package com.icici.loans.personalloans;

public class SecondClass extends FirstClass
{
	public void m2()
	{
		System.out.println("iam m2 from SecondClass");
	}
	
	public static void main(String[] args) {
		SecondClass s=new SecondClass();
		s.m2();
		s.m1();
	}
	
}