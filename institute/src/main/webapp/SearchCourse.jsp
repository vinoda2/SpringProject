<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<%@include file="all_css.jsp"%>
</head>
<body>
<%@include file="Navbar.jsp"%>
<h3 ><span style="color: red;">${message}</span></h3>
<form action="searchId" method="Post">
	Search By Id <input type="text" name="id"/>
	<input type="submit" value="search" class="btn btn-primary"/>
	
	<div>
	<h3 style="color: blue;">Search Results</h3>
	Name : ${dto.instituteName} <br>
	</div>
</form>
<form action="searchName" method="Post">
	Search By Name <input type="text" name="instituteName"/>
	<input type="submit" value="search" class="btn btn-primary"/>
	
	<div>
	<h3 style="color: Green;">Search Results</h3>
	Name : ${dto.instituteName} <br>
	email: ${dto.email}
	</div>
</form>
</body>
</html>