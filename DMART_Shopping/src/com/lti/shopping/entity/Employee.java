package com.lti.shopping.entity;

import java.util.Comparator;

public class Employee implements Comparable<Employee>,Comparator<Employee> {
	private int id, age, salary;
	private String name;

	public Employee() {
		this.id = 0;
		this.age = 0;
		this.salary = 0;
		this.name = "*****";

	}

	public Employee(int id, int age, int salary, String name) {
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(o.getId()==this.id)
		{
			return 0;
		}
		else if(o.getId()>this.id)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
	public int compare(Employee p,Employee q) {
		if(p.getSalary()>q.getSalary())
		{
			return 1;
		}
		else if(p.getSalary()<q.getSalary())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

}
