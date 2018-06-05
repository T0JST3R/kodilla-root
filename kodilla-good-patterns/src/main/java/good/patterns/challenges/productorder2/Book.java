package good.patterns.challenges.productorder2;

import java.util.Objects;

public class Book implements Product {
    String name;
    Integer quantity;
    Double price;

    public Book(String name, Integer quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(quantity, book.quantity) &&
                Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, quantity, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
