package com.lti.training.basics;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int m[]=new int[5];
		for(int i=0;i<5;i++) {
			m[i]=obj.nextInt();	
		}
		for(int i=0;i<5;i++) {
			System.out.println(m[i]);
		}
	}

}
