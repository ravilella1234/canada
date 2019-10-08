package com.icici.loans.personalloans;

public class Student 
{
	int sno;
	String sname;
	float sal;
	
	public Student()
	{
		System.out.println("iam default constructor...");
		
		System.out.println(this.sno);
		System.out.println(this.sname);
		System.out.println(this.sal);
	}
	
	
	public Student(int sno) 
	{
		this();
		this.sno=sno;
		
		System.out.println(this.sno);
		System.out.println(this.sname);
		System.out.println(this.sal);
	}
	
	public Student(int sno, String sname) 
	{
		this(1743);
		this.sno=sno;
		this.sname=sname;
		
		System.out.println(this.sno);
		System.out.println(this.sname);
		System.out.println(this.sal);
	}

	

	public Student(int sno, String sname, float sal) 
	{
		this(1744,"ravilella");
		this.sno=sno;
		this.sname=sname;
		this.sal=sal;
		
		System.out.println(this.sno);
		System.out.println(this.sname);
		System.out.println(this.sal);
	}

	public static void main(String[] args) 
	{
	
		Student s4=new Student(1745,"sai",234.34f);
		
	}

}
