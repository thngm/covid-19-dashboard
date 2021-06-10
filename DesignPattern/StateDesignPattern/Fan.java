package com.sirius.StateDesignPattern;

public class Fan  {
	private IFanState presentState;
	
	public Fan()
	{
		presentState = new Off();
	}

	public IFanState getPresentState() {
		return presentState;
	}

	public void setPresentState(IFanState presentState) {
		this.presentState = presentState;
	}
	
	public void pullRedColoured()
	{
		setPresentState(presentState.prevState());
		presentState.displayState();
	}
	
	public void pullGreenColoured()
	{
		setPresentState(presentState.nextState());
		presentState.displayState();
	}

	
	
	

}
