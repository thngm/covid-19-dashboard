<%@ page import="com.sirius.TripPlanner.beans.*" %>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title></title>
	</head>
	<body>
	        <!-- Displaying list of states  -->
		    <h1>STATES</h1>	 
			<table border="1">
			    <tr>
			        <th>State</th>
			    </tr>
			    <c:forEach items="${stateList}" var="state">
			     <tr>
			        <td>
			            <c:out value="${state}" />
			        </td>
			    </tr>
			    </c:forEach>
		    </table> 
		     <br>
		     <br>
			 
			 <!-- Displaying list of categories  -->
			 <h1>CATEGORIES</h1>	 
			 <table border="1">
			    <tr>
			        <th>Category</th>
			    </tr>
			    <c:forEach items="${categoryList}" var="category">
			     <tr>
			        <td>
			            <c:out value="${category}" />
			        </td>
			    </tr>
			    </c:forEach>
		    </table>
			
			<!-- Obtaining user input -->
			<h1>ENTER SPOT DETAILS</h1>
			<form action="WeatherUpdater" method="post" >
		
		    <label for="state">State</label>
		    <input type="text"  name="state" id="state" placeholder="state"/>
		
		 
		    <label for="category">Category</label>
		    <input type="text"  name="category" id="category" placeholder="category"/>
		
		    <input type="submit" value="Submit"/>  
		</form>
					
	</body>
</html>