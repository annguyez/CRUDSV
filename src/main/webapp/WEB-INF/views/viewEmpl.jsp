<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Student</title>
</head>
<body>
	<c:forEach items="${list}" var="item">
		<p>${item.id}</p>
		<p>${item.name}</p>
	</c:forEach>
</body>
</html>