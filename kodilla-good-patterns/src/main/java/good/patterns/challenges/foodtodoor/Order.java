package good.patterns.challenges.foodToDoor;

import good.patterns.challenges.foodToDoor.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
   private List<Product> products = new ArrayList<>();
   private int orderNumber;

    public Order(List<Product> products, int orderNumber) {
        this.products = products;
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", orderNumber=" + orderNumber +
                '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double computePrice(){
        double result = 0.0;
        for (Product product:products) {
            result = result+product.getPrice();
        }
        return result;
    }
}
