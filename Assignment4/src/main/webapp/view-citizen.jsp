<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Citizen Details</title>
<style type="text/css">
h1 {
	text-align: center;
}
</style>
</head>
<body>
	
		<h1>View Citizen Data</h1>
		<form action="ViewCitizenServlet" method="post">
        Citizen ID: <input type="text" name="id">
        <input type="submit" value="View Details">
    </form>
    <br>
    <c:if test="${not empty citizen}">
        <h2>Citizen Details</h2>
        <p>ID: ${citizen.id}</p>
        <p>Name: ${citizen.name}</p>
        <p>Address: ${citizen.address}</p>
        <p>Total Income: ${citizen.totalIncome}</p>
        <p>Tax to Pay: ${citizen.taxToPay}</p>
    </c:if>
	
</body>
</html>