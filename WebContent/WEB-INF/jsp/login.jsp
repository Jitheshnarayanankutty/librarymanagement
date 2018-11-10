<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Manager</title>
</head>
<body>
	<h1>Welcome to Library Manager</h1>
	<form:form action="/librarymanagement/login" method="post" commandName="userData">
		Username<form:input path="userName" />
		Password<form:password path="password"/>
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>