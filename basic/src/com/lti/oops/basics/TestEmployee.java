package com.lti.oops.basics;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmployee_id(100);
		emp.setEmployee_first_name("Shikha");
		emp.setEmployee_last_name("Kapur");
		emp.setSalary(20000);
		System.out.println(emp.toString());
		
		Employee emp1=new Employee();
		emp1.setEmployee_id(101);
		emp1.setEmployee_first_name("Dhanshree");
		emp1.setEmployee_last_name("Deshmukh");
		emp1.setSalary(25000);
		System.out.println(emp1.toString());
		
	}

}
