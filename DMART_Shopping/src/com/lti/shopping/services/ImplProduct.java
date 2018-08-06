package com.lti.shopping.services;

import java.util.*;
import com.lti.shopping.entity.Product;

public class ImplProduct implements IProduct{
	
	ArrayList<Product> mylist=new ArrayList();

	@Override
	public ArrayList<Product> addProducts(Product p) {
	    //mylist=new ArrayList();
		mylist.add(p);
		return mylist;
		
		/*Product p1=new Product(101,"Mobile",6000.00f);
		Product p2=new Product(234,"Laptop",35000.00f);
		Product p3=new Product(59,"Keyboard",1000.00f);
		*/
		/*mylist.add(p1);
		mylist.add(p2);
		mylist.add(p3);
		*/
		//System.out.println(mylist);
	}

	@Override
	public ArrayList<Product> showAllProducts() {
		
		return mylist;
	}

}
