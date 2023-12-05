<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee - Assignment 13</title>
</head>
<body>

	 <h1>Employee Details</h1>
    <form action="EmployeeServlet" method="post">
    
    	<label for="id">ID:</label>
        <input type="text" name="id" required><br>
    
        <label for="name">Name:</label>
        <input type="text" name="name" required><br>
        
        <label for="designation">Designation:</label>
        <input type="text" name="designation" required><br>
        
        <input type="submit" value="Submit">
    </form>

</body>
</html>