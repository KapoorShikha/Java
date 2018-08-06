package com.lti.training.basics;

import java.util.Scanner;

public class TestMaths {

	public static void main(String[] args) {
		int x,y;
		int z;
		Scanner obj= new Scanner(System.in);
		System.out.println("1st number");
		x=obj.nextInt();
		System.out.println("2nd number");
		y=obj.nextInt();
		
		Maths m=new Maths();
		z=m.doSum(x,y);
		System.out.println("addition of "+x+" and "+y+" is "+z);
		
		/*Maths m1= new Maths();
		m1.doSum();*/
		}

}
