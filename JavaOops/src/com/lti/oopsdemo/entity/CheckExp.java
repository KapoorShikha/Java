package com.lti.oopsdemo.entity;

public class CheckExp {
	static void procedure() throws IllegalAccessException
	{
		System.out.println("inside procedure()");
		throw new IllegalAccessException("throws demo");
	}

	public static void main(String[] args) throws IllegalAccessException {
		procedure();
		
	}

}
