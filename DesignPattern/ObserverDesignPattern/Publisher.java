package com.sirius.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;
 
public class Publisher implements ISubscriber {
	
	private String name; 
    private ArrayList<Subscriber> observers = new ArrayList<>();
    
    public Publisher(String name){
        this.name=name;
    }
 
    
    public void addSubscriber(Subscriber o) {
        observers.add(o);
    }
 
    
    public void removeSubscriber(Subscriber o) {
        observers.remove(o);
    }
 
   
    public void post(String post) {
    	
    	 System.out.println("Post from "+this.name+" : "+post);
        
    	 IObserver obs = new Subscriber();
         obs.notify(observers);
    }
}





