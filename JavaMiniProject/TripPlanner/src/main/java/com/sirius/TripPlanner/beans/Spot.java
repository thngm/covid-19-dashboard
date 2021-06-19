package com.sirius.TripPlanner.beans;

public class Spot {
	
	private String state;
	private String category;
	private String touristSpot;
	private String latitude;
	private String longitude;
	private Double temperature;
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTouristSpot() {
		return touristSpot;
	}
	public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	

}
