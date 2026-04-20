package com.puntawat.design_pattern.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public Book[] getBooks() {
        return books.toArray(books.toArray(new Book[0]));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public Recommendation clone() throws CloneNotSupportedException {
        var cloned = (Recommendation) super.clone();
        cloned.books = new ArrayList<>();
        books.forEach(cloned.books::add);
        return cloned;
    }
}
