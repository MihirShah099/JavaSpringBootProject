<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="save.html" modelAttribute="vo" Method="post">
Fname:<f:input path="fname"/>
lname:<f:input path="lname"/>
uname:<f:input path="uname"/>
password:<f:input path="pass"/>
<f:button type="submit"/>
</f:form>

</body>
</html>