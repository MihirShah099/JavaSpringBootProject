<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib prefix="c" uri = "http://java.sun.com/jstl/core_rt" %>
<body>
<form action="dataEdit.html" modelAttribute="list" method="post">
	<c:forEach var ="i" items = "${sessionScope.list}">
	<table border="1">
	<tr><td>First_Name:</td><td><input type ="text" name="firstName" value="${i.firstName}"></td></tr>
	<tr><td>Last_name:</td><td><input type ="text" name="lastName" value="${i.lastName}">
	<input type ="hidden" name="id" value="${i.id}"></td></tr>
	<tr><td><input type = "submit" name="Edit"></td></tr>
	</table>
	</c:forEach>
	</form>

</body>
</html>