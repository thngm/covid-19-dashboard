package com.sirius.StateDesignPattern;



public class Low implements IFanState {
	
	public void displayState()
	{
		System.out.println("LOW");
	}
	
	public IFanState nextState()
	{
		return new Medium();
	}
	
	public IFanState prevState()
	{
		return new Off();
	}
	

}
