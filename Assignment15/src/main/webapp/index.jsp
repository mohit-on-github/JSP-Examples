<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h1>
        <%-- Check if the "visited" cookie is present --%>
        <c:if test="${empty cookie['visited']}">
            <%-- If not present, set the "visited" cookie --%>
            <c:set var="visited" value="true" scope="session"/>
            Welcome to the new user!
        </c:if>
        <%-- If the "visited" cookie is present, display "Welcome back" message --%>
        <c:if test="${not empty cookie['visited']}">
            Welcome back!
        </c:if>
    </h1>
</body>
</html>
