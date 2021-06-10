package com.sirius.StrategyDesignPattern;

public class HangoutsStrategy  implements IMediaStrategy{
	

		public HangoutsStrategy()
		{
			System.out.println("Hangout API");
			
		}
		
		public void text(String name)
		{
			System.out.println("texting " + name + " via Hangouts");
		}
		
}
