package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CitizenDao {

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

	public int insertCitizen(Citizen citizen) {
		int flag = 0;
		
		try {
			
			String sql = "insert into Citizen(id, name, address, total_income, tax_to_pay)"+
			"VALUES(?,?,?,?,?)";
			
			PreparedStatement pmt = DBConnect().prepareStatement(sql);
			pmt.setInt(1, citizen.getId());
			pmt.setString(2, citizen.getName());
			pmt.setString(3, citizen.getAddress());
			pmt.setDouble(4, citizen.getTotalIncome());
			pmt.setDouble(5, citizen.getTaxToPay());
			
			flag = pmt.executeUpdate();
			
		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return flag;
	}
	
	
	public Citizen getCitizenByID(int id) {
		Citizen citizen = new Citizen();
		try {
			
			String query = "select * from Citizen where id = ?";
			PreparedStatement pmt = DBConnect().prepareStatement(query);
			pmt.setInt(1, id);
			
			ResultSet rs = pmt.executeQuery();
			
			while (rs.next()) {
				citizen.setId(id);
				citizen.setName(rs.getString(2));
				citizen.setAddress(rs.getString(3));
				citizen.setTotalIncome(rs.getDouble(4));
				citizen.setTaxToPay(rs.getDouble(5));
			}
			
		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return citizen;
	}

}
