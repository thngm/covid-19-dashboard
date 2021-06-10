package com.sirius.LibraryRestService.service;


import java.util.List;
import java.util.Optional;
import com.sirius.LibraryRestService.beans.Book;

public interface LibraryServiceInterface {
	
	public Optional<Book> getBook(int id);
	public Optional<Book> addBook(Book book);
	public Optional<Book> updateBook(Book book);
	public boolean deleteBook(int id);
	public Optional<List<Book>> getAllBooks();
	public Optional<Book> getBookByAuthor(String author);
	 
}