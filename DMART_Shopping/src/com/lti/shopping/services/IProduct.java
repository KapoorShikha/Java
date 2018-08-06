package com.lti.shopping.services;

import java.util.ArrayList;

import com.lti.shopping.entity.Product;

public interface IProduct {
	
	public abstract ArrayList<Product> addProducts(Product p);
	public abstract ArrayList<Product> showAllProducts();

}
