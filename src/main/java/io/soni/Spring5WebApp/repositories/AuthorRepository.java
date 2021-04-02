package io.soni.Spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.soni.Spring5WebApp.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
