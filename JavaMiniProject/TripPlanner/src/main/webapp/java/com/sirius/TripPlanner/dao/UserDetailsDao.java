package com.sirius.TripPlanner.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import com.javatpoint.beans.LibrarianBean;

public class UserDetailsDao {
	
	//saving user details into db
	public static int saveDetails(String userId, String password){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into user values(?,md5(?)");
			ps.setString(1,userId);
			ps.setString(2,password);)
			status=ps.executeUpdate();
		
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
			
    //user verification
	public static boolean authenticate(String email,String password){
		boolean status=false;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement(" SELECT * FROM user WHERE username= ? and password= md5(?)");
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				status=true;
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	

}
