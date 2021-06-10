package com.sirius.ObserverDesignPattern;

public interface ISubscriber {
	
	public void addSubscriber(Subscriber observer);
	public void removeSubscriber(Subscriber observer);
	public void post(String post);
	

}
