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


@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {


        private static final long serialVersionUID = 2L;

       private final String userID = "student";

      private final String password = "password";
        // bash gia mathith 8elei password kai username
        private final String S_userID = "secretary";//secretary 
        private final String S_password = "password";


        protected void doPost(HttpServletRequest request, HttpServletResponse response)

                        throws ServletException, IOException {


                // get request parameters for username and password

                String user = request.getParameter("user");

                String pwd = request.getParameter("pwd");


                if (S_userID.equals(user) && S_password.equals(pwd)) {

                        // if username and password match, create a new session

                        HttpSession session = request.getSession();

                        session.setAttribute("user", "Secretary");

                        // setting session to expiry in 30 mins

                        session.setMaxInactiveInterval(30*60);

                        Cookie userName = new Cookie("user", user);

                        userName.setMaxAge(30*60);

                        response.addCookie(userName);

                        response.sendRedirect("Secretary-data.jsp");

                }
                
              else if (userID.equals(user) && password.equals(pwd)) {
               	
                	  // if username and password match, create a new session
               
                    HttpSession session = request.getSession();

                    session.setAttribute("user", user);

                    // setting session to expiry in 30 mins

                    session.setMaxInactiveInterval(30*60);

                    Cookie userName = new Cookie("user", user);

                    userName.setMaxAge(30*60);

                    response.addCookie(userName);

                    response.sendRedirect("Universities/list");
                }
                
              
                else {

                       RequestDispatcher rd = getServletContext().getRequestDispatcher("/student.jsp");

                        PrintWriter out = response.getWriter();

                        out.println("<font color=red>Either username or password is wrong.</font>");

                        rd.include(request, response);
                	/*response.getWriter().println("<font color=red>Either user name or password is wrong.</font>");
                	request.getRequestDispatcher("/student.jsp").forward(request, response);*/
                        //an balw auto sta sxolia to println tha xathei giati den krata thn pliroforia mazei tou 

                }


        }


}