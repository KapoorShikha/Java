package com.lti.oopsdemo.entity;

public class ExpDemo {

	public static void main(String[] args) {
		int x,y,z;
		x=15;
		y=15;
		int arr[]= {10,5};
		int a=5;
		try
		{
			int b= arr[4]/(a-arr[3]);
			z=500/(x-y);
			System.out.println("this will not be executed");
			
		}catch(ArithmeticException e)
		{
			System.out.println("\n divided by zero");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\n array index out of bound");
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println("exception caught");
		}
		finally {
		System.out.println("\n after try/catch block ");
		}
	}

}
