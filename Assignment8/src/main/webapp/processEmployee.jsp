<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.wipro.EmployeeBean" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Processed Employee Data</title>
</head>
<body>
    <h2>Processed Employee Data</h2>
    
    <jsp:useBean id="employee" class="com.wipro.EmployeeBean" scope="request" />
    
    <p>Employee Name: <jsp:getProperty name="employee" property="employeeName" /></p>
    <p>Employee ID: <jsp:getProperty name="employee" property="employeeID" /></p>
</body>
</html>
