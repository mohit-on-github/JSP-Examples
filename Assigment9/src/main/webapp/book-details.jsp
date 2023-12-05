<%@page import="com.wipro.Book"%>
<%@page import="com.wipro.BookDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Details</title>
<style type="text/css">
h1 {
	text-align: center;
}
</style>
</head>
<body>

	<h1>All Book Details</h1>
	<table border="1">
		<tr>
			<th>Book_ID</th>
			<th>Book Title</th>
			<th>Book Publisher</th>
			<th>ISBN</th>
			<th>AuthorId</th>
		</tr>
		<%
		BookDAO bdao = new BookDAO();
		List<Book> books = bdao.showAllBooks();

		for (Book b : books) {
			
			int id = b.getBookId();
			String title = b.getTitle();
			String publisher = b.getPublisher();
			String isbn = b.getIsbn();
			int author = b.getAuthorId();
			
		%>

		<tr>
			<td> <%= id %> </td>
			<td> <%= title%> </td>
			<td> <%= publisher %> </td>
			<td> <%= isbn %> </td>
			<td> <%= author %> </td>
		</tr>

		<%
		}
		%>
	</table>

</body>
</html>