package com.wipro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (isValidUser(username, password)) {
			
			Cookie usernameCookie = new Cookie("username", username);
			Cookie passwordCookie = new Cookie("password", password);
			
			usernameCookie.setMaxAge(30 * 60);
			passwordCookie.setMaxAge(30 * 60);
			
			response.addCookie(usernameCookie);
			response.addCookie(passwordCookie);
			
			request.setAttribute("username", username);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
		} else {
			response.sendRedirect("index.jsp?error=true");
		}
		
		
	}
	
	private boolean isValidUser(String username, String password) {
         return username.equals("admin") &&password.equals("admin");
	}

}
