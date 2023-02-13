<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="uname" value="${param.name }" scope="session"></c:set>



 

<h3>Successfully Logged In.....! <c:out value="${uname }"></c:out></h3>


<br><br>

<a href="logout.jsp">Logout</a>

</body>
</html>