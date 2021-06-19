<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Category Updation</title>
	</head>
	<body>
s
		  <h3>Update Category</h3>
		  <form action="UpdateCategory" method="post" >
		
		    <label for="category">Present Category Name</label>
		    <input type="text"  name="category" id="category" />
		    
		    <label for="newName">To be changed as :</label>
		    <input type="text"  name="newName" id="newName" />
		    <input type="submit" value="Submit"/> 
		     
		  </form>
	</body>
</html>