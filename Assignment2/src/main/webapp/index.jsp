<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Marks and Grade</title>
</head>
<body>
    <h1>Student Marks and Grade</h1>
    
    <form action="" method="post">
        <label for="subject1">Subject 1 Marks:</label>
        <input type="number" name="subject1" min=0 max=100 required><br>
        
        <label for="subject2">Subject 2 Marks:</label>
        <input type="number" name="subject2" min=0 max=100 required><br>
        
        <label for="subject3">Subject 3 Marks:</label>
        <input type="number" name="subject3" min=0 max=100 required><br>
        
        <input type="submit" value="Calculate">
    </form>
    
    <c:if test="${not empty param.subject1 and not empty param.subject2 and not empty param.subject3}">
        <%
            double subject1 = Double.parseDouble(request.getParameter("subject1"));
            double subject2 = Double.parseDouble(request.getParameter("subject2"));
            double subject3 = Double.parseDouble(request.getParameter("subject3"));
            
            double total = subject1 + subject2 + subject3;
            double average = total / 3;
            
            String grade;
            if (average >= 80.0) {
                grade = "A";
            } else if (average >= 70.0) {
                grade = "B";
            } else if (average >= 60.0) {
                grade = "C";
            } else if (average >= 50.0) {
                grade = "D";
            } else {
                grade = "F";
            }
        %>
        <h2>Results:</h2>
        <p>Total Marks: <%= total %></p>
        <p>Average Marks: <%= average %></p>
        <p>Grade: <%= grade %></p>
    </c:if>
</body>
</html>
