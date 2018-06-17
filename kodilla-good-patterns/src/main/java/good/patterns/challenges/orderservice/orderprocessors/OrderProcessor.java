package good.patterns.challenges.orderService.orderProcessors;

import good.patterns.challenges.orderService.Order;
import good.patterns.challenges.orderService.User;
import good.patterns.challenges.orderService.messageSenders.MessageSender;

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
    public static class OrderProcessorBuilder{
        private  MessageSender messageSender;
        private  Order order;
        private  OrderCalculator orderCalculator;
        private  User user;
        private  OrderSender orderSender;

        public OrderProcessorBuilder messageSender(MessageSender messageSender){
            this.messageSender= messageSender;
            return this;
        }
        public OrderProcessorBuilder order(Order order){
            this.order = order;
            return this;
        }
        public OrderProcessorBuilder OrderCalculator(OrderCalculator orderCalculator){
            this.orderCalculator=orderCalculator;
            return this;
        }
        public OrderProcessorBuilder user(User user){
            this.user = user;
            return this;
        }
        public OrderProcessorBuilder orderSender(OrderSender orderSender){
            this.orderSender = orderSender;
            return this;
        }
        public OrderProcessor build(){
            return new OrderProcessor(messageSender , order , orderCalculator , user ,orderSender);
        }
    }

    public void processOrder() {
        if (orderCalculator.comparePriceWithWallet(order, user)) {
            System.out.println(messageSender.sendSuccesfull(user, order , orderCalculator));
            System.out.println(orderSender.sendOrder());

        } else System.out.println(messageSender.sendFailed(user));
    }
}
