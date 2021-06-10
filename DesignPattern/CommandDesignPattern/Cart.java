package com.sirius.CommandDesignPattern;

import java.util.ArrayList;

public class Cart {
	
	private ArrayList<IOrder> list = new ArrayList<IOrder>();
	
	public void takeOrder(IOrder order)
	{
		list.add(order);
		
	}
	
	public void placeOrder() {
		for(IOrder order : list)
		{
			order.transaction();
		}
	  list.clear();
	}
	

}
