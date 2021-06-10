package com.sirius.AdapterDesignPattern2;


public class Demo {
	
	public static void main(String[] args) {
		
		IRegister facebook = new FacebookForm("dora", "2000-09-01", "fb@gmail.com");
		IRegister google = new GoogleForm("jackie","chan", 50, "g@gmail.com");
		IRegister linkedInn = new LinkedInnForm("shinchan", 10, "l@gmail.com");
		
		printInfo(facebook);
		printInfo(google);
		printInfo(linkedInn);
		
	}
	
	//to display info
	public static void printInfo(IRegister app) {
		app.display();
	}
	


}