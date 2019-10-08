package com.icici.loans.personalloans;

public class Icici implements Rbi
{

	public static void main(String[] args)
	{
		Icici i=new Icici();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("withdrawl from ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit from ICICI");
		
	}

}
