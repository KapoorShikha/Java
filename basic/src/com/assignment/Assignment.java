package com.assignment;

import java.util.Scanner;

public class Assignment {
	static double sal;
	
	static void CalculateSalary(double total_sal)
	{
		sal=total_sal-(0.1*total_sal);
		System.out.println("Total Salary after Deduction is: "+sal);
	}

	public static void main(String[] args) {
		
		String designation,m="Manager",a="Analyst";
		double total_sal;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your designation");
		designation=obj.next();
		
		if(designation.equalsIgnoreCase(m)==true)
		{
			int mba=20000;
			total_sal=(mba+(0.05*mba)+(0.1*mba));
			Assignment.CalculateSalary(total_sal);	
		}
		else if(designation.equalsIgnoreCase(a)==true)
		{
			int aba=15000;
			total_sal=(aba+(0.05*aba)+(0.2*aba));
			Assignment.CalculateSalary(total_sal);	
		}
		else
		{
			System.out.println("You are Fired!!!!!");
		}

	}

}
