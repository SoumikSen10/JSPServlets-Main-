package com.telusko;
import java.io.IOException;
//import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
   {
	   int a = Integer.parseInt(req.getParameter("num1"));
	   int b = Integer.parseInt(req.getParameter("num2"));
	   int sum = a+b ;
	   PrintWriter pw = res.getWriter();
	   pw.println("The sum of "+a+" and "+b+" is: "+sum);
   }*/
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	   {
		   int a = Integer.parseInt(req.getParameter("num1"));
		   int b = Integer.parseInt(req.getParameter("num2"));
		   int sum = a+b ;
		   //sum=sum*sum;
		   //PrintWriter pw = res.getWriter();
		   //pw.println("The sum of "+a+" and "+b+" is: "+sum);}
	  //  this method gets called through service method in the //background
		   
		   //Ways of sending/passing data
		   
		   //way 1
		   //using RequestDispatcher
		   //req.setAttribute("sum", sum);
		   
		  /* RequestDispatcher rd = req.getRequestDispatcher("sq");
		   rd.forward(req, res); */
		   
		   
		   
		   //way 2
		   //using sendRedirect and url rewriting
		   //res.sendRedirect("sq?sum="+sum); //URL Rewriting
		   
		   
		   
		   //way 3
		   //using sessions and sendRedirect
		  /* HttpSession session = req.getSession();
		   session.setAttribute("sum", sum);
		   res.sendRedirect("sq");*/
		   //we can access session data from any servlet
		   //donot need to pass it
		   
		   
		   
		   //way 4
		   //using cookies and sendRedirect
		   
		   Cookie cookie = new Cookie("sum",sum+""); //appended "" to convert sum to string since cookies only take string type data
		   res.addCookie(cookie);
		   res.sendRedirect("sq");
		   
        }
}

/*Since we are already dispatching the req and res objects to another servlet hence we are sending the data that we want to send to the other servlet along with the req object as an attribute while dispatching.*/


/*
HttpServletRequest and HttpServletResponse are both interfaces.Their implementations are done by tomcat server and the req and res objects are also given by the tomcat server.
*/



/*
 * in sendredirect() we use two different req objects. We want to let the user know that they are being redirected to another servlet. But in case of RequestDispatcher you are not aware of that.
 * */
