package com.lti.oopsdemo.entity;

public class TestInheritance {

	public static void main(String[] args) {
		
		Person p=new Person(101,"Jay");
		p.Calc();
		
		Pemp pe=new Pemp(102, "Vijay", 50000);
		pe.Calc();
	}

}
