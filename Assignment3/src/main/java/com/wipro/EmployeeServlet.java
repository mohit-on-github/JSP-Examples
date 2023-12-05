package com.wipro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Database edao; 
    public EmployeeServlet() {
        super();
        edao = new Database();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		double yearsOfExperience = Double.parseDouble(request.getParameter("experience"));
		double hoursWorked = Double.parseDouble(request.getParameter("hours"));
		
		double hourlyRate;
		if (yearsOfExperience < 2.0) {
			hourlyRate = 20.0;
		} else if (yearsOfExperience < 5.0) {
			hourlyRate = 50.0;
		} else {
			hourlyRate = 90.0;
		}
		
		double wages;
		if (hoursWorked > 40.0) {
			wages = (40.0 * hourlyRate) + (hoursWorked - 40.0) * 1.5 * hourlyRate;
		} else {
			wages = hoursWorked * hourlyRate;
		}
		
		Model employee = new Model(0, name, address, yearsOfExperience, wages);
		int flag = edao.saveEmployee(employee);
		
		if (flag > 0) {
			response.sendRedirect("success.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
		
	}

}
