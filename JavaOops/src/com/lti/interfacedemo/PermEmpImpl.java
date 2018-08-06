package com.lti.interfacedemo;

public class PermEmpImpl implements Iperson{

	int EmpId;
	double BasicSal;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public double getBasicSal() {
		return BasicSal;
	}

	public void setBasicSal(double basicSal) {
		BasicSal = basicSal;
	}

	@Override
	public String toString() {
		return "PermEmpImpl [EmpId=" + EmpId + ", BasicSal=" + BasicSal + "]";
	}
                        
	public void calc() {
		
		double Tsal=BasicSal+1000;
		System.out.println("total salary: "+Tsal);
	}

}
