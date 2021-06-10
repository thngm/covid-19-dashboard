package com.sirius.AdapterDesignPattern;

public class RoundPipe implements IPipe{
			
	    private double radius;
	    RoundPipe(double radius){
	        this.radius=radius;
	    }
	 
	   
	    public double getRadius(){
	        return this.radius;
	    }
	    public void  setRadius(double radius){
	        this.radius=radius;
	    }   

			
			
				
			
}
