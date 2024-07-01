package com.jdbclearning;

import java.sql.*;

public class JdbcUtil {

	static {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws SQLException {

		// established connection
		String DB_NAME = "jdbclearning";
		String url = "jdbc:mysql://localhost:3306/" + DB_NAME;
		String user = "root";
		String password = "my-secret-pw";

		return DriverManager.getConnection(url, user, password);

	}
	
	public static void closeConnection(Connection connect, Statement statement) throws SQLException {
		// close the resources
		statement.close();
		connect.close();	
	}

}
