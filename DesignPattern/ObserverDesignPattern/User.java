package com.sirius.ObserverDesignPattern;


public class User {
    public static void main(String args[]){
        
       Publisher v=new Publisher("Harish");
       
       Subscriber subscriber1 = new Subscriber("Dora");
       Subscriber subscriber2 = new Subscriber("Buji");
       
       v.addSubscriber(subscriber1);
       v.addSubscriber(subscriber2);
       
       v.post("Gud evening peeps..");
       
       v.removeSubscriber(subscriber1);
      
       v.post("Bye all...");
       
    }
}