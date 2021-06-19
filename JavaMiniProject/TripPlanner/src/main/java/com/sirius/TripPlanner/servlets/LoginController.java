package com.sirius.TripPlanner.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sirius.TripPlanner.dao.TouristSpotDao;
import com.sirius.TripPlanner.dao.UserDetailsDao;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
				
        //verifies user 
		if(UserDetailsDao.authenticate(email, password) == 1){
			
			HttpSession session=request.getSession();
			session.setAttribute("email",email);
			
			//redirecting to admin page
		
			request.getRequestDispatcher("AdminPortal.jsp").include(request, response);
			
		}
		
		else if(UserDetailsDao.authenticate(email, password) == 2){
			
			HttpSession session=request.getSession();
			session.setAttribute("email",email);
			
			//states and categories are fetched
			List<String> stateList=TouristSpotDao.viewStates();
			List<String> categoryList=TouristSpotDao.viewCategory();
			request.setAttribute("stateList", stateList);
			request.setAttribute("categoryList", categoryList);
			
			request.getRequestDispatcher("TouristSpot.jsp").include(request, response);
			
		  }
		  else{
			
			out.println("<h3>Username or password error</h3>");
		  }
		
		out.close();
	}
}


