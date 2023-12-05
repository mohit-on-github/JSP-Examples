<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Page Dispatcher</title>
</head>
<body>
    <%
        String operationParam = request.getParameter("operation");
        if (operationParam != null && !operationParam.isEmpty()) {
            try {
                int operationValue = Integer.parseInt(operationParam);
                if (operationValue < 10) {
                    request.getRequestDispatcher("page1.jsp").forward(request, response);
                } else if (operationValue >= 10 && operationValue < 99) {
                    request.getRequestDispatcher("page2.jsp").forward(request, response);
                } else {
                    response.sendRedirect("errorPage.jsp");
                }
            } catch (NumberFormatException e) {
                throw new ServletException(e); // Let the error page handle the exception
            }
        } else {
            response.sendRedirect("errorPage.jsp");
        }
    %>
</body>
</html>
