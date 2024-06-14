package com.april19;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class MySqlConn {

	public static void main(String[] args) {
Statement stmt = null;		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1169db", "root", "root");
			System.out.println("Connected Successfully..");
			
		    stmt = conn.createStatement();
			String sq1 = "SELECT * FROM employee";
			ResultSet rs = stmt.executeQuery(sq1);
			
			while(rs.next()) {
				int id = rs.getInt("eID");
				String first = rs.getString("name");
				int sal = rs.getInt("salary");
				
				System.out.println("ID is: "+id);
				System.out.println("Name is: "+first);
				System.out.println("Salary is: "+sal);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Drive class path doesn't found");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
