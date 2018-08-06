package com.lti.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.lti.shopping.entity.Product;
import com.lti.shopping.util.DbUtil1;

public class ProductDaoImpl implements IProductDao {

	DbUtil1 util = null;
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Statement stmt=null;
	int i;

	public ArrayList<Product> getProductDetails() {
		ArrayList<Product> ProductList = new ArrayList<Product>();
		try {
			conn = util.getConnectionFromPool();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from Products");

			while (rs.next()) {
				int id = rs.getInt("Prdid");
				String name = rs.getString("PrdName");
				float cost = rs.getFloat("PrdCost");
				System.out.println("\t" + id + " " + name + " " + cost + "\n");
				Product p1 = new Product(id, name, cost);
				ProductList.add(p1);

			}
			return ProductList;

		} catch (Exception e) {
			System.out.println(e);
		}
		return ProductList;

	}

	public ProductDaoImpl() throws SQLException {

		util = new DbUtil1();
	}

	@Override
	public void addProducts(int id, String name, float cost){
		
		try {
			conn = util.getConnectionFromPool();
			pstmt = conn.prepareStatement("Insert into Products values(?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2,name);
			pstmt.setFloat(3, cost);
			i=pstmt.executeUpdate();
			System.out.println(i+" Record Inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public void updateProductDetails(float cost,int id) {
		
		try
		{
			pstmt = conn.prepareStatement("update Products set PrdCost=? where Prdid=?");
			pstmt.setFloat(1, cost);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			System.out.println("record updated");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void deleteProduct(String name) {
		
		try
		{
			pstmt = conn.prepareStatement("delete from Products where PrdName=?");
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			System.out.println("Record Deleted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void searchProduct(int id) {
		
		try {
			conn = util.getConnectionFromPool();
			pstmt = conn.prepareStatement("Select * from Products where Prdid=?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String name = rs.getString("PrdName");
				float cost = rs.getFloat("PrdCost");
				System.out.println("\t" + id + " " + name + " " + cost + "\n");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
