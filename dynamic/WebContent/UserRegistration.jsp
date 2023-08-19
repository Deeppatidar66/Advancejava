<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>


</style>
<center>
<body>
<%
   String msg = (String) request.getAttribute("msg");

%>

	<form action="UserCtl" method="post">
		<table>
		<tr>
			<% if(msg != null) { %>
			<%=msg%>
			<% } %>
		</tr>
		<h1> <font color="blue">STUDENT REGISTRETION FORM&#128526</font></h1>
		<br> <br> <br>
			<tr>
				<th style=color:red;>firstName</th>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<th>lastNmae</th>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<th>loginId</th>
				<td><input type="text" name="loginId"></td>
			</tr>
			<tr>
				<th>password</th>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<th>dob</th>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<th>address</th>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
			<th> </th>
			<td><input type ="submit" name="operation" value="signUp">
			<input type ="submit" name="operation" value="Reset">
			</td>
			</tr>

		</table>
	</form>

</body>
</center>
</html>