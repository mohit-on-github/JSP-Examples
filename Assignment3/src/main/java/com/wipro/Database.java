package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {

	private static final String url = "jdbc:mysql://localhost:3306/jsp";
	private static final String username = "root";
	private static final String password = "mohit1234";
	
	public static Connection DBConnect() {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection(url, username, password);
			
			if (conn != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Connection Failed");
			}
			
		} catch (ClassNotFoundException cx) {
			System.out.println(cx.getMessage());
		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return conn;
	}
	
	public int saveEmployee(Model emp) {
		int flag = 0;
		try {
			
			String sql = "insert into Employee(name, address, yearsOfExperience, wages)"+
			"VALUES(?,?,?,?)";
			PreparedStatement pmt = DBConnect().prepareStatement(sql);
			pmt.setString(1, emp.getName());
			pmt.setString(2, emp.getAddress());
			pmt.setDouble(3, emp.getYearsOfExperience());
			pmt.setDouble(4, emp.getWages());
			
			flag = pmt.executeUpdate();
			
		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return flag;
	}
	public List<Model> getAllEmployees() {
	    List<Model> employees = new ArrayList<Model>();

	    try {
	        String query = "SELECT * FROM Employee";
	        Statement st = DBConnect().createStatement();
	        ResultSet rs = st.executeQuery(query);

	        while (rs.next()) {
	            Model emp = new Model(); // Create a new Model object for each employee

	            emp.setID(rs.getInt(1));
	            emp.setName(rs.getString(2));
	            emp.setAddress(rs.getString(3));
	            emp.setYearsOfExperience(rs.getDouble(4));
	            emp.setWages(rs.getDouble(5));

	            employees.add(emp);
	        }

	        // Close ResultSet, Statement, and Connection here (not shown in the provided code).
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return employees;
	}
}

