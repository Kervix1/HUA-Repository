package gr.hua.dit.ds.ergasia21;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateStudentData")

public class UpdateStudentData extends HttpServlet {

	private static final long serialVersionUID = 5L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		String uni1 = request.getParameter("name1");

		String uni2 = request.getParameter("name2");

		String uni3 = request.getParameter("name3");

		String uni4 = request.getParameter("name4");

		String num1 = request.getParameter("number1");
		
		String num2 = request.getParameter("number2");
		
		String num3 = request.getParameter("number3");
		
		String num4 = request.getParameter("number4");

		System.out.print(uni1 + " " + uni2 + " " + uni3 + " " + uni4 + " " + num1+ " " + num2+ " " + num3+ " " + num4);

		// syndesh sthn bash
		request.getRequestDispatcher("End.jsp").forward(request, response);

		

	}

}