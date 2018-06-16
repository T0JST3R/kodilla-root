package good.patterns.challenges.orderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private int number;
    private List<Product> products = new ArrayList<>();
    private User user;

    public Order(int number, List<Product> products, User user) {
        this.number = number;
        this.products = products;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number == order.number &&
                Objects.equals(products, order.products) &&
                Objects.equals(user, order.user);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, products, user);
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", products=" + products +
                '}';
    }

    public Order(int number, List<Product> products) {
        this.number = number;
        this.products = products;
    }

    public int getNumber() {
        return number;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
