<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<%@include file="all_css.jsp" %>
<form action="send" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">start</label>
  <input type="text" name="start" class="form-control" id="exampleFormControlInput1" placeholder="start">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">End</label>
  <input type="text" name="end" class="form-control" id="exampleFormControlInput1" placeholder="end">
</div>

<input type="submit" class="btn btn-success" value="submit" >
</form>
</body>
</html>