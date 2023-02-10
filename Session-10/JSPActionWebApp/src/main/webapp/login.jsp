<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String name=request.getParameter("name");
String pass=request.getParameter("pass");

out.print("Welcome!"+name);

if(pass.equals("admin@123")){
	%>
	<jsp:forward page="success.jsp">
		<jsp:param value="<%=name %>" name="uname"/>
	</jsp:forward>
<% }else{ %>
	<h2>Wrong UserName And Password</h2>
	<jsp:include page="index.html"></jsp:include>
	
	<% }%>

</body>
</html>