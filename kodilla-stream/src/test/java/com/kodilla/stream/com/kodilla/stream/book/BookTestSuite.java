package com.kodilla.stream.com.kodilla.stream.book;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BookTestSuite {

    @Test

    public void testGetListUsingFor(){


        //Given
        BookDirectory bookDirectory = new BookDirectory();


        //When

        List<Book> books = bookDirectory.getTheBookList();


        //Then

        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book: books){
            if (book.getYearOfPublication() > 2007){
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3 , numberOfBooksPublicatedAfter2007);
    }
}
