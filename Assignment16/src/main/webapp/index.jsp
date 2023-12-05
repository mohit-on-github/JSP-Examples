<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Per-Client Access Counts</title>
</head>
<body>
    <h1>Per-Client Access Counts</h1>
    <%-- Initialize accessCount to 0 for the first visit --%>
    <c:if test="${empty sessionScope.accessCount}">
        <c:set var="accessCount" value="0" scope="session" />
    </c:if>

    <%-- Increment accessCount on each visit --%>
    <c:if test="${not empty param.increment}">
        <c:set var="accessCount" value="${sessionScope.accessCount + 1}" scope="session" />
    </c:if>

    <%-- Display the access count --%>
    <p>Access Count: ${sessionScope.accessCount}</p>

    <%-- Hidden form field to pass the "increment" parameter on form submission --%>
    <form action="index.jsp" method="post">
        <input type="hidden" name="increment" value="true">
        <input type="submit" value="Increment Access Count">
    </form>
</body>
</html>
