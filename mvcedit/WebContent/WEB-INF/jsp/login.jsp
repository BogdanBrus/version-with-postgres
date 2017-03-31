<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
</head>
<body>
<form action="login" method="post">
<input type="hidden" name="_spring_security_remember_me" value="true" />
<p>
<label for="username">Username:</label>
<input type="text" id="username" name="username"/>
</p>
<p>
<label for="password">Password:</label>
<input type="password" id="password" name="password" />
</p>
<p>
<input type="submit" value="Login">
</p>
</form>
 <p style="color:red">
 <c:if test="${param.error == 'invalidLoginPassword'}">
 INVALID login or password. Please check and try again.
 </c:if>
 </p>
 <p style="color:blue">
 <c:if test="${param.error == 'loginRequired'}">
 You are currently logged off. Please log in.
 </c:if>
 </p>


</body>
</html>