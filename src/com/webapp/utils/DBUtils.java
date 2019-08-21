package com.webapp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.webapp.beans.Login;

public class DBUtils {
	public static Login findUser(Connection conn,String userName,String passWord) throws SQLException{
		String sql = "select USERNAME,PASSWORD,LOAITK from LOGIN where USERNAME = ? and PASSWORD = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userName);
		pstm.setString(2, passWord);
		ResultSet rs = pstm.executeQuery();
		
		if(rs.next()) {
			int LoaiTK = Integer.parseInt(rs.getString("LOAITK"));
			Login user = new Login();
			user.setUSERNAME(userName);
			user.setPASSWORD(passWord);
			user.setLOAITK(LoaiTK);
			return user;
		}
		return null;
	}
	
	public static Login findUser(Connection conn,String userName) throws SQLException{
		String sql = "select USERNAME,PASSWORD,LOAITK from LOGIN where USERNAME = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userName);
		ResultSet rs = pstm.executeQuery();
		
		if(rs.next()) {
			String passWord = rs.getString("PASSWORD");
			int LoaiTK = Integer.parseInt(rs.getString("LOAITK"));
			Login user = new Login();
			user.setUSERNAME(userName);
			user.setLOAITK(LoaiTK);
			user.setPASSWORD(passWord);
			return user;
		}
		return null;
	}
	
	public static List<Login> queryProduct(Connection conn )throws SQLException{
		String sql = "select USERNAME,PASSWORD,LOAITK FROM LOGIN";
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		ResultSet rs = pstm.executeQuery();
		
		List<Login> listUser = new ArrayList<Login>();
		while(rs.next()) {
			String user = rs.getString("USERNAME");
			String pass = rs.getString("PASSWORD");
			int Loaitk = Integer.parseInt(rs.getString("LOAITK"));
			Login newUser = new Login(user,pass,Loaitk);
			listUser.add(newUser);
		}
		
		return listUser;
	}
	
	public static void updateAccount(Connection conn , Login user) throws SQLException {
		String sql = "Update LOGIN set USERNAME = ? , PASSWORD = ? , LOAITK = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, user.getUSERNAME());
		pstm.setString(2, user.getPASSWORD());
		pstm.setInt(3, user.getLOAITK());
		pstm.executeUpdate();
	}
	
	public static void insertAccount(Connection conn,Login user) throws SQLException{
		String sql = "Insert into login(USERNAME,PASSWORD,LOAITK) values (?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, user.getUSERNAME());
		pstm.setString(2, user.getPASSWORD());
		pstm.setInt(3, user.getLOAITK());
		pstm.executeUpdate();
	}
	
	public static void deleteAccount(Connection conn, String username) throws SQLException {
		String sql = "delete from login where USERNAME = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, username);
		pstm.executeUpdate();
	}
	
}
