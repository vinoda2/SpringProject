<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<%@include file="all_css.jsp"%>
</head>
<body>
	<%@include file="Navbar.jsp"%>

	<form action="register" method="Post">
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Institute
				Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail3"
					name="instituteName">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Contact Number</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail3"
					name="contactNumber">
			</div>
		</div>

		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" id="inputEmail3" name="email">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword3" name="password">
			</div>
		</div>
		
		<input type="submit"  class="btn btn-success" value="submit">
	
	</form>

</body>
</html>