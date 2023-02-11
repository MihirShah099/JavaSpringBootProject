<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib prefix="h" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:form action="statein.html" modelAttribute="vo" Method="post">
country<f:select path="cid.id">
<f:option value="list">select country</f:option>
<h:forEach items="${list}" var="i" >
<f:option value="${i.id}">${i.cname}</f:option>
</h:forEach>
</f:select>
state name:<f:input path="sname"/>
<br>
<input type="submit"/>
</f:form>

</body>
</html>