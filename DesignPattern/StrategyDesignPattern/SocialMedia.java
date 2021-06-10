package com.sirius.StrategyDesignPattern;

public class SocialMedia {
	
	IMediaStrategy mediaStrategy;
	public void setMediaStrategy(IMediaStrategy mediaStrategy)
	{
		this.mediaStrategy = mediaStrategy;
		
	}
	
	public void connect(String name)
	{
		mediaStrategy.text(name);
		
	}

}
