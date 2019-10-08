package com.icici.loans.personalloans;

import java.util.Scanner;

public class ArrayDemo 
{
	
	public int m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Engter the array size :");
		int asize = sc.nextInt();
		
		int[] a=new int[asize];
		int sum=0;
		
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("summ of array is : " + sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		
		ArrayDemo a1=new ArrayDemo();
		int val = a1.m1();
		System.out.println("sum of array in outside : " + val);
	}

}
