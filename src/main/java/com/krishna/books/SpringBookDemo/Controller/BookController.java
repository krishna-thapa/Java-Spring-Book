package com.krishna.books.SpringBookDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.krishna.books.SpringBookDemo.Entities.Book;
import com.krishna.books.SpringBookDemo.Service.BookService;

@Controller
public class BookController {

	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
    @RequestMapping(value = "/bookHome", method = RequestMethod.GET)
    public String list(Model model, Pageable pageable){
        Page<Book> bookPage = bookService.findAll(pageable);
        PageWrapper<Book> page = new PageWrapper<Book>(bookPage, "/bookHome");
        model.addAttribute("books", page.getContent());
        model.addAttribute("page", page);
        return "bookHome";
    }
}
