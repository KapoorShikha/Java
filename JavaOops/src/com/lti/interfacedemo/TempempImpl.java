package com.lti.interfacedemo;

public class TempempImpl implements Iperson{
	
	int Tempid, noDays;
	double SalPerDay;
	public int getTempid() {
		return Tempid;
	}
	public void setTempid(int tempid) {
		Tempid = tempid;
	}
	public int getNoDays() {
		return noDays;
	}
	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}
	public double getSalPerDay() {
		return SalPerDay;
	}
	public void setSalPerDay(double salPerDay) {
		SalPerDay = salPerDay;
	}
	@Override
	public String toString() {
		return "TempempImpl [Tempid=" + Tempid + ", noDays=" + noDays + ", SalPerDay=" + SalPerDay + "]";
	}
	@Override
	public void calc() {
		
		double Tsal=SalPerDay*noDays;
		System.out.println("total salary: "+Tsal);
	}
	
	

}
