package good.patterns.challenges.foodtodoor.messageSenders;

import good.patterns.challenges.foodtodoor.Customer;
import good.patterns.challenges.foodtodoor.Order;

public class MailSender implements MessageSender{
    @Override
    public String messageSendSuccesfull(Customer customer, Order order) {
        return "Hi " + customer.getName() + " ! Your Order nr " + order.getOrderNumber() + " has been sent! your product list: " + order.getProducts() + " final price is: " + order.computePrice();
    }

    @Override
    public String messageSendFail(Customer customer) {
        return "Hi " + customer.getName() + "We couldn't sent your order. Chceck your wallet. For more informations contact our support";
    }
}
