package com.sirius.LibraryRestService.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sirius.LibraryRestService.beans.Book;
import com.sirius.LibraryRestService.service.LibraryServiceImpl;


public class LibraryServiceImpl implements LibraryServiceInterface {
	
	private static HashMap<Integer,Book> books = new HashMap<Integer,Book>();
	
	public LibraryServiceImpl(){
		
		books.put(1,new Book(1,"Life is what you make it","preethi"));
		books.put(2,new Book(2,"Three and a half murder mystery","salil desai"));
	}
	
	//display all books
	public Optional<HashMap<Integer,Book>> getAllBooks(){
		return Optional.of(books);
	}
	
	//get books by id
	public Optional<Book> getBookById(int id){
		return books.values().stream().filter(b->b.getBookId()==id).findAny();
	}
	
	//get books by author's name
	public Optional<Book> getBookByAuthor(String author){
		return books.values().stream().filter(b->b.getBookAuthor().equalsIgnoreCase(author)).findAny();
	}
	
	//add a book
	public HashMap<Integer,Book> addBook(Book book){
		books.put(book.getBookId(),book);
		return books;
	}
	
	//update a book
	public Optional<Book> updateBook(Book book) {
		 books.values().stream().filter(b->b.getBookId()==book.getBookId()).map(b->{
			b=book;
			System.out.println("update");
			return b;
		});
		 return Optional.of(book);
	}
	
	//delete a book
	public 	boolean deleteBook(Book book) {
		if(!books.containsKey(book.getBookId()))
		{
			return false;
		}
		books.remove(book.getBookId());
		return true;
	}
	
	
}

