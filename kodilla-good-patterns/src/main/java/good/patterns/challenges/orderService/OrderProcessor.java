package good.patterns.challenges.orderService;

public class OrderProcessor {
    private final MessageSender messageSender;
    private final Order order;
    private final OrderCalculator orderCalculator;
    private final User user;
    private final OrderSender orderSender;

    public OrderProcessor(MessageSender messageSender, Order order, OrderCalculator orderCalculator, User user, OrderSender orderSender) {
        this.messageSender = messageSender;
        this.order = order;
        this.orderCalculator = orderCalculator;
        this.user = user;
        this.orderSender = orderSender;
    }

    public void processOrder() {
        if (orderCalculator.comparePriceWithWallet(order, user)) {
            System.out.println(messageSender.sendSuccesfull(user, order));
            System.out.println(orderSender.sendOrder());

        } else System.out.println(messageSender.sendFailed(user));
    }
}
