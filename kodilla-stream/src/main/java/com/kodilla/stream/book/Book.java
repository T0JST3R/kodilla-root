package com.kodilla.stream.book;

import java.util.Objects;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;


    public Book(String author, String title, int yearOfPublication, String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) &&
                Objects.equals(signature, book.signature);
    }

    @Override
    public int hashCode() {


    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
