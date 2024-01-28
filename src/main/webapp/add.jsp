<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
  <% 
     int i = Integer.parseInt(request.getParameter("num1"));
     int j = Integer.parseInt(request.getParameter("num2"));
     
     int k = i + j;
     out.println("Output : "+k);
     %>
     <!-- Above tag is called a scriptlet tag -->
</body>
</html>


<!-- JSP automatically gives us access to these request and response objects. Also other objects like PrintWriter object. -->


<!-- 
Directive tags for importing
Declaration tags for declarations
Scriptlet tags for writing main logic 
Expression tags for printing
 -->