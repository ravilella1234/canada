package com.icici.loans.personalloans;

public abstract class FirstClass 
{
	public void m1()
	{
		System.out.println("iam m1 from FirstClass");
	}
	
	public static void main(String[] args) {
		FirstClass f=new FirstClass();
		f.m1();
	}

}
