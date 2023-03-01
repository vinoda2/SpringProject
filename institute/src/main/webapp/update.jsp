<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<%@include file="all_css.jsp"%>
</head>
<body>
	<%@include file="Navbar.jsp"%>

	<form action="update" method="Post">
		<h5>
			<c:forEach items="${errors}" var="e">
				<span style="color: red;">${e.message }</span>
			</c:forEach>
		</h5>
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Institute
				Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail3"
					name="instituteName" value="${dto.instituteName}" readonly>
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Contact
				Number</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail3"
					name="contactNumber" value="${dto.contactNumber}">
			</div>
		</div>

		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" id="inputEmail3"
					name="email" value="${dto.email}">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword3"
					name="password">
			</div>
		</div>

		location <select name="location">
			<option value="">Select</option>
			<c:forEach items="${location}" var="l">
				<option value="${l}">${l}</option>
			</c:forEach>
		</select> <input type="submit" class="btn btn-success" value="submit">

	</form>

</body>
</html>