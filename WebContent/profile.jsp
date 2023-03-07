<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Update Profile</title>
</head>
<body>
<center>
	Welcome ${emp.name }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<br/><br/><br/>
	${message }
	<form action="Edit" method="post">
	<input type="hidden" name="username" value="${emp.username }">
Password : <input type="password" name="password" value="${emp.password }"><br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br/>
	username is : <input type="text" name="name" value="${emp.name }"><br/>
	<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Age : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="age" value="${emp.age }"><br/>
	<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;id :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="number" name="id" value="${emp.id }"><br/>
	<br/>
    Department : &nbsp;&nbsp;<input type="text" name="department" value="${emp.department }"><br/>
	<br/>
	<br/>
	<input type="submit" value="Update">
	</form>
	<br/>
	<a href="Logout">Logout</a>
	<center/>
</body>
</html>
