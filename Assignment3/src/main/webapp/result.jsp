<%@page import="com.wipro.Database"%>
<%@page import="com.wipro.Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee View</title>
</head>
<body>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>YearsOfExperience</th>
            <th>Wages</th>
        </tr>
        <%
        Database edao = new Database();
        System.out.print(edao.getAllEmployees());
        List<Model> emps = edao.getAllEmployees();
		
        for (Model e : emps) {
            int id = e.getID();
            String name = e.getName();
            String address = e.getAddress();
            double yearsExp = e.getYearsOfExperience();
            double wages = e.getWages();
        %>

        <tr>
            <td> <%= id %> </td>
            <td> <%= name %> </td>
            <td> <%= address %> </td>
            <td> <%= yearsExp %> </td>
            <td> <%= wages %> </td>
        </tr>
    
        <%
        }
        %>
    </table>

</body>
</html>
