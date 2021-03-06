package com.lti.shopping.dao;

import java.util.ArrayList;

import com.lti.shopping.entity.Product;

public interface IProductDao {
	
	abstract ArrayList<Product> getProductDetails();
	abstract void addProducts(int id, String name, float cost);
	abstract void updateProductDetails(float cost,int id);
	abstract void deleteProduct(String name);
	abstract void searchProduct(int id);
}
