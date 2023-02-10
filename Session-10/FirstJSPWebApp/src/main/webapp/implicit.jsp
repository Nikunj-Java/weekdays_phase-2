<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Implicit Object Demo</h1>


<% 

String respCheck=request.getParameter("office");

			if(respCheck!=null){
				
				response.setStatus(response.SC_MOVED_TEMPORARILY);
				response.setHeader("Location", "resp-redirect.jsp?office="+respCheck);

			}

%>


<%
	String error=request.getParameter("error");

	if(error!=null){
		throw new RuntimeException("Exception Occured");
	}


%>

  <a href="implicit.jsp?office=head_office">Check Use of Response and Request object</a>

<br>


<a href="implicit.jsp?error=1">Check Use of Exception object</a>

<br>

<%

	String serverName=request.getServerName();
	out.print("Server Name: "+serverName+"<br>");
	
	out.print("Servelet Name: "+config.getServletName()+"<br>");
	
	out.print("Server Info: "+application.getServerInfo()+"<br>");
	
	
	out.print("Page Details: "+page.toString()+"<br>");
	
	
	pageContext.setAttribute("userid", "nikunj@gmail.com");
	
	out.print("PageContextAttribute: "+pageContext.getAttribute("userid"));


%>



</body>
</html>