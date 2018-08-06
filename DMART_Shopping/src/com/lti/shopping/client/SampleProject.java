package com.lti.shopping.client;

import java.util.*;
import com.lti.shopping.entity.Product;
import com.lti.shopping.services.*;

public class SampleProject {

	public static void main(String[] args) {

		IProduct service= new ImplProduct();;
		ArrayList<Product> list=null;
		Scanner sc = new Scanner(System.in);
		String ans;
		int no;
		

		do {
			System.out.println("****D-Mart Product Services******");
			System.out.println("1. Add Product \n2. Display all Product ");
			System.out.println("3. Search for a Product \n4. Delete a  Product");
			System.out.println("5. Exit \nEnter your choice");
			no = sc.nextInt();

			switch (no) {
			case 1:
				System.out.println("Enter Product number");
				int Product_Id = sc.nextInt();
				System.out.println("Enter Product name");
                String Product_name = sc.next();
                System.out.println("Enter Cost of the Product");
                float Product_cost = sc.nextFloat();
				
				
				Product p1= new Product(Product_Id, Product_name,Product_cost);			
				list = service.addProducts(p1);
				System.out.println(list);
				break;
				
			case 2:
				//System.out.println(list);
				System.out.println(service.showAllProducts());
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter proper choice");
			}

			System.out.println("Do you want to continue:[yes/no]");
			ans = sc.next();
			
		} while (ans.equalsIgnoreCase("yes"));
	}

}
