package good.patterns.challenges.orderService;

import java.util.Objects;

public class Book extends Product {
    String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;

    }
}