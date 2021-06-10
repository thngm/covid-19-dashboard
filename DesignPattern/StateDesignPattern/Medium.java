package com.sirius.StateDesignPattern;


public class Medium implements IFanState {
	
	public void displayState()
	{
		System.out.println("MEDIUM");
	}
	
	public IFanState nextState()
	{
		return new High();
	}
	
	public IFanState prevState()
	{
		return new Low();
	}
	

}
