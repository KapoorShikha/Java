package com.lti.oops.basics;

public class Products {

	int P_id;
	String P_name;
	double P_cost,bill;

	public int getP_id() {
		return P_id;
	}

	public void setP_id(int p_id) {
		P_id = p_id;
	}

	public String getP_name() {
		return P_name;
	}

	public void setP_name(String p_name) {
		P_name = p_name;
	}

	public double getP_cost() {
		return P_cost;
	}

	public void setP_cost(double p_cost) {
		P_cost = p_cost;
	}

	Products(int P_id, String P_name, double P_cost) {
		System.out.println("Products [P_id=" + P_id + ", P_name=" + P_name + ", P_cost=" + P_cost + "]");
		this.P_id=P_id;
		this.P_name=P_name;
		this.P_cost=P_cost;
	}

	public Products() {	
		System.out.println("Products [P_id=" + P_id + ", P_name=" + P_name + ", P_cost=" + P_cost + "]");
	}

	public double CalculateBill(int quantity) {
		bill = P_cost * quantity;
		return bill;
	}

	@Override
	public String toString() {
		return "Products [Product id=" + P_id + "\n Product name=" + P_name + "\n Total bill=" + bill + "]";
	}

}
