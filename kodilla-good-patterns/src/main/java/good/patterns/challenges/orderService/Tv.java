package good.patterns.challenges.orderService;

import java.util.Objects;

public class Tv implements Product {
    private double price;
    private String name;

    public Tv(double price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return price == tv.price &&
                Objects.equals(name, tv.name);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(price, name);
    }

    public String getName() {

        return name;
    }



    @Override
    public double getPrice() {
        return price;
    }
}
