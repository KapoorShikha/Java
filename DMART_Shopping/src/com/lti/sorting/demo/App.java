package com.lti.sorting.demo;

//import java.util.ArrayList;

import com.lti.shopping.entity.Employee;

import java.util.*;

public class App {

	public static void main(String[] args) {
		List <Employee> mylist= new ArrayList<Employee>() ;
		
		Employee emp_Jay = new Employee(101, 27, 95000, "Jay");
		mylist.add(emp_Jay);
		
		Employee emp_Veeru = new Employee(99, 27, 85000, "Veeru");
		mylist.add(emp_Veeru);
		
		Employee emp_Thakur = new Employee(111, 72, 45000, "Thakur");
		mylist.add(emp_Thakur);
		
		Employee emp_Basanti = new Employee(201, 25, 1000000, "Basanti");
		mylist.add(emp_Basanti);
		
		Employee emp_Gabbar = new Employee(141, 32, 50000, "Gabbar");
		mylist.add(emp_Gabbar);
		
		System.out.println("======Before Sorting========");
		
		for(Employee e:mylist)
		{
			System.out.println(e.toString());
		}
		
		Collections.sort(mylist);
		
		System.out.println("======After Sorting========");
		for(Employee emp:mylist)
		{
			System.out.println(emp.toString());
		}
		
		Employee temp=new Employee();
		Collections.sort(mylist,temp);
		
		System.out.println("======After Sorting By Salary========");
		for(Employee em:mylist)
		{
			System.out.println(em.toString());
		}
		
	}

}
