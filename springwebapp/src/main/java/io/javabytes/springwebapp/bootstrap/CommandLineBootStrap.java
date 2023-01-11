package io.javabytes.springwebapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.javabytes.springwebapp.domain.Author;
import io.javabytes.springwebapp.domain.Book;
import io.javabytes.springwebapp.domain.Publisher;
import io.javabytes.springwebapp.repositories.AuthorRepository;
import io.javabytes.springwebapp.repositories.BookRepository;
import io.javabytes.springwebapp.repositories.PublisherRepository;

@Component
public class CommandLineBootStrap implements CommandLineRunner {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
		
	public CommandLineBootStrap(AuthorRepository authorRepository, BookRepository bookRepository,
								PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

		Author eric = new Author("eric", "evans");
		Book ddd = new Book("Domain Driven Design", "12332456");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		publisher.getBooks().add(ddd);
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		
		
		Author rod = new Author("rod", "johnson");
		Book noEjb = new Book("No Ejb", "45673123");
		rod.getBooks().add(noEjb);
		noEjb.getAuthors().add(rod);
		publisher.getBooks().add(noEjb);
		authorRepository.save(rod);
		bookRepository.save(noEjb);
		publisherRepository.save(publisher);
		System.out.println("Competed CommadLine Runner");
		System.out.println("No of Avaialble Books in repo " + bookRepository.count());
		
		System.out.println("No of publishers " + publisherRepository.count());
		
	}

}
