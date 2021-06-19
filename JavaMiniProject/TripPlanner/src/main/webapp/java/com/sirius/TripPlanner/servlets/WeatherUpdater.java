package com.sirius.TripPlanner.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sirius.TripPlanner.beans.Spot;
import com.sirius.TripPlanner.beans.TouristSpot;
import com.sirius.TripPlanner.dao.TouristSpotDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;







/**
 * Servlet implementation class WeatherUpdater
 */
@WebServlet("/WeatherUpdater")
public class WeatherUpdater extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeatherUpdater() {
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
		
		request.getRequestDispatcher("Logout.jsp").include(request, response);
		String state = request.getParameter("state");
		String category = request.getParameter("category");
		List<Spot> spotList = TouristSpotDao.viewWeatherConditions(state, category);
		System.out.print(spotList.isEmpty());
		if(spotList.isEmpty()) {
			out.println("user friendly");
			request.getRequestDispatcher("DisplayMsg.jsp").include(request, response);
		}
		else {
			
			System.out.println("spotList");
			out.println(spotlist);
			request.setAttribute("spotList", spotList);
			request.getRequestDispatcher("WeatherConditions.jsp").include(request, response);
		}

}
}
