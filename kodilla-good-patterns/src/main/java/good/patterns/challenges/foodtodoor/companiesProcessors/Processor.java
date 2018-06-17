package good.patterns.challenges.foodToDoor.companiesProcessors;

import good.patterns.challenges.foodToDoor.Customer;
import good.patterns.challenges.foodToDoor.messageSenders.MessageSender;
import good.patterns.challenges.foodToDoor.Order;

public interface Processor {
    boolean process(Customer customer , Order order , MessageSender messageSender);
}
