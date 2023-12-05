package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	private static final String url = "jdbc:mysql://localhost:3306/library";
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


	public int saveBook(Book book) {
		int flag = 0;
		
		try {
			
			String sql = "insert into books(title, publisher, isbn, authorId)"+
			"VALUES(?,?,?,?)";
			
			PreparedStatement pst = DBConnect().prepareStatement(sql);
			pst.setString(1, book.getTitle());
			pst.setString(2, book.getPublisher());
			pst.setString(3, book.getIsbn());
			pst.setInt(4, book.getAuthorId());
			
			flag = pst.executeUpdate();
			
		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return flag;
	}
	
	public Book getBookByName(String name) {
		Book book = new Book();
		
		try {
			
			String sql = "select * from books where title = ?";
			PreparedStatement pst = DBConnect().prepareStatement(sql);
			pst.setString(1, name);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				book.setBookId(rs.getInt(1));
				book.setTitle(name);
				book.setPublisher(rs.getString(3));
				book.setIsbn(rs.getString(4));
				book.setAuthorId(rs.getInt(5));
			}
			
		} catch (SQLException sqx) {
			System.out.println(sqx.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return book;
	}
	public List<Book> showAllBooks() {
	    List<Book> books = new ArrayList<>();

	    try {
	        String query = "SELECT * FROM books";
	        Statement st = DBConnect().createStatement();
	        ResultSet rs = st.executeQuery(query);

	        while (rs.next()) {
	            Book book = new Book(); // Create a new Book object for each book

	            book.setBookId(rs.getInt(1));
	            book.setTitle(rs.getString(2));
	            book.setPublisher(rs.getString(3));
	            book.setIsbn(rs.getString(4));
	            book.setAuthorId(rs.getInt(5));

	            books.add(book);
	        }

	        // Close ResultSet, Statement, and Connection here (not shown in the provided code).
	    } catch (SQLException sqx) {
	        System.out.println(sqx.getMessage());
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }

	    return books;
	}

}
