<%@page import="com.wipro.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.wipro.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
</head>
<body>

	<h1>All Employees Details</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Designation</th>
		</tr>
		
		<%
				EmployeeDao edao = new EmployeeDao();
						List<Employee> emps = edao.showAllEmployees();
						
						for(Employee e: emps){
					int id = e.getId();
					String name = e.getName();
					String designation = e.getDesignation();
				%>
		<tr>
			<td> <%= id %> </td>
			<td> <%= name %> </td>
			<td> <%= designation %> </td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>