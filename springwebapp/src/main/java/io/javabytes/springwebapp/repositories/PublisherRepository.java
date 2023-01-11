package io.javabytes.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import io.javabytes.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
