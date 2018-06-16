package good.patterns.challenges.foodToDoor;

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
