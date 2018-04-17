package com.kodilla.stream.com.kodilla.stream.book;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class TestGetListUsingIntStream {

    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getTheBookList();

        //Then
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}