package com.icici.loans.carloans;

public class DemoClass 
{
	
	public void m1(int i)
	{
		System.out.println(i);
	}

	/*public void m1(float i)
	{
		System.out.println(i);
	}*/
	
	public void m1(String i)
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) 
	{
		DemoClass obj=new DemoClass();
		obj.m1(100);
		obj.m1(23.34f);
		obj.m1("ravilella");
		
		
	}
	
}
