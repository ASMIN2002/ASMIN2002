<%@page import="in.sp.model.User"%>
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
		User user = (User)session.getAttribute("session_user");
		
	%>
	<h1>Welcome</h1>
	
	<h2> Name  : <%= user.getName() %> </h2>
	<h2> Email : <%= user.getEmail() %> </h2>
	<h2> City  : <%= user.getCity() %> </h2>
	
	<a href="logout"> Logout </a>
	
</body>
</html>