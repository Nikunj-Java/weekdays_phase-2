<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>XML Tag Examples</h1>


<c:set var="books">

		<books>
				<book>	
					<name>The Complete Reference</name>
					<author>Mac Grow Hill</author>
				</book>
				
				<book>	
					<name>The Origin of Species</name>
					<author>Charls Darwin</author>
				</book>
		
		</books>



</c:set>

<x:parse xml="${books }" var="data"></x:parse>

1st Book Name:<b><x:out select="$data/books/book[1]/name"/></b><br>
1st Book Author Name:<x:out select="$data/books/book[1]/author"/><br>


2nd Book Name:<b> <x:out select="$data/books/book[2]/name"/></b><br>
2nd Book Author Name:<x:out select="$data/books/book[2]/author"/><br>



</body>
</html>