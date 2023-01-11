package io.javabytes.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import io.javabytes.springwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
