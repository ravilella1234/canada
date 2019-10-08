package com.icici.loans.carloans;

 class ParentClass 
{
	static int x=100;
	
	public  Number workhard()
	{
		System.out.println("wakeup early, goto college....");
		return 0;
	}
	
	public void care()
	{
		System.out.println("atmost care.....");
	}

}

 public class ChildClass extends ParentClass
{
	 static int x=200;
	 
	 public  Number workhard()
		{
			System.out.println("wakeup anytime, goto bar....");
			return 0;
		}
	 
	public void love()
	{
		System.out.println("iam in love.....");
	}
	
	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass();
		c.workhard();
		c.care();
		c.love();
		System.out.println(x);
	}
}
