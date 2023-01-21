package com.example.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository repository;

    @GetMapping
    public Iterable<Author> getAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{key}")
    public Optional<Author> getById(@PathVariable(name = "key") Integer id) {
        return repository.findById(id);
    }

    @PostMapping
    public Author add(@RequestBody Author author) {
        return repository.save(author);
    }

    @PostMapping("/update")
    public Author update(@RequestBody Author author) {
      return repository.save(author);
    }

    @DeleteMapping("{key}")
    public void delete(@PathVariable(name = "key") Integer id) {
        repository.deleteById(id);
        System.out.println("The delete was successful");
    }
}
