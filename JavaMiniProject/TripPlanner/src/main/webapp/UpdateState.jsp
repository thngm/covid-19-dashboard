<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>State Updation</title>
	</head>
	<body>
		  <h3>Update State</h3>
		  <form action="UpdateState" method="post" >
		
		    <label for="state">Present State Name</label>
		    <input type="text"  name="state" id="state" />
		    
		    <label for="newName">To be changed as :</label>
		    <input type="text"  name="newName" id="newName" />
		    <input type="submit" value="Submit"/> 
		     
		  </form>
	</body>
</html>