package com.lti.oops.basics;

public class TestProducts {

	public static void main(String[] args) {
		double bill;

		Products p1=new Products();
		p1.setP_id(111);
		p1.setP_name("Watches");
		p1.setP_cost(450.00);
		bill=p1.CalculateBill(5);
		System.out.println("------BILL----- \n "+p1.toString());
		
		
		Products p2=new Products(102,"Pencils",10.00);
		bill=p2.CalculateBill(10);
		System.out.println("------BILL----- \n "+p2.toString());
	
	}

}
