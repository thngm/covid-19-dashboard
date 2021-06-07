package com.sirius.LibraryRestService.rest;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sirius.LibraryRestService.beans.Book;
import com.sirius.LibraryRestService.service.LibraryServiceImpl;
import com.sirius.LibraryRestService.service.LibraryServiceInterface;


@Path("library")
public class LibraryRestController {
	
	LibraryServiceInterface service = new LibraryServiceImpl();

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<Integer,Book> getAllBooks() {
		return service.getAllBooks().orElse(null);
		
	}
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam("id") int id){
		return service.getBookById(id).orElse(null);
	}
	
	@GET
	@Path("/author/{author}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam("author") String author){
		return service.getBookByAuthor(author).orElse(null);
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public HashMap<Integer,Book> addBook(Book book) {
		return service.addBook(book);
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Book updateBook(Book book) {
		return service.updateBook(book).get();
	}
	
	@DELETE
	@Path("/del")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean deleteBook(Book book) {
		return service.deleteBook(book);
		
	}
}
	