package com.kodilla.stream.com.kodilla.stream.book;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.Assert;

import java.util.List;
import java.util.stream.IntStream;

public class TestGetListUsingIntStream {

        public void testGetListUsingIntStream() {
            //Given

            BookDirectory bookDirectory = new BookDirectory();

            //When

            List<Book> books = bookDirectory.getTheBookList();


            //Then

            Long numberOfBooksPublicatedAfted2007 = IntStream.range(0, books.size())
                    .filter(n -> books.get(n).getYearOfPublication() > 2007)
                    .map(n -> 1)
                    .count();

            Assert.assertEquals(3 , numberOfBooksPublicatedAfted2007);

        }
}
