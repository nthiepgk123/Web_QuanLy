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
import com.webapp.utils.ChiTieuUtils;
import com.webapp.utils.MyUtils;

@WebServlet(urlPatterns= {"/addbill"})
public class addbill extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  String masukien;
	private String maloai;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		masukien = (String)request.getParameter("masukien");
		maloai = request.getParameter("maloai");
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/addbill.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		
		ChiTieu ct = new ChiTieu();
		//String test = request.getParameter("sotienchi");
		//test = test.replace(",", "");
		ct.setSOTIENCHI(Long.parseLong(request.getParameter("sotienchi").replace(",", "")));
		ct.setTIENDU(Long.parseLong(request.getParameter("tiendu").replace(",", "")));
		ct.setTIENCHO(Long.parseLong(request.getParameter("tiencho").replace(",", "")));
		ct.setTIENCAMHOA(Long.parseLong(request.getParameter("tiencamhoa").replace(",", "")));
		ct.setTIENTROCHOI(Long.parseLong(request.getParameter("tientrochoi").replace(",", "")));
		ct.setMONAN(request.getParameter("monan"));
		ct.setCHITIEUKHAC(request.getParameter("chitieukhac"));
		ct.setSUKIEN_MASK(Integer.parseInt(masukien));
		
		Connection conn = MyUtils.getStoredConnection(request);
		
		try {
			ChiTieuUtils.InsertChiTieu(conn, masukien, ct);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String maloai1 = null;
		if(maloai.equals("1")) {
			maloai1 = "/mass?loai=1";
		}
		else if(maloai.equals("2")) {
			maloai1 = "/glosbe?loai=2";
		}
		else {
			maloai1 = "/otherevent?loai=3";
		}
		response.sendRedirect(request.getContextPath() + maloai1);
	}
	

}
