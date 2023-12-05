package com.wipro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Perform actions to retrieve and display Employee Salary Details
        // For simplicity, let's assume we fetch some data and display it here

        response.setContentType("text/html");
        response.getWriter().println("<h1>Employee Salary Details</h1>");
        response.getWriter().println("<p>Employee 1: Salary $5000</p>");
        response.getWriter().println("<p>Employee 2: Salary $6000</p>");
    }
}
