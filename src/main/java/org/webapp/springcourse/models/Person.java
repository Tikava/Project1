package org.webapp.springcourse.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int id;

    @NotEmpty(message = "Full name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 chars")
    private String fullName;

    @Min(value = 0, message = "Year should be greater than 0")
    private int yearOfBirth;

    private List<Book> bookList = new ArrayList<>();

    public Person() {}

    public Person(int id, String fullName, int yearOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
