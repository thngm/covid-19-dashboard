package com.sirius.TripPlanner.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sirius.TripPlanner.dao.TouristSpotDao;

/**
 * Servlet implementation class AddTourismSpot
 */
@WebServlet("/AddTourismSpot")
public class AddTouristSpot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTouristSpot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	
		//add touristSpot
		
		String state = request.getParameter("state");
		String category = request.getParameter("category");
		String spot = request.getParameter("spot");
		Double latitude = Double.parseDouble(request.getParameter("latitude"));
		Double longitude = Double.parseDouble(request.getParameter("longitude"));
		
		//adds tourist spot
		int rowsAffected = TouristSpotDao.addTouristSpot(state, category, spot, latitude, longitude);

		if (rowsAffected>0){
            response.sendRedirect("Success.jsp");
        }
        else{

        	response.sendRedirect("Failure.jsp");
        }
	
	}
	

}
