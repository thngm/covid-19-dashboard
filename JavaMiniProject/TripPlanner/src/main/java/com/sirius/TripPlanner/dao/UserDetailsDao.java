
package com.sirius.TripPlanner.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class UserDetailsDao {
	
	//saving user details into db
	public static int saveDetails(String userId, String password){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into user values(?,md5(?))");
			ps.setString(1,userId);
			ps.setString(2,password);
			status=ps.executeUpdate();
		
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
			
    //user verification
	public static int authenticate(String email,String password){
		int status=0;
		try{
			Connection con=DB.getCon();
		    PreparedStatement ps=con.prepareStatement(" SELECT * FROM user WHERE username= ? and password= md5(?)");
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			
			if(email.equals("admin@gmail.com") && rs.next()){
				status=1;
			}
			else if(rs.next()){
				status=2;
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
}