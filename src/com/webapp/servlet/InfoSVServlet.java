package com.webapp.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.beans.SinhVien;
import com.webapp.utils.MyUtils;
import com.webapp.utils.SinhVienUtils;

@WebServlet(urlPatterns= {"/thongtinsinhvien"})
public class InfoSVServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InfoSVServlet() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		Connection conn = MyUtils.getStoredConnection(request);
		String masv = request.getParameter("masinhvien");
		SinhVien sv = null ;
		try {
			sv = SinhVienUtils.Tim_SinhVien(conn, masv);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("sv", sv);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/thongtinsinhvien.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		doGet(request,response);
	}
	
}
