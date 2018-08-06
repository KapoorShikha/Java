package com.lti.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3 {
	
		public static void main(String[] args) throws SQLException {
			
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Connection conn=DriverManager.getConnection(url, "hr", "hr");
			
			if(conn!=null)
			{
				System.out.println("Connected");
			}
			
			try
			{
				Statement stmt= conn.createStatement();
				int i=stmt.executeUpdate("Insert into Products values(104,'Battery',700)");
				System.out.println(i+" Record Inserted");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			finally {
				try {
					conn.close();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}

	}

