<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% if(session.getAttribute("uname")==null)
{
	response.sendRedirect("shankar.html");
}
%>

	Hi!! Welcome ${ username}
	
	
	<a href="videos.jsp">Click here to book a ticket</a>
	<form action="Logout">
	<input type="submit" value="logout"></form>
</body>
</html>

