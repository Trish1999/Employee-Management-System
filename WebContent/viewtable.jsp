<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/test";
String database = "test";
String userid = "root";
String password = "tri@28";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<body>
<center>
<h1> employee table</h1>
<table border="1">
<tr>
<td>username</td>
<td>password</td>
<td>age</td>
<td>id</td>
<td>department</td>
<td>Action</td>
</tr>
</center>
<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tri@28");
statement=connection.createStatement();
String sql ="select * from emp";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("Username") %></td>
<td><%=resultSet.getString("password") %></td>
<td><%=resultSet.getInt("age") %></td>
<td><%=resultSet.getInt("id") %></td>
<td><%=resultSet.getString("department") %></td>
<td><a href="delete.jsp?id=<%=resultSet.getString("id") %>"><button type="button" class="delete">Delete</button></a></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>