package good.patterns.challenges.orderservice.messagesenders;

import good.patterns.challenges.orderservice.Order;
import good.patterns.challenges.orderservice.User;
import good.patterns.challenges.orderservice.orderprocessors.OrderCalculator;

public interface MessageSender {

    String sendSuccesfull(User user, Order order , OrderCalculator calculator);

    String sendFailed(User user);
}
