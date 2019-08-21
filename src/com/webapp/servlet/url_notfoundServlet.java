package com.webapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webapp.beans.Login;
import com.webapp.utils.MyUtils;

@WebServlet(urlPatterns= {"/*"})
public class url_notfoundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public url_notfoundServlet() {
		
	}
	
	@Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Login user = MyUtils.getLoginedUser(session);
		if(user == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return;
		}
	 	//RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/404.jsp");
		//dispatcher.forward(request, response);
		
		//response.sendRedirect(request.getContextPath() + "/notfound");
   }
 
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       this.doGet(request, response);
   }
	
}
