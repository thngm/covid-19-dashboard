package com.sirius.CommandDesignPattern;

public class BuyCake implements IOrder {
	
	private Cake item;
	private int quantity;
	
	public BuyCake(Cake item , int quantity) {
		this.item = item;
		this.setQuantity(quantity);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void transaction() {
		item.buy(this.getQuantity());
	}
	

}
