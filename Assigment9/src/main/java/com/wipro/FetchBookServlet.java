package com.wipro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchBookServlet
 */
@WebServlet("/FetchBookServlet")
public class FetchBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	    BookDAO bdao;

	    public FetchBookServlet() {
	        super();
	        bdao = new BookDAO();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String title = request.getParameter("title");

	        Book book = bdao.getBookByName(title);

	        request.setAttribute("book", book);
	        request.getRequestDispatcher("fetch-book.jsp").forward(request, response);
	    }
}
