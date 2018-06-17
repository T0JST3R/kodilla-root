package good.patterns.challenges.orderservice.orderprocessors;

import good.patterns.challenges.orderservice.Order;

public class OrderSender {
    private Order order;

    public OrderSender(Order order) {
        this.order = order;
    }

    public String sendOrder() {
        return "Order has been sent!";
    }
}
