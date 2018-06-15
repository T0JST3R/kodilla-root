package good.patterns.challenges.orderService;

import java.util.Objects;

public class Pen implements Product {
    private String name;
    private double price;

    public Pen(String name, double price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price &&
                Objects.equals(name, pen.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price);
    }


}
