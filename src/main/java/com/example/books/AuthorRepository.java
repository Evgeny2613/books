package com.example.books;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
