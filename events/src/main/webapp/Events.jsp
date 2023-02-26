<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event Organization</title>
<%@include file="all_css.jsp" %>
<%@include file="Navbar.jsp"  %>
</head>
<body>
<h5 style="color: green;"> ${message}</h5>
	<h5 style="color: red;"> ${messag}
	<br>
	<c:forEach items="${errors}" var="e">
	 ${e.message}
	</c:forEach>
	</h5>
<form action="save" method="post">
<h3>this is event page</h3>
<pre>
 eventName;<input type="text" name="eventName">
 typeOfEvent;<input type="text" name="typeOfEvent">
 organizarName;<input type="text" name="organizarName">

<select name="place" class="form-select" aria-label="Default select example">
  <option selected>SELECT</option>
	<c:forEach items="${place}" var="places">
				<option value="${places}">${places}</option>
			</c:forEach> 

<input type="submit" class="btn btn-success" value="send">
</pre>
</form>
</body>
</html>