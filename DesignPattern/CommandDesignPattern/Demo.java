package com.sirius.CommandDesignPattern;

public class Demo {
	public static void main(String args[])
	{
		Cake choco = new Cake("choco");
		Cake vanilla = new Cake("vanilla");
		
		BuyCake buyChoco = new BuyCake(choco , 10);
		SellCake sellChoco = new SellCake(choco,5);
		
		BuyCake buyVanilla = new BuyCake(vanilla , 10);
		SellCake sellVanilla = new SellCake(vanilla,5);
		
		Cart cart = new Cart();
		
		cart.takeOrder(buyChoco);
		cart.takeOrder(buyChoco);
		cart.takeOrder(sellChoco);
		cart.takeOrder(buyVanilla);
		cart.takeOrder(buyVanilla);
		cart.placeOrder();
		
		
	}
	

}

