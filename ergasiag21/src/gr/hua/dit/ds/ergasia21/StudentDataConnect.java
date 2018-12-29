package gr.hua.dit.ds.ergasia21;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentDataConnect")

public class StudentDataConnect extends HttpServlet {

	private static final long serialVersionUID = 4L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		// get request parameters for username and password

		String nm = request.getParameter("name");

		String snm = request.getParameter("sname");

		String smstr = request.getParameter("semester");

		String univrs = request.getParameter("University");

		String lan = request.getParameter("Language");
		

		System.out.print(nm + "" + snm + "" + smstr + "" + univrs + "" + lan );
		int semester = Integer.parseInt(smstr);

		if (!nm.matches(".*[^a-zA-Z].*") && !snm.matches(".*[^a-zA-Z].*")) {

			// if username and password match, create a new session

			// edw tha ta apothikeush sto database
			if (semester <= 6 && semester > 0) {

				if (!univrs.matches("un") && !univrs.matches("lan")) {

					response.sendRedirect("End.jsp");

				} else {
					RequestDispatcher rd = getServletContext().getRequestDispatcher("Universities/list");

					PrintWriter out = response.getWriter();

					out.println("<font color=red>Univerisity and Language should be selected</font>");

					rd.include(request, response);

				}
			} else {
				RequestDispatcher rd = getServletContext().getRequestDispatcher("Universities/list");

				PrintWriter out = response.getWriter();

				out.println("<font color=red>Semester should be a possitive number and 6 or above to be accepted</font>");

				rd.include(request, response);

			}

		} else {

			RequestDispatcher rd = getServletContext().getRequestDispatcher("Universities/list");

			PrintWriter out = response.getWriter();

			out.println("<font color=red>Either Name or Surname is wrong.</font>");

			rd.include(request, response);
			/*
			 * response.getWriter().
			 * println("<font color=red>Either user name or password is wrong.</font>");
			 * request.getRequestDispatcher("/student.jsp").forward(request, response);
			 */
			// an balw auto sta sxolia to println tha xathei giati den krata thn pliroforia
			// mazei tou

		}

	}

}