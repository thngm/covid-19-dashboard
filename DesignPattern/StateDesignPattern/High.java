package com.sirius.StateDesignPattern;


public class High implements IFanState {
	
	public void displayState()
	{
		System.out.println("HIGH");
	}
	
	public IFanState nextState()
	{
		return new Off();
	}
	
	public IFanState prevState()
	{
		return new Medium();
	}
	

}
