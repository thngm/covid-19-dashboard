package com.sirius.AdapterDesignPattern;

public class Demo {
	
	public static void main(String args[]){
		
        IPipe round=new RoundPipe(10);
        IPipe sq=new SquarePipe(5);
        RoundHole hole=new RoundHole(15);
        
        //check if round pipe fits
        if(hole.doesItFits(round)){
            System.out.println("round pipe fits ");
        } 
        else{
             System.out.println("round pipe does not fit");
        }
        
        //check if square pipe fits
        if(hole.doesItFits(sq)){
            System.out.println("square pipe fits ");
        } 
        else{
             System.out.println("square pipe does not fit");
        }
    }
}
