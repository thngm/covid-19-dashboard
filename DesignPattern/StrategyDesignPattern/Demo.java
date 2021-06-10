package com.sirius.StrategyDesignPattern;

public class Demo {
	
	public static void main(String args[])
	{
		SocialMedia media = new SocialMedia();
		media.setMediaStrategy(new FbStrategy () );
		media.connect("dora");
		
		
		media.setMediaStrategy(new HangoutsStrategy () );
		media.connect("buji");
			
		
	}

}
