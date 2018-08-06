package com.lti.exception;

public class Account {
	
	int acc_id;
	String user_name, bank_name;
	double bal;
	
	public Account(int acc_id, String user_name, double bal) {
		this.acc_id = acc_id;
		this.user_name = user_name;
		this.bank_name = "Axis bank";
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [acc_id=" + acc_id + ", user_name=" + user_name + ", bank_name=" + bank_name + ", bal=" + bal
				+ "]";
	}
	
	
	
	
	

}
