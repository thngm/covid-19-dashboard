<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Register</title>
	</head>
	<body>
		<h3>Register</h3>
		  <form action="RegisterController" method="post" >
		
		    <label for="email">User id</label>
		    <input type="email"  name="email" id="email" placeholder="userid"/>
		
		 
		    <label for="password">Password</label>
		    <input type="password"  name="password" id="password" placeholder="Password"/>
		
		    <input type="submit" value="Submit"/>  
		    
		</form>
	
	</body>
</html>