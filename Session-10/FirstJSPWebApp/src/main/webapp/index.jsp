<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- jsp code -->

<!-- Scriplet -->
<% out.print("Hello World"); %>

<% 		int a=10;
		int b =20;
		int c=a-b;
		out.print("Result is: "+c);
%>

<br>
<!-- Expression -->
<% String name="Nikunj Soni" ;%>
<%="My Name is :"+name %>
<br>

<!-- Declaration -->
<%! int cube(int n){

	return n*n*n;
}
%>

<br>
<%= "Cube of 5 is: "+cube(5) %>

<br>
 <%= new Date() %>




</body>
</html>