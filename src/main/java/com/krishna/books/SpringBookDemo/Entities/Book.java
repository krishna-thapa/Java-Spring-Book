package com.krishna.books.SpringBookDemo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="book_id")
    private Integer id;
	
    @Column(length = 100, name="title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="year_written")
    private Integer year_written;

    @Column(name="edition")
    private String edition;

    @Column(name="price")
    private double price;

	public Book(Integer id, String title, String author, Integer year_written, String edition, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year_written = year_written;
		this.edition = edition;
		this.price = price;
	}
    
    public Book() {
    	
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYear_written() {
		return year_written;
	}

	public void setYear_written(Integer year_written) {
		this.year_written = year_written;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    
}
