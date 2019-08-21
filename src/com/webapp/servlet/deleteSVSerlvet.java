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

@WebServlet(urlPatterns= {"/xoasinhvien"})
public class deleteSVSerlvet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public deleteSVSerlvet() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		
		Connection conn = MyUtils.getStoredConnection(request);
		
		String masv = request.getParameter("masinhvien");
		try {
			SinhVienUtils.delete_sinhvien(conn, masv);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		response.sendRedirect(request.getContextPath() + "/sinhvien");
	}
	
	@Override
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		doGet(request,response);
	}

}
