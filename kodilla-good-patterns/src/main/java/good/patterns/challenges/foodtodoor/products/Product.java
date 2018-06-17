package good.patterns.challenges.foodtodoor.products;

import java.util.Objects;

public abstract class Product {
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return   name +
                ", price=" + price
                ;
    }
}
