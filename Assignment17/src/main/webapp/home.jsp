<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome, <%= session.getAttribute("username") %>!</h1>
    <a href="EmployeeDetailsServlet">View Employee Salary Details</a>
</body>
</html>