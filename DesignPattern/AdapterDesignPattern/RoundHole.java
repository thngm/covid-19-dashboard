package com.sirius.AdapterDesignPattern;

public class RoundHole  {
	 private double radius;
	    RoundHole(double radius){
	        this.radius=radius;
	    }
	    
	    public double getRadius(){
	        return this.radius;
	    }
	    public void  setRadius(double radius){
	        this.radius=radius;
	    }
	    
	    //check if it fits
	    public boolean doesItFits(IPipe ip){
	        if(ip.getRadius()<this.getRadius()){
	            return true;
	        }
	        return false;
	    }
    
   
}
