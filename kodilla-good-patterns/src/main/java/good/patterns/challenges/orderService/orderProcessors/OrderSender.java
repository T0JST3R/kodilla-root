package good.patterns.challenges.orderService.orderProcessors;

import good.patterns.challenges.orderService.Order;

public class OrderSender {
    private Order order;

    public OrderSender(Order order) {
        this.order = order;
    }

    public String sendOrder() {
        return "Order has been sent!";
    }
}
