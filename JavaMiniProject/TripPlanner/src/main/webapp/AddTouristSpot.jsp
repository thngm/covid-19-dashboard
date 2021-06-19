<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		
		<h3>TourismSpot Inclusion</h3>
		  <form action="AddTourismSpot" method="post" >
		  
			<label for="state">State Name</label>
		    <input type="text"  name="state" id="state" placeholder="state"/>
		    <br><br>
		    
		    <label for="category">Category Name</label>
	        <input type="text"  name="category" id="category" placeholder="category"/>
	         <br><br>
			
		    <label for="spot">TourismSpot </label>
		    <input type="text"  name="spot" id="spot" placeholder="spot"/>
		     <br><br>
		    
		    <label for="latitude">latitude </label>
		    <input type="text"  name="latitude" id="latitude" placeholder="latitude"/>
		     <br><br>
		    
		    <label for="longitude">longitude </label>
		    <input type="text"  name="longitude" id="longitude" placeholder="longitude"/>
		     <br><br>
		     
		    <input type="submit" value="Submit"/>  
		</form>
			
	</body>
</html>