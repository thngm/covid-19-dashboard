package com.sirius.ObserverDesignPattern;

import java.util.ArrayList;

public interface IObserver {
	
	
	public void notify(ArrayList<Subscriber> list);

}
