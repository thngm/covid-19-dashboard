package com.sirius.TripPlanner.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sirius.TripPlanner.dao.TouristSpotDao;

/**
 * Servlet implementation class UpdateState
 */
@WebServlet("/UpdateState")
public class UpdateState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateState() {
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
		//update state
		String state = request.getParameter("state");
		String newName = request.getParameter("newName");
		
		
		int rowsAffected = TouristSpotDao.updateState(state, newName);

		if (rowsAffected>0){
            response.sendRedirect("Success.jsp");
        }
        else{

        	response.sendRedirect("Failure.jsp");
        }
	
	}
}


