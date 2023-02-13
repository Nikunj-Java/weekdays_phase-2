<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Function Tag Example</h1>


<br>


<c:set var="name" value="Simpli"></c:set>
<c:set var="name1" value="learn"></c:set>

Lowercase: ${fn:toLowerCase(name) }<br>
Uppercase: ${fn:toUpperCase(name1) }<br>


<!-- Comparison -->

<!-- name,name will give you output as both are same -->
<c:if test="${fn:contains(name,name1) }">

	String Contains the defined Value<br>

</c:if>


<c:set var="str" value="Hello World Message"></c:set>

<c:set var="str1" value="${fn:split(str,' ') }"></c:set>

${fn:join(str1,' - ') }<br>


Substring: ${fn:substring(name,0,7) }<br>


<h3>Iteration</h3>

<c:forEach items="${str1 }" var="x">

	<c:out value="${fn:toUpperCase(x) }"></c:out>
</c:forEach>



</body>
</html>