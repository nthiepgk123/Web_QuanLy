package com.webapp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.webapp.beans.ChiTieu;
import com.webapp.beans.SuKien;

public class ChiTieuUtils {
	
	public static void InsertChiTieu(Connection conn , String masukien , ChiTieu ct) throws SQLException{
		String sql = "insert into chitieu(SOTIENCHI,TIENDU,TIENCHO,MONAN,TIENCAMHOA,TIENTROCHOI,CHITIEUKHAC,SUKIEN_MASK)"+
					"VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setLong(1, ct.getSOTIENCHI());
		pstm.setLong(2, ct.getTIENDU());
		pstm.setLong(3, ct.getTIENCHO());
		pstm.setString(4, ct.getMONAN());
		pstm.setLong(5, ct.getTIENCAMHOA());
		pstm.setLong(6, ct.getTIENTROCHOI());
		pstm.setString(7, ct.getCHITIEUKHAC());
		pstm.setInt(8, Integer.parseInt(masukien));
		
		pstm.executeUpdate();
	}
	
	public static ChiTieu findSuKien_ChiTieu(Connection conn,String masukien) throws SQLException{
		String sql = "SELECT ct.*\r\n" + 
				"FROM sukien sk join chitieu ct\r\n" + 
				"on sk.MASUKIEN = ct.SUKIEN_MASK\r\n" + 
				"where ct.SUKIEN_MASK = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, masukien);
		ResultSet rs = pstm.executeQuery();
		
		
		
		if(rs.next()) {
			
			ChiTieu chitieu = new ChiTieu();
			chitieu.setSOTIENCHI(rs.getLong("SOTIENCHI"));
			chitieu.setTIENDU(rs.getLong("TIENDU"));
			chitieu.setTIENCHO(rs.getLong("TIENCHO"));
			chitieu.setTIENCAMHOA(rs.getLong("TIENCAMHOA"));
			chitieu.setTIENTROCHOI(rs.getLong("TIENTROCHOI"));
			chitieu.setMONAN(rs.getString("MONAN"));
			chitieu.setCHITIEUKHAC(rs.getString("CHITIEUKHAC"));
			
			return chitieu;
			
		}
		return null;
	}
}
