package com.example.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDataBaseInitializer implements CommandLineRunner {

    @Autowired
    private BookRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.saveAll(
                List.of(
                        new Book(1, "Around the World in 80 Days", 1872, 1),
                        new Book(2, "The Master and Margarita", 1967, 2),
                        new Book(3, "Romeo and Juliet", 1597, 3),
                        new Book(4, "Hamlet", 1601, 3),
                        new Book(5, "The Adventures of Tom Sawyer", 1876, 4)
                )
        );
    }
}