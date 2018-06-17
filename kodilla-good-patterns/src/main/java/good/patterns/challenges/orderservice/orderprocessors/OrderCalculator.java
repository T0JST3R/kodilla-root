package good.patterns.challenges.orderservice.orderprocessors;

import good.patterns.challenges.orderservice.Order;
import good.patterns.challenges.orderservice.User;
import good.patterns.challenges.orderservice.products.Product;

import java.util.Map;

public class OrderCalculator {

    public boolean userHasEnoughMoney(Order order, User user) {
        return (getOrderPrice(order)<user.getMoney());
    }

    public double getOrderPrice(Order order){
        double result = 0.0;
        for (Map.Entry<Product, Integer> entry : order.getProducts().entrySet()) {
            result = result + (entry.getKey().getPrice() * entry.getValue());
        }
        return result;
    }
}

