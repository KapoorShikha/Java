package com.lti.interfacedemo;

public class TestInterface {

	public static void main(String[] args) {
		PermEmpImpl p_emp=new PermEmpImpl();
		p_emp.setEmpId(1111);
		p_emp.setBasicSal(10000);
		p_emp.calc();
		
		
		TempempImpl t_emp=new TempempImpl();
		t_emp.setTempid(2222);
		t_emp.setNoDays(20);
		t_emp.setSalPerDay(2000);
		t_emp.calc();       
	
		/*Iperson P_ref;
		P_ref=p_emp;
		P_ref.calc();
		
		P_ref=t_emp;
		P_ref.calc();*/
	}

}
