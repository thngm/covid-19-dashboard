package com.sirius.LibraryRestService.rest;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.sirius.LibraryRestService.dao.*;
import com.sirius.LibraryRestService.beans.Book;
@Path("library")
public class LibraryRestController {
	
	LibraryDao lib=new LibraryDao();
	
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAllBooks() {
		return lib.getAllBooks().orElse(null);
		
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam("id") int id) {
		
		
		return lib.getBook(id).orElse(null);
		
	}
	
	@GET
	@Path("/{author}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam("author") String author){
		return lib.getBookByAuthor(author).orElse(null);
	}
	
	
	
	@DELETE
	@Path("/del")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean deleteBook(Book book) {
		return lib.deleteBook(book);
		
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Book updateBook(Book book)
	{
		return lib.updateBook(book).get();
	}
	

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Book addBook(Book book) {
		return lib.addBook(book).orElse(null);
	}
	

	
}