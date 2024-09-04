package com.amreshpro.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyJdbcApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	

Connection connection = JdbcUti.getConnection();

		PreparedStatement ptsmt = connection.prepareStatement("INSERT INTO user(id,name,city) VALUES (?,?,?); ");
	
		ptsmt.setInt(1, 11);
		ptsmt.setString(2,"Ritika");
		ptsmt.setString(3, "Jind");
		
	int rowAffected = 	ptsmt.executeUpdate();
	if(rowAffected ==0) {	
		System.out.println("Registration unsuccessfull! Something went gone wrong!");
	}else {
System.out.println("Registration successfull");
	}
		
		
	}

}
