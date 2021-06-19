<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.sirius.TripPlanner.beans.Spot" %>
<%@ page import="java.util.*"%>
<%@ page errorPage="ErrorPage.jsp" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather Conditions</title>
</head>
<body>
    <h1>Weather Conditions</h1>
	 
	 <!-- Displaying weather conditions  -->	 
			 <table border="1">
			 	<thead>
					<tr>
						<th>State</th>
						<th>Category</th>
						<th>Tourist Spot</th>
						<th>Temperature</th>
					</tr>
				</thead>
				<tbody>
			    
				    <c:forEach items="${spotList}" var="spot">
					     <tr>
					        <td><c:out value="${spot.state}" /></td>
					        <td><c:out value="${spot.category}" /></td>
					        <td><c:out value="${spot.touristSpot}" /></td>
					        <td><c:out value="${spot.temperature}" /></td>
	
					    </tr>
					 </c:forEach>
			    </tbody>
		    </table>	
</body>
</html>