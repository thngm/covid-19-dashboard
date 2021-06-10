package com.sirius.CommandDesignPattern;

public class Cake {
	
	private String name;
	private int total = 0;


	public Cake(String name) {
		
		this.name = name;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void buy(int quantity)
	{
		System.out.println("details of item bought");
		System.out.println("name :"+name);
		System.out.println("Quantity :" +quantity );
		this.setTotal(this.getTotal() +quantity);
		System.out.println(this.getTotal() + "<-- Total no of items bought " );
		
	}
	
	public void sell(int quantity)
	{
		System.out.println("details of item sold");
		System.out.println("name :"+name);
		System.out.println("Quantity :" +quantity );
		this.setTotal(this.getTotal()-quantity);
		System.out.println(this.getTotal() + "<--- Total no of items sold " );
		
	}
	
	


}
