package com.webapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils{
	public static Connection getMySQLConnection() throws ClassNotFoundException,SQLException {
		String hostname = "localhost";
		String dbname = "quanlygiadinhsinhvien";
		String userName = "root";
		String passWord = "root";
		return getMySQLConnection(hostname,dbname,userName,passWord);
		
	}
	
	public static Connection getMySQLConnection(String hostname,String dbname,String username , String password) throws SQLException,ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String connectionUrl = "jdbc:mysql://" + hostname + ":3306/" + dbname;
		Connection conn = DriverManager.getConnection(connectionUrl,username,password);
		return conn;
	}
}
