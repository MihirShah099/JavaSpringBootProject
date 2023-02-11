<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
<f:form action="dataInsrt.html" method="post" modelAttribute="datamodel">
First_name: <f:input path="firstName"/><br/>
Last_name: <f:input path="lastName"/><br/>
<input type="submit" value="Submit">
</f:form>
<a href="dataSerch.html">Search</a>
</body>
</html>