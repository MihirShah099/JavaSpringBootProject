<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="h" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<tr>
			<td>id</td>
			<td>sname</td>
			<td>cname</td>
			<td>action</td>
		</tr>

		<h:forEach items="${lis}" var="i">
		<tr>
			<td>${i.id}</td>
			<td>${i.sname}</td>
			<td>${i.cid.cname}</td>
			<td>
				<a href="edit.html?id=${i.id}">edit</a>
				<a href="delete.html?id=${i.id}">delete</a>
			</td>
		</tr> 
</h:forEach>
</table>

</body>
</html>