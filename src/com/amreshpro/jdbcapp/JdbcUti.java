package com.amreshpro.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class JdbcUti {
//	load the driver
		
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//	established connection
	
	private static String url ="jdbc:mysql://localhost:3306/jdbc";
	private static String user="root";
	private static String password="my-secret-pw";
	
	

	
	static Connection getConnection() throws SQLException {
						return DriverManager.getConnection(url,user,password);
		
	}
	
}
