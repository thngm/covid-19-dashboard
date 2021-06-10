package com.sirius.ObserverDesignPattern;


import java.util.ArrayList;

public class Subscriber implements IObserver {
    
    private String name;
    
    public Subscriber(){
        
    }
    
    public Subscriber(String name){
        this.name=name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void notify(ArrayList <Subscriber> list){
        list.stream().forEach(x->System.out.println("Notify "+x.getName()));
    }
    
}
