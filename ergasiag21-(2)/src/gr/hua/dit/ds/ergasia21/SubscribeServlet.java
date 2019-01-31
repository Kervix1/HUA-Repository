package gr.hua.dit.ds.ergasia21;

import java.io.IOException;

import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;


@WebServlet("/SubscribeServlet")

public class SubscribeServlet extends HttpServlet {


        private static final long serialVersionUID = 3L;
        		
        private final boolean form = false;


        protected void doPost(HttpServletRequest request, HttpServletResponse response)

                        throws ServletException, IOException {


                // get request parameters for username and password

                String name = request.getParameter("name");

                String surname = request.getParameter("sname");
                
                String age = request.getParameter("age");
                
                String user = request.getParameter("user");
                
                String pword = request.getParameter("pwd");

               // ! name.matches(".*[^a-z].*") && surname.matches("[a-zA-Z]") && user.matches("[a-zA-Z_0-9]") && age.matches("[0-9]") && pword.matches("[a-zA-Z_0-9]")

                if ( ! name.matches(".*[^a-zA-Z].*")&& !surname.matches(".*[^a-zA-Z].*")&& !user.matches(".*[^a-zA-Z_0-9].*")&& !age.matches(".*[^0-9].*") && pword.length() >5) {

                        // if username and password match, create a new session

                     

                        response.sendRedirect("student.jsp");

                } else {

                       RequestDispatcher rd = getServletContext().getRequestDispatcher("/Subscribe.jsp");

                        PrintWriter out = response.getWriter();

                        out.println("<font color=red>Either username or password is wrong.</font>");

                        rd.include(request, response);
                	/*response.getWriter().println("<font color=red>Either user name or password is wrong.</font>");
                	request.getRequestDispatcher("/student.jsp").forward(request, response);*/
                        //an balw auto sta sxolia to println tha xathei giati den krata thn pliroforia mazei tou 

                }


        }


}