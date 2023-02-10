<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Use Bean Demo</h1>


<!-- id is the object of class -->
<jsp:useBean id="obj" class="com.simplilearn.demo.Student" scope="session"></jsp:useBean>

 

<h3>Value before Set</h3>

<!-- LET'S CALL GETTER -->
ROLL NO:<jsp:getProperty property="rollNo" name="obj"/>
NAME:<jsp:getProperty property="name" name="obj"/>


<!-- LET'S CALL SETTER -->

<jsp:setProperty property="rollNo" name="obj" value="32"/>
<jsp:setProperty property="name" name="obj" value="Nikunj Soni"/>


<h3>Value After Set</h3>

<!-- LET'S CALL GETTER -->
ROLL NO:<jsp:getProperty property="rollNo" name="obj"/>
NAME:<jsp:getProperty property="name" name="obj"/>


<!-- Let's  check this values on another page -->

<a href="next.jsp">Next page</a>


</body>
</html>