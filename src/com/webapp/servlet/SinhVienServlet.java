package com.webapp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.beans.SinhVien;
import com.webapp.utils.MyUtils;
import com.webapp.utils.SinhVienUtils;

@WebServlet(urlPatterns= {"/sinhvien"})
public class SinhVienServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SinhVienServlet() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		
		Connection conn = MyUtils.getStoredConnection(request);
		
		List<SinhVien> dssinhvien = null;
		
		try {
			dssinhvien = SinhVienUtils.dsSinhVien(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("active_url", "sinhvien");
		request.setAttribute("url_pattern", "sinhvien");
		request.setAttribute("dssinhvien", dssinhvien);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/sinhvien.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		doGet(request,response);
	}

}
