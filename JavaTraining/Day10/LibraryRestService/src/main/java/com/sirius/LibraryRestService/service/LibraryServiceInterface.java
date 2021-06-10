package com.sirius.LibraryRestService.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.sirius.LibraryRestService.beans.Book;

public interface LibraryServiceInterface {
	
	
	public Optional<HashMap<Integer,Book>> getAllBooks();
	public Optional<Book> getBookByAuthor(String author);
	public Optional<Book> getBookById(int id);
	public HashMap<Integer, Book> addBook(Book book);
	public Optional<Book> updateBook(Book book);
	public boolean deleteBook(Book book);
	
}
