package com.lti.exception;

public class SavingsAcc extends Account{

	public SavingsAcc(int acc_id, String user_name, double bal) {
		super(acc_id, user_name, bal);

	}
	
	public void Withdraw(double Amount) throws CustomExp
	{
		if(bal<Amount)
			throw new CustomExp("\n!!!!!!!!!!ERROR!!!!!!!!!!!!!! \n you have insufficient balance");
		
		else
			System.out.println("new balance is: "+(bal-Amount));
		
	}

	
}
