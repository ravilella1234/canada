package com.icici.loans.carloans;

import com.icici.loans.personalloans.FirstClass;

public class ThirdClass extends FirstClass
{
	public void m3()
	{
		System.out.println("iam m3 from ThirdClass");
	}
	
	public static void main(String[] args) 
	{
		ThirdClass t=new ThirdClass();
		t.m3();
		t.m1();
	}

}
