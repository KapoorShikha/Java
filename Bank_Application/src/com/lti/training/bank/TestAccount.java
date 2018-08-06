package com.lti.training.bank;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ans;
		int no;

		do {
			System.out.println("****Axis bank management system******");
			System.out.println("1. Add Account \n 2. Withdraw amount");
			System.out.println("3. Deposit Amount \n 4. Display Transaction");
			System.out.println("5. Exit \n Enter your choice");
			no = sc.nextInt();
			switch (no) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:

			}

		} while (no != 100);
	}

}
