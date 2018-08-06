package com.lti.shopping.entity;

public class Product {
	int productId;
	String name;
	float cost;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Product(int productId, String name, float cost) {
		super();
		this.productId = productId;
		this.name = name;
		this.cost = cost;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", cost=" + cost + "] \n";
	}
	
	
	
}
