package com.sirius.AdapterDesignPattern;
import static java.lang.Math.sqrt;


public class SquarePipe implements IPipe{
			
	   private double side;
	   
	    SquarePipe(double side){
	        this.side=side;
	    }
	    
	    public double getSide(){
	        return this.side;
	    }
	    public void  setSide(double side){
	        this.side=side;
	    }

        //calculate radius
	    public double getRadius(){
	        return sqrt((side*side)+(side*side))/2;
	    }
			

			
		
				
			
}
