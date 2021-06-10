package com.sirius.LibraryRestService.beans;

public class Book {
	private int bookId;
	private String bookName,bookAuthor;
	public Book(){
		
	}
	
	public Book(int bookId,String bookName,String bookAuthor){
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
	}

	public void setBookId(int bookId){
		this.bookId=bookId;
	}
	public int getBookId(){
		return this.bookId;
	} 
	
	public void setBookName(String bookName){
		this.bookName=bookName;
	}
	public String getBookName(){
		return this.bookName;
	} 
	
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor=bookAuthor;
	}
	public String getBookAuthor(){
		return this.bookAuthor;
	} 
	
}