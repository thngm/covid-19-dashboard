<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Login Form</title>
	</head>
	<body>
	
	<h2>Not Yet Registered?</h2>
	<a href="Register.jsp" >Register</a>
	<br><br>
	<h3>Login</h3>
	  <form action="LoginController" method="post" >
	
	    <label for="email">User id</label>
	    <input type="email"  name="email" id="email" placeholder="userid"/>
	
	 
	    <label for="password">Password</label>
	    <input type="password"  name="password" id="password" placeholder="Password"/>
	
	    <input type="submit" value="Submit"/>  
	    
	</form>
	
	</body>
</html>