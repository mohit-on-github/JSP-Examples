<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page - Assignment 12</title>
</head>
<body>
	<h1>Login</h1>
	<form action="LoginServlet" method="post">
		<label for="username">Username:</label> <input type="text"
			name="username" required><br> <label for="password">Password:</label>
		<input type="password" name="password" required><br> <input
			type="submit" value="Login">
	</form>
</body>
</html>