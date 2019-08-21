package com.webapp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.webapp.beans.SinhVien;

public class SinhVienUtils {
	public static List<SinhVien> dsSinhVien(Connection conn) throws Exception{
		String sql = "select * from sinhvien";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		
		List<SinhVien> ds = new ArrayList<SinhVien>();
		while(rs.next()) {
			SinhVien sv = new SinhVien();
			sv.setID(rs.getString("ID"));
			sv.setHOTEN(rs.getString("HOTEN"));
			sv.setGIOITINH(rs.getString("GIOITINH"));
			sv.setDIACHI(rs.getString("DIACHI"));
			sv.setTENTRUONGHOC(rs.getString("TENTRUONGHOC"));
			sv.setNGAYSINH(rs.getString("NGAYSINH"));
			sv.setKHOA_MAKHOA(rs.getString("KHOA_MAKHOA"));
			sv.setSDT(rs.getString("SDT"));
			sv.setAVATAR(rs.getString("AVATAR"));
			
			ds.add(sv);
				
			
		}
		return ds;
	}
	
	public static void delete_sinhvien(Connection conn,String masv) throws Exception{
		
			String sql = "delete from sinhvien where ID = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, masv);
			pstm.executeUpdate();

	}
	
	
	public static void addSinhVien(Connection conn,SinhVien sv) throws Exception{
		String sql = "insert into SINHVIEN(ID,HOTEN,GIOITINH,DIACHI,TENTRUONGHOC,NGAYSINH,KHOA_MAKHOA,SDT,AVATAR)"+
					"values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, sv.getID());
		pstm.setString(2, sv.getHOTEN());
		pstm.setString(3, sv.getGIOITINH());
		pstm.setString(4, sv.getDIACHI());
		pstm.setString(5, sv.getTENTRUONGHOC());
		pstm.setString(6, sv.getNGAYSINH());
		pstm.setString(7, sv.getKHOA_MAKHOA());
		pstm.setString(8,sv.getSDT());
		pstm.setString(9,sv.getAVATAR());
		pstm.executeUpdate();
	}
	
	public static SinhVien Tim_SinhVien(Connection conn,String masv) throws Exception{
		String sql = "select * from sinhvien where ID = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1,masv);
		ResultSet rs = pstm.executeQuery();
		
		
		if(rs.next()) {
			SinhVien sv = new SinhVien();
			sv.setID(rs.getString("ID"));
			sv.setHOTEN(rs.getString("HOTEN"));
			sv.setGIOITINH(rs.getString("GIOITINH"));
			sv.setDIACHI(rs.getString("DIACHI"));
			sv.setTENTRUONGHOC(rs.getString("TENTRUONGHOC"));
			sv.setNGAYSINH(rs.getString("NGAYSINH"));
			sv.setKHOA_MAKHOA(rs.getString("KHOA_MAKHOA"));
			sv.setSDT(rs.getString("SDT"));
			sv.setAVATAR(rs.getString("AVATAR"));
			
			return sv;
			
				
			
		}
		return null;
	}
}
