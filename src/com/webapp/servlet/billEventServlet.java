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

import com.webapp.beans.ChiTieu;
import com.webapp.beans.SuKien;
import com.webapp.utils.ChiTieuUtils;
import com.webapp.utils.MyUtils;
import com.webapp.utils.SuKienUtils;

@WebServlet(urlPatterns= {"/chitiethoadon"})
public class billEventServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	public billEventServlet() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		String masukien = (String)request.getParameter("masukien");
		Connection conn = MyUtils.getStoredConnection(request);
		
		String error = null;
		ChiTieu chitieu = new ChiTieu();
		SuKien sukien = new SuKien();
		
		try {
			chitieu = ChiTieuUtils.findSuKien_ChiTieu(conn, masukien);
			sukien = SuKienUtils.findSuKien_ChiTiet(conn, masukien);
		}catch(SQLException e) {
			error = e.getMessage();
		}
		request.setAttribute("chitieu", chitieu);
		request.setAttribute("sukien", sukien);
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/thongtinchitieu.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		doGet(request,response);
	}
}
