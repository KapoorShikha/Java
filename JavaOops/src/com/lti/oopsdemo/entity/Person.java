package com.lti.oopsdemo.entity;

public class Person{
	int Person_Id;
	String P_Name;
	public int getPerson_Id() {
		return Person_Id;
	}
	public void setPerson_Id(int person_Id) {
		Person_Id = person_Id;
	}
	public String getP_Name() {
		return P_Name;
	}
	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int person_Id, String p_Name) {
		super();
		Person_Id = person_Id;
		P_Name = p_Name;
	}
	
	public String toString() {
		return "Person [Person_Id=" + Person_Id + ", P_Name=" + P_Name + ", getPerson_Id()=" + getPerson_Id()
				+ ", getP_Name()=" + getP_Name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	void Calc()
	{
		System.out.println("person class");
	}

}
