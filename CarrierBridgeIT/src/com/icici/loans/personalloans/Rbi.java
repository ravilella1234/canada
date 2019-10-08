package com.icici.loans.personalloans;

public interface Rbi 
{
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i=new Rbi();
		
		Rbi i;
		
		i=new Icici();
		i.deposit();
		i.withdrawl();
		
		
		i=new Kotak();
		i.deposit();
		i.withdrawl();
	}
	
}
