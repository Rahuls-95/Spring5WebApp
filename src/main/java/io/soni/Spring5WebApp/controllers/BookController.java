package io.soni.Spring5WebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.soni.Spring5WebApp.repositories.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}



	@RequestMapping("/books")
	public String getBooks(Model m) 
	{
		m.addAttribute("books",bookRepository.findAll());
		
		return "books/list";
	}
	
}
