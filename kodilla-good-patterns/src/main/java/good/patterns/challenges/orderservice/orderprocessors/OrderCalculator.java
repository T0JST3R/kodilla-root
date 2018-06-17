package good.patterns.challenges.orderService.orderProcessors;

import good.patterns.challenges.orderService.Order;
import good.patterns.challenges.orderService.User;
import good.patterns.challenges.orderService.products.Product;

import java.util.Map;

public class OrderCalculator {
    public OrderCalculator() {
    }

    public boolean comparePriceWithWallet(Order order, User user) {
        double result = 0.0;
        for (Map.Entry<Product, Integer> entry : order.getProducts().entrySet()) {
            result = result + (entry.getKey().getPrice() * entry.getValue());
        }

        return (result<user.getMoney());
    }

    public double getOrderPrice(Order order){
        double result = 0.0;
        for (Map.Entry<Product, Integer> entry : order.getProducts().entrySet()) {
            result = result + (entry.getKey().getPrice() * entry.getValue());
        }
        return result;
    }
}

