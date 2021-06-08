package com.sirius.LibraryRestService.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
	private static Connection conn;
	static String url="jdbc:mysql://localhost:3306/library";
	static String username="root";
	static String password="password";
	
	private DatabaseConnection()
	{
		
	}
	
	public static Connection startConnection() throws SQLException, ClassNotFoundException 
	{
		if(conn==null)
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,username,password);
		}
		return conn;
		
	}
}