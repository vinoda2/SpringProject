<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event Organization</title>
<%@include file="all_css.jsp"%>
<%@include file="Navbar.jsp"%>
</head>
<body>
	<h4 style="color: red">${error}</h4>
	<form action="Search">
		<input type="search" name="id"> 
		<input type="submit"
			value="search">
	</form>
	<h5 style="color: green;">
		event name:${dto.eventName}<br>
	</h5>

</body>
</html>