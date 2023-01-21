package com.example.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorDataBaseInitializer implements CommandLineRunner {

    @Autowired
    private AuthorRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.saveAll(
                List.of(
                        new Author(1, "Jules", "Verne"),
                        new Author(2, "Mikhail", "Bulgakov"),
                        new Author(3, "William", "Shakespeare"),
                        new Author(4, "Mark", "Twain")
                )
        );
    }
}
