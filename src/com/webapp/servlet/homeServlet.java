package com.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webapp.beans.Login;
import com.webapp.utils.MyUtils;


@WebServlet(urlPatterns= {"/home"})
public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public homeServlet(){
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		HttpSession session = request.getSession();
		
		Login user = MyUtils.getLoginedUser(session);
		if(user == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return;
		}
		
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/home.jsp");
		dispatcher.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		doGet(request,response);
	}
}
