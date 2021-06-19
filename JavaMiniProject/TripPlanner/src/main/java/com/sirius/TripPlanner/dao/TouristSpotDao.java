package com.sirius.TripPlanner.dao;

import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import com.sirius.TripPlanner.beans.Spot;

public class TouristSpotDao {
	
	private static Logger log = Logger.getLogger(TouristSpotDao.class);
	
	
    //admin adds a new state
	public static int addState(String state){
		
		Layout layout = new SimpleLayout();
		Appender app = new ConsoleAppender(layout);
		log.addAppender(app);
		
		log.debug("THIS IS DEBUG");
		
		
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into states values(?)");
			ps.setString(1,state);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	
	//admin adds a new category
	public static int addCategory(String category){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into category values(?)");
			ps.setString(1,category);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//admin adds a new touristSpot
	public static int addTouristSpot(String state, String category, String touristSpot, Double latitude, Double longitude){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into spot values(?, ?, ?, ?, ?)");
			ps.setString(1,state);
			ps.setString(2,category);
			ps.setString(3,touristSpot);
			ps.setDouble(4,latitude);
			ps.setDouble(5,longitude);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//admin updates a state
	public static int updateState(String presentStateName, String newStateName){
		
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("update state set state = ? where state = ?");
			ps.setString(1,newStateName);
			ps.setString(2,presentStateName);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//admin updates a category
	public static int updateCategory(String presentCategoryName, String newCategoryName){
		
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("update category set category = ? where category = ?");
			ps.setString(1,newCategoryName);
			ps.setString(2,presentCategoryName);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//admin updates a touristSpot
	public static int updateSpot(String presentSpotName, String newSpotName){
		
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("update spot set touristSpot = ? where touristSpot = ?");
			ps.setString(1,newSpotName);
			ps.setString(2,presentSpotName);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//admin deletes a state
	public static int deleteState(String state){
		
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("delete from state where state = ?");
			ps.setString(1,state);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//admin deletes a category
	public static int deleteCategory(String category){
		
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("delete from category where category = ?");
			ps.setString(1,category);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//admin deletes a spot
	public static int deleteSpot(String spot){
		
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("delete from spot where touristSpot = ?");
			ps.setString(1,spot);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//to view states
	public static List<String> viewStates(){
		
		List<String> stateList=new ArrayList<String>();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from states");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				stateList.add(rs.getString("state"));
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return stateList;
	}
	
	//to view categories
	public static List<String> viewCategory(){
		
		List<String> categoryList=new ArrayList<String>();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from category");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				categoryList.add(rs.getString("category"));
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return categoryList;
	}
	
	//to view weather conditions
	public static List<Spot> viewWeatherConditions(String state, String category){
		
		List<Spot> spotList = new ArrayList<Spot>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from spot where state = ? and category = ?");
			ps.setString(1,state);
			ps.setString(2,category);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){

				System.out.print(rs.getRow());
				Spot  destination = new Spot();
				destination.setState(rs.getString("state"));
				destination.setCategory(rs.getString("category"));
				destination.setTouristSpot(rs.getString("touristSpot"));
		
				//fetching temperature 
				try{
					URIBuilder builder = new URIBuilder("https://api.weatherbit.io/v2.0/current");

					builder.setParameter("key", "d92143fd42f24469960923947703da2c")
					   .setParameter("lat", rs.getString("latitude"))
					   .setParameter("lon", rs.getString("longitude"));
					  
					HttpGet get = new HttpGet(builder.build());
					
					CloseableHttpClient httpclient = HttpClients.createDefault();
					
					CloseableHttpResponse response1 = httpclient.execute(get); 
					
					HttpEntity entity = response1.getEntity();
				    if (entity != null) {
				    	String rawResult=EntityUtils.toString(entity, Charset.forName("utf-8"));

				    	JSONObject jsonWeatherForecast = new JSONObject(rawResult);
				    	
				    	JSONArray data = (JSONArray)jsonWeatherForecast.getJSONArray("data");
				    	
				         for (int i = 0; i < data.length(); i++) {
				             Object temperature = data.getJSONObject(i).get("temp");
			
				             destination.setTemperature((Double)temperature);
				             
				         }
				       
				    }
				    spotList.add(destination);
				    System.out.print(spotList);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return spotList;
	}
	
}