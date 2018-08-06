package com.lti.oopsdemo.entity;

import java.util.Scanner;
class MyException extends Exception
{
	private int no;
	MyException(int no1) {
		no=no1;
	}
	
	public String toString()
	{
		return "MyException \n invalid salary("+no+")";
	}
} 


class ExecuteSalary {
	
	static void CheckSal(int number) throws MyException
	{
		if(number>=20000 && number<=50000)
			System.out.println("your salary is "+number);
		else
			throw new MyException(number);
	}

	public static void main(String[] args) throws MyException {
		
		int sal;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter salary");
		sal=sc.nextInt();
		
		CheckSal(sal);
		
	}

}
