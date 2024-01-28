package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet 
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
   {
	
	
	  //for RequestDispatcher
	  /* int sum=(int) req.getAttribute("sum");
	   int square = sum*sum;
	   PrintWriter out=res.getWriter();
	   out.println("Result is: "+square); */
	
	
	   
	   //for sendRedirect and url rewriting
	  /* int sum=Integer.parseInt(req.getParameter("sum"));
	   int square=sum*sum;
	   PrintWriter out=res.getWriter();
	   out.println("Result is: "+square); */
	
	
	
	   //for session data and sendRedirect
	  /* HttpSession session = req.getSession();
	   int sum = (int)session.getAttribute("sum");
	   int square=sum*sum;
	   PrintWriter out=res.getWriter();
	   out.println("Result is: "+square);
	   
	   
	   
	   //data remains throughout in the session unless we delete it. The way to delete it is:
	   session.removeAttribute("sum");//data removed from session */
	
	
	  //for cookies
	  // we cannot get a single cookie but all cookies available all at once
	  Cookie cookies[] = req.getCookies();
	  int sum=0;
	  for(Cookie c : cookies)
	  {
		  if(c.getName().equals("sum"))
		  {
			  sum = Integer.parseInt(c.getValue());
		  }
	  }
	  
	  int square=sum*sum;
	   PrintWriter out=res.getWriter();
	   out.println("Result is: "+square);
	    
   }
}

/*The dispatch data received as an attribute is accessed from the req method over here using get.*/