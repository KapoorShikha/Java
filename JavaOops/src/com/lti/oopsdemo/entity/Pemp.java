package com.lti.oopsdemo.entity;

public class Pemp extends Person {
	int Sal;

	public int getSal() {
		return Sal;
	}

	public void setSal(int sal) {
		Sal = sal;
	}

	public Pemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pemp(int person_Id, String p_Name, int Sal) {
		super(person_Id, p_Name);
		this.Sal=Sal;
	}

	void Calc()
	{
		Sal=5000;
		System.out.println("pemp child class \n sal="+Sal);
	}

	@Override
	public String toString() {
		return "Pemp [Sal=" + Sal + ", Person_Id=" + Person_Id + ", P_Name=" + P_Name + "]";
	}


}
	
