package com.krishna.books.SpringBookDemo.DAO;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krishna.books.SpringBookDemo.Entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{
	Optional<Book> findById(Integer id);
	Book findByTitle(String title);
	Page<Book> findAll(Pageable pageable);
	void deleteByTitle(String title);
}
