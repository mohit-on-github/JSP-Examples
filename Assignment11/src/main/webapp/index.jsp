<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page - Assignment11</title>
</head>
<body>

	<h1>Login</h1>
	<form action="LoginServlet" method="post">
		<label for="username">Username:</label> <input type="text"
			name="username" required><br> <label for="password">Password:</label>
		<input type="password" name="password" required><br> <input
			type="submit" value="Login">
	</form>
	<%-- Check for login errors and display appropriate messages --%>
	<c:if test="${not empty errorMessage}">
		<p style="color: red;">${errorMessage}</p>
	</c:if>

</body>
</html>