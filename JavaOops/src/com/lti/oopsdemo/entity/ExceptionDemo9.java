package com.lti.oopsdemo.entity;

class OwnException extends Exception
{
	private int no;
	OwnException(int no1) {
		no=no1;
	}
	
	public String toString()
	{
		return "OwnException odd number("+no+")";
	}
} 

class ExceptionDemo9 {
	static void evenodd(int number) throws OwnException
	{
		System.out.println("\n evenodd called ("+ number+")");
		if(number%2==0)
			System.out.println("Normal Exit");
		else
			throw new OwnException(number);
	}
	public static void main(String[] args) throws OwnException {
		evenodd(20);
		evenodd(25);
	}
}
