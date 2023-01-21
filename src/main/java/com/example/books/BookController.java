package com.example.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping
    public Iterable<Book> getAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{key}")
    public Optional<Book> getById(@PathVariable (name = "key") Integer id) {
        return repository.findById(id);
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
      return repository.save(book);
    }

    @PostMapping("/update")
    public Book update(@RequestBody Book book) {
     return repository.save(book);
    }

    @DeleteMapping("/{key}")
    public void delete(@PathVariable(name = "key") Integer id) {
        repository.deleteById(id);
    }
}
