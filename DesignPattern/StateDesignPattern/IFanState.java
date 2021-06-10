package com.sirius.StateDesignPattern;

public interface IFanState {
	public void displayState();
	public IFanState nextState();
	public IFanState prevState();

}
