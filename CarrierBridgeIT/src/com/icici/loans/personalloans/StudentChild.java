package com.icici.loans.personalloans;

public class StudentChild extends Student
{
	String address;
	
	public StudentChild(String address)
	{
		super(1700,"kiran",12.43f);
		this.address=address;
		
		System.out.println(this.address);
	}
	
	
	

	public static void main(String[] args) 
	{
		StudentChild sc1=new StudentChild("Hyderabad");

	}

}
