package com.vidvaan.spring.boot.sprintbootapp.service;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
//here sonoo is database name, root is username and password  
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from empl");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}