package com.webapp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.webapp.beans.SuKien;

public class SuKienUtils {
	
	public static void insertSuKien(Connection conn , SuKien newsukien)throws SQLException {
		String sql = "insert into sukien(TENSUKIEN,MALOAI,SLTHAMGIA,KHACMOI,NGUOITOCHUC,NGAYTOCHUC,DIADIEM)" + 
					"VALUES (?,?,?,?,?,?,?)";
		 PreparedStatement pstm = conn.prepareStatement(sql);
		 
	        pstm.setString(1, newsukien.getTENSUKIEN());
	        pstm.setInt(2,newsukien.getMALOAI());
	        pstm.setInt(3, newsukien.getSLTHAMGIA());
	        pstm.setString(4,newsukien.getKHACHMOI());
	        pstm.setString(5, newsukien.getNGUOITOCHUC());
	        pstm.setString(6, newsukien.getNGAYTOCHUC());
	        pstm.setString(7,newsukien.getDIADIEM());
	        pstm.executeUpdate();
	}
	
	public static List<SuKien> findSuKien(Connection conn,String maloai) throws SQLException{
		String sql = "SELECT *,DATE_FORMAT(NGAYTOCHUC,'%d/%m/%Y') AS format_ntc  FROM sukien where MALOAI = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, maloai);
		ResultSet rs = pstm.executeQuery();
		
		
		List<SuKien> dsSuKien = new ArrayList<SuKien>();
		while(rs.next()) {
			SuKien sukien = new SuKien();
			sukien.setMASUKIEN(rs.getInt("MASUKIEN"));
			sukien.setTENSUKIEN(rs.getString("TENSUKIEN"));
			sukien.setMALOAI(rs.getInt("MALOAI"));
			sukien.setNGAYTOCHUC(rs.getString("format_ntc"));
			sukien.setNGUOITOCHUC(rs.getString("NGUOITOCHUC"));
			sukien.setSLTHAMGIA(rs.getInt("SLTHAMGIA"));
			sukien.setKHACHMOI(rs.getString("KHACMOI"));
			sukien.setDIADIEM(rs.getString("DIADIEM"));
			dsSuKien.add(sukien);
		}
		return dsSuKien;
	}
	
	public static int getMax_masukien(Connection conn) throws SQLException{
		String sql = "select MAX(MASUKIEN) as maxma from sukien";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			int kq =  rs.getInt("maxma");
			return kq;
		}
		return 0;
	}
	
	public static SuKien findSuKien_ChiTiet(Connection conn,String masukien) throws SQLException{
		String sql = "SELECT *,DATE_FORMAT(NGAYTOCHUC,'%d/%m/%Y') AS format_ntc FROM sukien where MASUKIEN = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, masukien);
		ResultSet rs = pstm.executeQuery();
		
		
		
		if(rs.next()) {
			SuKien sukien = new SuKien();
			sukien.setMASUKIEN(rs.getInt("MASUKIEN"));
			sukien.setTENSUKIEN(rs.getString("TENSUKIEN"));
			sukien.setMALOAI(rs.getInt("MALOAI"));
			sukien.setNGAYTOCHUC(rs.getString("format_ntc"));
			sukien.setNGUOITOCHUC(rs.getString("NGUOITOCHUC"));
			sukien.setSLTHAMGIA(rs.getInt("SLTHAMGIA"));
			sukien.setKHACHMOI(rs.getString("KHACMOI"));
			sukien.setDIADIEM(rs.getString("DIADIEM"));
			return sukien;
		}
		return null;
	}
}
