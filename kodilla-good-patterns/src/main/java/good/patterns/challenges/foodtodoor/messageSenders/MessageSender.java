package good.patterns.challenges.foodtodoor.messageSenders;

import good.patterns.challenges.foodtodoor.Customer;
import good.patterns.challenges.foodtodoor.Order;

public interface MessageSender {
    String messageSendSuccesfull(Customer customer , Order order);
    String messageSendFail(Customer customer);
}
