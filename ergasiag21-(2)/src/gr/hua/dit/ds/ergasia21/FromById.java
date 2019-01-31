package gr.hua.dit.ds.ergasia21;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/FromById")
public class FromById extends HttpServlet{
	
	int id = -1;
	private static final long serialVersionUID = 4L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		try{
			id = Integer.parseInt(request.getParameter("id"));;
			String site = new String("Applications/" + id);
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);
		} catch (Exception e){	

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/id-form.jsp");

			PrintWriter out = response.getWriter();

			out.println("<font color=red>Your id is wrong. Please inser a valid id.</font>");

			rd.include(request, response);
		}

	}

	
}
