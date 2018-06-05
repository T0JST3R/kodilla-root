package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    final String name;
     Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws  CloneNotSupportedException{
        return (Library)super.clone();
    }
    public Library deepCopy()throws CloneNotSupportedException{
        Library deepCopy = (Library)super.clone();
        deepCopy.books = new HashSet<>();

        for (Book book: books) {
            Book clonedBook = new Book(book.getTitle() , book.getAuthor() , book.getPublicationDate());
            deepCopy.getBooks().add(clonedBook);

        }
    return deepCopy;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
