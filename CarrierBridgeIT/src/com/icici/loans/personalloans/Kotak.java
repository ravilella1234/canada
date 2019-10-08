package com.icici.loans.personalloans;

public class Kotak implements Rbi
{

	public static void main(String[] args) 
	{
		Kotak k=new Kotak();
		k.deposit();
		k.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("witrhdrawl from kotak");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit from kotak");
		
	}

}
