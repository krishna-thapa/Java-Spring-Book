package com.krishna.books.SpringBookDemo.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.krishna.books.SpringBookDemo.Entities.Book;



public interface BookService {

	 	Iterable<Book> listAllBooks();

	 	Book getBookById(String title);

	 	Book saveBook(Book book);

	    void deleteBook(String title);

	    Page<Book> findAll(Pageable pageable);
}
