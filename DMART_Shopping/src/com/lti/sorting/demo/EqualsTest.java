package com.lti.sorting.demo;

import java.util.HashSet;
import java.util.Set;

import com.lti.shopping.entity.Employee;

public class EqualsTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee(100,22,25000,"Jay");
		Employee e2=new Employee(100,22,25000,"Jay");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		/*e1 = e2;
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());*/
		System.out.println(e1.equals(e2));
		
		Set<Employee> emplist=new HashSet<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		
		System.out.println(emplist);

	}

}
