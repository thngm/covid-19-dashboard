package ServletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class StudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
		
		double sum =0;
		boolean flag = true;
		double[] markList = new double[5];
		
		// find sum
		for(int i=0;i<5;i++)
		{
			markList[i] = Double.parseDouble(request.getParameter("m"+i));
			if(markList[i] < 50)
			{
				flag = false;
			}
			sum += markList[i];
		}
		
	
		request.setAttribute("Id" , Integer.parseInt(request.getParameter("id")));
		request.setAttribute("Name" , request.getParameter("name"));
		request.setAttribute("Total" , sum);
		request.setAttribute("Average" , sum/5);
		request.setAttribute("Result" , ((flag) ? "pass" : "fail"));
		
		//dispatching request
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("DisplayApp.jsp");
		requestDispatcher.forward(request, response);
		
		
		
	}

}
