package com.techmojo.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo_01 {

	public static void main(String[] args) {
		String url = "jdbc:derby:memory:demoDb;create=true";
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connection : "+con);
			String sql1 = "create Table student("
					+ "id int,"
					+ "name varchar(40),"
					+ "email varchar(40))";
			String sql2 = "insert into student values(101,"
					+ "'Utkarsh',"
					+ "'utkarsh15@gmail.com')";
			Statement stmt= con.createStatement();
			stmt.execute(sql1);
			System.out.println("Table created successfully");
			stmt.executeUpdate(sql2);
			System.out.println("Inserted Sucessfully");
			con.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
