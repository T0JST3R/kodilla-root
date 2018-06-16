package good.patterns.challenges.orderService.messageSenders;

import good.patterns.challenges.orderService.Order;
import good.patterns.challenges.orderService.User;
import good.patterns.challenges.orderService.orderProcessors.OrderCalculator;

public interface MessageSender {

    String sendSuccesfull(User user, Order order , OrderCalculator calculator);

    String sendFailed(User user);
}
