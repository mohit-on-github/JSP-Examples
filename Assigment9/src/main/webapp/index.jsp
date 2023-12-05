<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>

	<h1>Add Book</h1>
	<form action="AddBookServlet" method="post">
		Title: <input type="text" name="title" required><br>
		Publisher: <input type="text" name="publisher" required><br>
		ISBN: <input type="text" name="isbn" required><br> Author
		ID: <input type="text" name="authorid" required><br> <input
			type="submit" value="Add Book">
	</form>
	<br>
	<div>
		<a href="fetch-book.jsp">Search Book by Name</a>
	</div>
</body>
</html>