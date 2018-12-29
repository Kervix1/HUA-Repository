package gr.hua.dit.ds.ergasia21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
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
		System.out.println("in post of studentservlet");
		
		System.out.println("username = " + request.getParameter("user"));
		System.out.println("password = " + request.getParameter("pwd"));
		
		HttpSession session = request.getSession();
	String	stdusername = request.getParameter("user");
	
	//int	stdpassword = Integer.parseInt(request.getParameter("password"));
	String stdpassword = request.getParameter("pwd");
	
	session.setAttribute("stdusr",stdusername);
		session.setAttribute("stdpwr",stdpassword);
		
		
		
		request.getRequestDispatcher("student-data.jsp").forward(request, response);
		
	
	}
	

	
	
	

}
