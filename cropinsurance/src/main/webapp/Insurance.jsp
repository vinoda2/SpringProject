<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insurance</title>
<%@include file="all_css.jsp"%>
<%@include file="navbar.jsp"%>
</head>
<body>
	<form action="save" method="post">
		<pre>
		cropName:<input type="text" name="cropName" placeholder="cropName">
		cropType;<input type="text" name="cropType" placeholder="cropType">
		insuranceType;<input type="text" name="insuranceType" placeholder="insuranceType">
		companyName;<input type="text" name="companyName" placeholder="companyName">
		<input type="submit" value="Save" class="btn-btn-success">
</pre>
	</form>
</body>
</html>