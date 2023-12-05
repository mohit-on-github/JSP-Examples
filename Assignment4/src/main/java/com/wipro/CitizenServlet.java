package com.wipro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CitizenServlet")
public class CitizenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	CitizenDao cdao;
    public CitizenServlet() {
        super();
        cdao = new CitizenDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		double totalIncome = Double.parseDouble(request.getParameter("income"));
		
		double taxtoPay;
		if (totalIncome <= 180000) {
			taxtoPay = 0;
		} else if(totalIncome <= 500000){
			taxtoPay = 0.1 * (totalIncome - 180000);
		} else if (totalIncome <= 800000) {
			taxtoPay = 32000 + 0.2 * (totalIncome - 500000);
		} else {
			taxtoPay = 92000 + 0.3 * (totalIncome - 800000);
		}
		
		Citizen citizen = new Citizen(id, name, address, totalIncome, taxtoPay);
		int val = cdao.insertCitizen(citizen);
		
		if (val > 0) {
			response.sendRedirect("success.jsp");
		} else {
			response.sendRedirect("citizen.jsp");
		}
	}

}
