package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> set = new HashSet<>();
        set.add(new Book("test", "test1" , 1995 , "test3"));
        set.add(new Book("test", "test1" , 2000 , "test3"));
        set.add(new Book("test", "test1" , 2012 , "test3"));
        set.add(new Book("test", "test1" , 1994 , "test33"));
        // When
       int median = medianAdapter.publicationYearMedian(set);

       //Then
        assertEquals(2000 , median , 0);

    }
}
