package com.sirius.LibraryRestService.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.sirius.LibraryRestService.beans.Book;
public class LibraryDao {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;
	
	public LibraryDao()
	{
		try
		{
			conn=DatabaseConnection.startConnection();
			stmt=conn.createStatement();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	//get all books
	public Optional<List<Book>> getAllBooks()
	{
		try {
            rs = stmt.executeQuery("SELECT * FROM books");
            List<Book> bookList = new ArrayList<>();
	        while (rs.next()) {
	            Book book = new Book();
	            book.setId(rs.getInt("id"));
	            book.setTitle(rs.getString("name"));
	            book.setAuthor(rs.getString("author"));
	            bookList.add(book);
	        }
	        
            return Optional.of(bookList);
        } 
		catch (SQLException e)
        {
            e.printStackTrace();
        }
		return Optional.empty();
		
	}
		
	//get book by id
	public Optional<Book> getBook(int bookId) {
        try {
            rs = stmt.executeQuery("SELECT * FROM books WHERE id = " + bookId);
            if (rs.next()) {
                return Optional.of(extractBookFromResultSet(rs));
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Optional.empty();
    }
	
	
	//get book by author
	 public Optional<Book> getBookByAuthor(String author) {
	        try {
	            rs = stmt.executeQuery("SELECT * FROM books WHERE author = " + author);
	            return Optional.of(extractBookFromResultSet(rs));
	        } 
	        catch (SQLException e)
            {
                e.printStackTrace();
            }
	        return Optional.empty();
	    }
	 
	 //delete book
	 public boolean deleteBook(Book book) {
	        
	        try {
	           int rows = stmt.executeUpdate("DELETE FROM books WHERE id = " + book.getId());
	           if (rows == 0)
	               return false;
	           else
	        	   return true;
	        } 
	        catch (SQLException e)
            {
                e.printStackTrace();
            }
	        return false;
	    }
	 
	 
	
	 //update book
	 public Optional<Book> updateBook( Book book) {
	        
	        try {
	            pstmt = conn.prepareStatement("UPDATE books SET id = ?, name = ?, author = ? WHERE id = " +  book.getId());
	            pstmt.setInt(1, book.getId());
	            pstmt.setString(2, book.getTitle());
	            pstmt.setString(3, book.getAuthor());
	            pstmt.executeUpdate();
	            return Optional.of(book);
	        } 
	        catch (SQLException e)
            {
                e.printStackTrace();
            }
	        return Optional.empty();
	    }
	 

	 //add book
	 public Optional<Book> addBook(Book newBook) {
	       
	        try {
	            pstmt = conn.prepareStatement("INSERT INTO books VALUES(?,?,?)");
	            pstmt.setInt(1, newBook.getId());
	            pstmt.setString(2, newBook.getTitle());
	            pstmt.setString(3, newBook.getAuthor());
	            pstmt.executeUpdate();
	            return getBook(newBook.getId());
	        } 
	        catch (SQLException e)
            {
                e.printStackTrace();
            }
	        return Optional.empty();
	    }
	 

	public static Book extractBookFromResultSet(ResultSet resultSet) throws SQLException {
        Book book = new Book();
        book.setId(resultSet.getInt(1));
        book.setTitle(resultSet.getString(2));
        book.setAuthor(resultSet.getString(3));
        close(resultSet);
        return book;
    }
	 
	public static void close(ResultSet resultSet) {
        if (resultSet != null) 
        {
            try
            {
                resultSet.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
	
}