package com.sirius.StrategyDesignPattern;

public class FbStrategy implements IMediaStrategy{
	
	public FbStrategy()
	{
		System.out.println("Fb API");
		
	}
	
	public void text(String name)
	{
		System.out.println("texting " + name + " via Fb");
	}
	
}
