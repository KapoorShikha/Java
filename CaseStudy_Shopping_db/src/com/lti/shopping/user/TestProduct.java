package com.lti.shopping.user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import com.lti.shopping.entity.Product;
import com.lti.shopping.service.ImplProductService;
import com.lti.shopping.service.ProductService;

public class TestProduct {

	public static void main(String[] args) throws SQLException {
		
		ArrayList<Product> mylist = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ProductService service=new ImplProductService();
		String ans,name;
		int no,id;
		float cost;
		
		do {
			
			System.out.println("*****Oracle Product Services******");
			System.out.println("1. Show All Products \n2. Add a New Product");
			System.out.println("3. Update Cost of the Product \n4. Delete a Product");
			System.out.println("5. Search Product \n6. Exit");
			System.out.println("Enter your choice");
			no = sc.nextInt();

			switch (no) {
			case 1:
				mylist=service.getProductDetails();
				System.out.println(mylist);
				break;
				
			case 2:
				System.out.println("Enter ProductId");
				id=sc.nextInt();
				System.out.println("Enter Product Name");
				name=sc.next();
				System.out.println("Enter Product Cost");
				cost=sc.nextFloat();
				
				service.addProducts(id,name,cost);
				
				break;
				
			case 3:
				System.out.println("Enter ProductId you want to Update");
				id=sc.nextInt();
				System.out.println("Enter Updated Product Cost");
				cost=sc.nextFloat();
				
				service.updateProductDetails(cost, id);

				break;
				
			case 4:
				System.out.println("Enter Product name which has to be Deleted");
				name=sc.next();
				
				service.deleteProduct(name);
				break;
				
			case 5:
				System.out.println("Enter Product id to be Searched");
				id= sc.nextInt();
				
				service.searchProduct(id);
				break;
				
			case 6:
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