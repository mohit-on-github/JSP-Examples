package com.wipro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	BookDAO bdao;
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
        bdao = new BookDAO();
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
		String title = request.getParameter("title");
		String publisher = request.getParameter("publisher");
		String isbn = request.getParameter("isbn");
		int authorid = Integer.parseInt(request.getParameter("authorid"));
		
		Book book = new Book(title, publisher, isbn, authorid);
		int flag = bdao.saveBook(book);
		
		if (flag > 0) {
			response.sendRedirect("success.jsp");
		} else {
			response.sendRedirect("index.jsp");
		}
		
	}

}
