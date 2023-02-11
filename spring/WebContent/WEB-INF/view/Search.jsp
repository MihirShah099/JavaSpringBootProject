<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<body>
<table border="1">
<tr><td>ID</td>
<td>First_name</td>
<td>Last_name</td>
<td>Action</td>
</tr>	
<c:forEach var ="i" items = "${sessionScope.list}">
<tr><td>${i.id}</td>
<td>${i.firstName}</td>
<td>${i.lastName}</td>
<td><a href = "dataDel.html?id=${i.id}">Delete</a></td>
<td><a href = "dataUpdate.html?id=${i.id}">Update</a></td></tr>
</c:forEach>
</table>

</body>
</html>