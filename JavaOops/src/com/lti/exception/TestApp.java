package com.lti.exception;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ");
		int n=sc.nextInt();
		System.out.println("enter name ");
		String s=sc.next();
		SavingsAcc a=new SavingsAcc(n,s,5000);
		System.out.println("amount you want to withdraw: ");
		double b= sc.nextDouble();
		try {
			a.Withdraw(b);
		} catch (CustomExp e) {
			System.out.println(e.toString());
			System.out.println(a.toString());
		}
	}

}
