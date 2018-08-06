package com.lti.training.basics;

import java.util.Scanner;

public class FirstProg {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("enter name");
		String name = obj.next();
		System.out.println("name: " + name);

		int x1, y2, z;
		System.out.println("add two numbers");
		System.out.println("1st number");
		x1 = obj.nextInt();
		System.out.println("2nd number");
		y2 = obj.nextInt();
		z = x1 + y2;
		System.out.println("addition of " + x1 + " and " + y2 + " is " + z);
	}

}
