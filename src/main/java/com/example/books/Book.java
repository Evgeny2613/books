package com.example.books;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.stream.IntStream;

@Entity
@Table(name = "book")
public class Book {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer year;

    @Column
    private Integer authorId;

    public Book() {

    }

    public Book(Integer id, String name, Integer year, Integer authorId) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.authorId = authorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", authorId=" + authorId +
                '}';
    }
}
