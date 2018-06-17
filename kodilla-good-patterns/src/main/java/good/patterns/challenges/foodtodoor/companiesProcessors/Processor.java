package good.patterns.challenges.foodtodoor.companiesProcessors;

import good.patterns.challenges.foodtodoor.Customer;
import good.patterns.challenges.foodtodoor.messageSenders.MessageSender;
import good.patterns.challenges.foodtodoor.Order;

public interface Processor {
    boolean process(Customer customer , Order order , MessageSender messageSender);
}
