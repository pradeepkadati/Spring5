package io.javabytes.springwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.javabytes.springwebapp.repositories.BookRepository;

@Controller
public class BookController {

	private BookRepository bookRepository;
	
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@RequestMapping(path = "/books",method = RequestMethod.GET)
	public String getAllBooks(Model model) {
		
		model.addAttribute("books", bookRepository.findAll());
		
		return "books/list";
	}
}
