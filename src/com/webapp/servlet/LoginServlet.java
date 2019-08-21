package com.webapp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webapp.beans.Login;
import com.webapp.utils.DBUtils;
import com.webapp.utils.MyUtils;

@WebServlet(urlPatterns = { "/login"})
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		HttpSession session = request.getSession();
		Login user = MyUtils.getLoginedUser(session);
		if(user != null) {
			response.sendRedirect(request.getContextPath() + "/home");
			return;
		}
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/login.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	      String userName = request.getParameter("username");
	      String passWord = request.getParameter("password");
	      
	      Login user = null;
	      boolean hasError = false;
	      String errorString = null;
	      
	      if(userName == null || passWord == null || userName.length() == 0 || passWord.length() == 0) {
	    	  hasError = true;
	    	  errorString = "(*) Vui lòng điền đẩy đủ thông tin tài khoản và mật khẩu";
	    	  
	      }
	      else {
	    	  Connection conn = MyUtils.getStoredConnection(request);
	    	  try {
	    		  user = DBUtils.findUser(conn, userName, passWord);
	    		  if(user == null) {
	    			  hasError = true;
	    			  errorString = "(*) Tài khoản hoặc mật khẩu không chính xác !";
	    		  }
	    	  }catch(SQLException e) {
	    		  e.printStackTrace();
	    		  hasError = true;
	    		  errorString = e.getMessage();
	    	  }
	      }
	      
	      if(hasError) {
	    	  user = new Login();
	    	  user.setUSERNAME(userName);
	    	  user.setPASSWORD(passWord);
	    	  request.setAttribute("errorString", errorString);
	    	  request.setAttribute("user", user);
	    	  
	    	  RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/login.jsp");
	    	  dispatcher.forward(request, response);
	      }
	      
	      else {
	    	  HttpSession session = request.getSession();
	    	  MyUtils.storeLoginedUser(session, user);
	    	  
	    	  response.sendRedirect(request.getContextPath() + "/home");
	      }
	      
	   }
}
