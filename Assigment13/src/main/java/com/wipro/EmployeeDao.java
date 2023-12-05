package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

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

	public int insertEmployee(Employee employee) {
		int flag = 0;

		try {

			String sql = "insert into emp(id, name, designation) VALUES(?,?,?)";
			PreparedStatement pst = DBConnect().prepareStatement(sql);
			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getName());
			pst.setString(3, employee.getDesignation());

			flag = pst.executeUpdate();

		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return flag;
	}

	public Employee getEmployeeByID(int id) {
		Employee emp = new Employee();

		try {

			String query = "select * from emp where id = ?";
			PreparedStatement pst = DBConnect().prepareStatement(query);
			pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				emp.setId(id);
				emp.setName(rs.getString(2));
				emp.setDesignation(rs.getString(3));

			}

		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return emp;
	}

	public List<Employee> showAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		
		try {

			String sql = "select * from emp";
			Statement st = DBConnect().createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDesignation(rs.getString(3));

				employees.add(emp);
			}

		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return employees;
	}

	public int updateEmployee(Employee emp, int id) {
		int flag = 0;

		try {

			String sql = "update emp set name = ?, designation = ? where id = ?";
			PreparedStatement pst = DBConnect().prepareStatement(sql);
			pst.setString(1, emp.getName());
			pst.setString(2, emp.getDesignation());
			pst.setInt(3, id);

			flag = pst.executeUpdate();

		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return flag;
	}

	public int deleteEmployee(int id) {
		int flag = 0;

		try {

			String sql = "delete from emp where id = ?";
			PreparedStatement pst = DBConnect().prepareStatement(sql);
			pst.setInt(1, id);

			flag = pst.executeUpdate();

		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return flag;
	}
}
