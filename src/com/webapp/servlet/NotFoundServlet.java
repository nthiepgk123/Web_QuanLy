package com.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/notfound"})
public class NotFoundServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotFoundServlet() {
		
	}
	
	 @Override
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
		 	RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/404.jsp");
			dispatcher.forward(request, response);
	      //response.sendRedirect(request.getContextPath() + "/notfound");
	   }
	 
	   @Override
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	       this.doGet(request, response);
	   }
	 
	
}
