package com.practice.JdbcConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//singleton design pattern
public class SingletonDP
{
	private static Connection conn;

	private SingletonDP() {}

	// Only one thread can execute at a time
	public static synchronized Connection getInstance() throws SQLException
	{
		//connection is established if not established
		if (conn==null)
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root", "password");   
			
		}
		return conn;
	}
}
