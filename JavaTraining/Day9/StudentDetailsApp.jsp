<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Grade</title>
</head>
<body>
	<!-- obtaining details from user -->
	<form action = "Result" method = "POST">
	
		<label> Id </label>     
		<input type="text" name="id" /> <br> <br>  
		
		<label> Enter name </label>     
		<input type="text" name="name" /> <br> <br> 
		
		 <label> Enter your score in maths </label>     
		<input type="text" name="m0" /> <br> <br>  
		
		<label> Enter your score in english </label>         
		<input type="text" name="m1" /> <br> <br>  
		
		<label> Enter your score in tamil </label>         
		<input type="text" name="m2" /> <br> <br>  
		
		<label> Enter your score in science </label>         
		<input type="text" name="m3" /> <br> <br> 
		
		<label> Enter your score in social </label>         
		<input type="text" name="m4" /> <br> <br> 
		
		<input type="submit" value="Submit"/>  
		
	</form>

</body>
</html>