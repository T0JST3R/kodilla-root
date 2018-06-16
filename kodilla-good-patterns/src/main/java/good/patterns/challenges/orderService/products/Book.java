package good.patterns.challenges.orderService.products;

import java.util.Objects;

public class Book extends Product {
    String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), author);
    }
}