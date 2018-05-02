package com.krishna.books.SpringBookDemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.krishna.books.SpringBookDemo.DAO.BookRepository;
import com.krishna.books.SpringBookDemo.Entities.Book;

@Service
public class BookServiceImpl implements BookService{

	private BookRepository bookRepository;
	
	 @Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	 
	 @Autowired
	 public void setBookRepository(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	@Override
	public Iterable<Book> listAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(String title) {
		return bookRepository.findByTitle(title);
	}

	@Override
	public Book saveBook(Book book) {
		 return bookRepository.save(book);
	}

	@Override
	public void deleteBook(String title) {
		bookRepository.deleteByTitle(title);
		
	}

	@Override
	public Page<Book> findAll(Pageable pageable) {
		 return bookRepository.findAll(pageable);
	}

	
}
