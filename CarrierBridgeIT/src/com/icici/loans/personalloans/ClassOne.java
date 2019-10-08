package com.icici.loans.personalloans;

public class ClassOne 
{
	int a=10,b=20,c;  // properties
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is :" + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Sub of A & B is :" + c);
	}
	
	
	public static void main(String[] args) 
	{
		ClassOne obj=new ClassOne();
		obj.add();
		obj.sub();
		
		ClassOne obj1=new ClassOne();
		obj1.add();
		obj1.sub();

	}

}
