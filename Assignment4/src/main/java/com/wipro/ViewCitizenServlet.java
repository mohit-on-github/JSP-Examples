package com.wipro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewCitizenServlet")
public class ViewCitizenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ViewCitizenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		CitizenDao cdao = new CitizenDao();
		Citizen citizen = cdao.getCitizenByID(id);
		
		request.setAttribute("citizen", citizen);
		request.getRequestDispatcher("view-citizen.jsp").forward(request, response);
	}

}
