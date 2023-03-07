
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<center>
<font color="red">${error }</font>
<form action="LogIn" method="post">
	User Name <input type="text" name="username"/><br/>
	<br/><br/>
	Password <input type="password" name="password"><br/><br/>
	<input type="submit" value="Login"> 
</form>
</center>
</body>
</html>

