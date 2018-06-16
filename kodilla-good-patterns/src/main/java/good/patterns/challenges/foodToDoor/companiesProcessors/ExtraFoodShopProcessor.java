package good.patterns.challenges.foodToDoor.companiesProcessors;

import good.patterns.challenges.foodToDoor.Customer;
import good.patterns.challenges.foodToDoor.messageSenders.MessageSender;
import good.patterns.challenges.foodToDoor.Order;

public class ExtraFoodShopProcessor implements Processor {
    @Override
    public boolean process(Customer customer, Order order, MessageSender messageSender) {
        if (order.computePrice() < customer.getMoney()) {
            System.out.println(messageSender.messageSendSuccesfull(customer, order));
            return true;
        }
        System.out.println(messageSender.messageSendFail(customer));
        return false;
    }
}
