package com.sirius.CommandDesignPattern;

public class SellCake implements IOrder{

		private Cake item;
		private int quantity;
		
		public SellCake(Cake item , int quantity) {
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
			item.sell(this.getQuantity());
		}


}
