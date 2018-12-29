package gr.hua.dit.ds.ergasia21;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import gr.hua.dit.ds.ergasia21.Student;
/**
 * Servlet implementation class StudentListServlet
 */
@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> students= new ArrayList<Student>();
		Student s1 = new Student ("giannhs",34);
		Student s2 = new Student ("kostas",34);
		Student s3 = new Student ("thanos",34);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		HttpSession session = request.getSession(); //otan yparxoun panw apo ena request auto dialegei analoga to id (student h secretary)
		session.setAttribute("stds", students);
		
		request.getRequestDispatcher("students.jsp").forward(request, response); //prospena to allo servlet kai ksekina auto 
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
