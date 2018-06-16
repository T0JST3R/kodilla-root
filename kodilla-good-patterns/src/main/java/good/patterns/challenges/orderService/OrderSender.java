package good.patterns.challenges.orderService;

public class OrderSender {
    private Order order;

    public OrderSender(Order order) {
        this.order = order;
    }

    public String sendOrder() {
        return "Order has been sent!";
    }
}
