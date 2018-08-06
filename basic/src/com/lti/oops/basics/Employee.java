package com.lti.oops.basics;

public class Employee {
	
	int Employee_id;
	String Employee_first_name;
	String Employee_last_name;
	double salary;
	
	public int getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}
	public String getEmployee_first_name() {
		return Employee_first_name;
	}
	public void setEmployee_first_name(String employee_first_name) {
		Employee_first_name = employee_first_name;
	}
	public String getEmployee_last_name() {
		return Employee_last_name;
	}
	public void setEmployee_last_name(String employee_last_name) {
		Employee_last_name = employee_last_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Employee[Employee_id : "+Employee_id+"\n Employee_first_name : "+
	Employee_first_name+"\n Employee_last_name : "+Employee_last_name+
	"\n employee_salary : "+salary+"]";
	}

}
