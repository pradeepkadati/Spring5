package io.javabytes.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import io.javabytes.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
