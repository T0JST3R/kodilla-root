package good.patterns.challenges.foodtodoor.companiesProcessors;

import good.patterns.challenges.foodtodoor.Customer;
import good.patterns.challenges.foodtodoor.messageSenders.MessageSender;
import good.patterns.challenges.foodtodoor.Order;

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
