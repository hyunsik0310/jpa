<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	JPA 연동 
</h1>

<form action = "logincheck">
	ID : <br>
	<input type = "text" name = "id"><br>
	PASSWORD:<br>
	<input type = "password" name = "password"><br><br>
	<input type = "submit" value = "LOGIN">
</form>

<a href = "movereguser">Don't you have Account?</a><br>
<a href = "movefindpassword">Forgot your password?</a>

</body>
</html>
