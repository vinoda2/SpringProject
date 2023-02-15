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
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" placeholder="First name"
					aria-label="First name">
			</div>
			<div class="col">
				<input type="text" class="form-control" placeholder="Last name"
					aria-label="Last name">
			</div>
			<div class="col">
				<input type="text" class="form-control" placeholder="Last name"
					aria-label="Last name">
			</div>
		</div>
		<input type="submit" value="Save" class="btn-btn-success">

	</form>
</body>
</html>