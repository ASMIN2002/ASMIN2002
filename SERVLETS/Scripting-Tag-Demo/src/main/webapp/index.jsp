<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int a = 10;
	String name = "ASMIN";

	int square() {
		return a * a;
	}%>
	
	
	<%
	out.println("a      : " + a);
	out.println("NAME   : " + name);
	out.println(square());
	
	int b = 20;
	
	if(b<100){
		out.println("b is smaller then 100");
	}else{
		out.println("b is greater then 100");
	}
	
	for(int i=1;i<5;i++){
		out.println(i);
	}
	%>
	
	<%= a %>
	<%= name %>
	<%= square() %>
	
	<%= LocalDate.now() %>
	
	<%= Math.random() %>
</body>
</html>