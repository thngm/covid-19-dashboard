package com.sirius.AdapterDesignPattern2;


import java.time.LocalDate;
import java.time.Period;

public class FacebookForm implements IRegister{
	private String fullName;
	private LocalDate dob;
	private String email;

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public FacebookForm(String fullName, String dob, String email) {
		
		this.fullName = fullName;
		this.dob = LocalDate.parse(dob);
		this.email = email;
	}
	
	//display details
	public void display() {
		
		System.out.println("Fb");
		System.out.println("Name :" + fullName);
		System.out.println("Age :" + Period.between(dob, LocalDate.now()).getYears());
		System.out.println("Email :" + email);
	}
}
