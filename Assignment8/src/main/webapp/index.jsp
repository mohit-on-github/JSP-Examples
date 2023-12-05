<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Salary Calculator</title>
</head>
<body>
    <h2>Employee Salary Calculator</h2>
    
    <jsp:useBean id="employee" class="com.wipro.EmployeeBean" scope="request" />
    
    <form action="processEmployee.jsp" method="post">
        Employee Name: <input type="text" name="employeeName"><br>
        Employee ID: <input type="text" name="employeeID"><br>
        <input type="submit" value="Calculate Salary">
    </form>
</body>
</html>
