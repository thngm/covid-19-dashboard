<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Tourist Spot Updation</title>
	</head>
	<body>
		  <h3>Update TouristSpot</h3>
		  <form action="UpdateTouristSpot" method="post" >
		
		    <label for="spot">Present  Name</label>
		    <input type="text"  name="spot" id="spot" />
		    
		    <label for="newName">To be changed as :</label>
		    <input type="text"  name="newName" id="newName" />
		    <input type="submit" value="Submit"/> 
		     
		  </form>
	</body>
</html>