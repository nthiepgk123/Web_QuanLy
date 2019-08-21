package com.webapp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.beans.SuKien;
import com.webapp.utils.MyUtils;
import com.webapp.utils.SuKienUtils;

@WebServlet(urlPatterns = {"/mass","/glosbe","/otherevent"})
public class MassServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MassServlet() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		Connection conn = MyUtils.getStoredConnection(request);
		String Event = null;
		
		String loai = request.getParameter("loai");
		String ErrorString = null;
		List<SuKien> listsukien = null;
		try {
			listsukien = SuKienUtils.findSuKien(conn, loai);
		}catch(SQLException e) {
			e.printStackTrace();
			ErrorString = e.getMessage();
		}
		if(loai.equals("1")) {
			Event = "Thánh Lễ";
		}
		else if(loai.equals("2")) {
			Event = "Tĩnh Tâm";
		}
		else {
			Event = "Các sự kiện tổ chức khác";
		}
		request.setAttribute("erroString", ErrorString);
		request.setAttribute("DsSuKien", listsukien);
		request.setAttribute("event", Event);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/mass.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		doPost(request,response);
	}
	
}
