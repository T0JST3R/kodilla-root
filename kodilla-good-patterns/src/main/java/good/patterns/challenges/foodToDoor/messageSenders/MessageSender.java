package good.patterns.challenges.foodToDoor.messageSenders;

import good.patterns.challenges.foodToDoor.Customer;
import good.patterns.challenges.foodToDoor.Order;

public interface MessageSender {
    String messageSendSuccesfull(Customer customer , Order order);
    String messageSendFail(Customer customer);
}
