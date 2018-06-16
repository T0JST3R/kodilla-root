package good.patterns.challenges.orderService;

import java.util.*;

public class Order {
    private int number;
    private Map<Product , Integer> products;

    public Order(int number, Map<Product, Integer> products) {
        this.number = number;
        this.products = products;
    }

    public int getNumber() {
        return number;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number == order.number &&
                Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, products);
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", products=" + products +
                '}';
    }

    public void addProduct(Product product , int howMany) {
       products.put(product , howMany);
    }
    public Double getProductPrice(Product product){
        return product.getPrice();
    }
}
