package com.webapp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.beans.SuKien;
import com.webapp.utils.MyUtils;
import com.webapp.utils.SuKienUtils;

@WebServlet(urlPatterns= {"/addevent"})
public class addevent extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public addevent() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/addevent.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
		String maloai = (String)request.getParameter("maloai");
		String tensukien = (String)request.getParameter("tensukien");
		String slthamgia = (String)request.getParameter("slthamgia");
		String khachmoi = (String)request.getParameter("khachmoi");
		String ngaytochuc = (String)request.getParameter("ngaytochuc");
		String nguoitochuc = (String)request.getParameter("nguoitochuc");
		String diadiem = (String)request.getParameter("diadiem");
		SuKien newsukien = new SuKien();
		newsukien.setTENSUKIEN(tensukien);
		newsukien.setMALOAI(Integer.parseInt(maloai));
		newsukien.setSLTHAMGIA(Integer.parseInt(slthamgia));
		newsukien.setNGAYTOCHUC(ngaytochuc);
		newsukien.setKHACHMOI(khachmoi);
		newsukien.setNGUOITOCHUC(nguoitochuc);
		newsukien.setDIADIEM(diadiem);
		Connection conn = MyUtils.getStoredConnection(request);
		
		try {
			SuKienUtils.insertSuKien(conn, newsukien);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int maxmaloai = 0;
		try {
			
			 maxmaloai = SuKienUtils.getMax_masukien(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect(request.getContextPath() + "/addbill?masukien=" + maxmaloai + "&maloai=" + maloai);
	}

}
