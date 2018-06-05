package com.kodilla.spring.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReaderConfig {
    @Autowired
    @Qualifier("book1")
    Book book;

    @Bean
    public Reader getReader() {
        return new Reader(book);
    }

    @Bean(name="book1")
    public Book getBook() {
        return new Book("Java Guide");
    }
    @Bean(name="book2")
    @Conditional(IfDayIsOddCondition.class)
    public Book getBook2(){
        return new Book("PascalGuide");
    }


}
