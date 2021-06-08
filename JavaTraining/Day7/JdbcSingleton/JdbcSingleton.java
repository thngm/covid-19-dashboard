package com.practice.JdbcConn;

import java.sql.*;  
class JdbcSingleton{  
	public static void main(String args[]){  
			try
			{  
				//get connection
				Connection con = SingletonDP.getInstance();
				
				Statement statement = con.createStatement();
				
				PreparedStatement stmt = con.prepareStatement("insert into cakes values(?,?,?)");  
				//insert into "cakes"
				stmt.setInt(1,6);
				stmt.setString(2,"Pineapple cake"); 
				stmt.setDouble(3,40.0);
				  
				int i=stmt.executeUpdate();  
				System.out.println(i+" records inserted");  
				
				//display records
				ResultSet result = statement.executeQuery("select * from cakes");
		         while(result.next()) {   
		            System.out.println(result.getInt("id") + ", "
		                    + result.getString("name") + ", "
		                    + result.getDouble("price"));
		                    
		         }
				  
             }
			catch(Exception e)
			{
				System.out.println(e);
			}   
      }  
}  