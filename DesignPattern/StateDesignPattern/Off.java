package com.sirius.StateDesignPattern;

public class Off implements IFanState {
	
	public void displayState()
	{
		System.out.println("OFF");
	}
	
	public IFanState nextState()
	{
		return new Low();
	}
	
	public IFanState prevState()
	{
		return new High();
	}
	

}
