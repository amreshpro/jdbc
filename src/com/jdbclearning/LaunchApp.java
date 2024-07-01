package com.jdbclearning;

import java.sql.*;

public class LaunchApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Statement statement = null;
		Connection connect = null;

		try {
			// load and register the driver
			connect = JdbcUtil.getConnection();

			// create statement
			statement = connect.createStatement();

			// execute query
			String sql = "INSERT INTO studentInfo(id,sname,sage,scity) VALUES(3,'ARUN',22,'Rohtak')";
			int rowAffected = statement.executeUpdate(sql);

			// process result
			if (rowAffected == 0) {
				System.out.println("Unable to insert data");
			} else {
				System.out.println("Some row will be affected, Data inserted succesfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				JdbcUtil.closeConnection(connect, statement);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
