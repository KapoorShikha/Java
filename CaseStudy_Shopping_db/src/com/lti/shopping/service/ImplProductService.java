package com.lti.shopping.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.lti.shopping.dao.IProductDao;
import com.lti.shopping.dao.ProductDaoImpl;
import com.lti.shopping.entity.Product;

public class ImplProductService implements ProductService {

	private IProductDao DaoService;

	public ArrayList<Product> getProductDetails() {

		return DaoService.getProductDetails();
	}

	public ImplProductService() throws SQLException {

		DaoService = new ProductDaoImpl();
	}

	@Override
	public void addProducts(int id, String name, float cost) {
		DaoService.addProducts(id,name,cost);
	}

	@Override
	public void updateProductDetails(float cost, int id) {
		
		DaoService.updateProductDetails(cost, id);
	}

	@Override
	public void deleteProduct(String name) {
		
		DaoService.deleteProduct(name);
	}

	@Override
	public void searchProduct(int id) {
		
		DaoService.searchProduct(id);
	}

}
