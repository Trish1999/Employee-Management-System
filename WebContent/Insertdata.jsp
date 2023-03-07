<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String username=request.getParameter("username");
String password=request.getParameter("password");
int age=(Integer.parseInt(request.getParameter("age")));
int id=(Integer.parseInt(request.getParameter("id")));
String department=request.getParameter("department");
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "tri@28");
Statement st=conn.createStatement();
st.executeUpdate("insert into emp(username,password,age,id,department) values('"+username+"','"+password+"','"+age+"','"+id+"','"+department+"')");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
