package good.patterns.challenges.orderService.messageSenders;

import good.patterns.challenges.orderService.Order;
import good.patterns.challenges.orderService.User;
import good.patterns.challenges.orderService.orderProcessors.OrderCalculator;

public class MailSender implements MessageSender {

    @Override
    public String sendSuccesfull(User user, Order order , OrderCalculator calculator) {
        return "Dear " + user.getName() + " Your order has been sent!. Number of order is :  " + order.getNumber() + " your order:" + order.getProducts() + " final price is " + calculator.getOrderPrice(order);
    }

    @Override
    public String sendFailed(User user) {
        return "Dear " + user.getName() + " Your order couldn't been sent because of your amount of money in wallet. Your wallet status : " + user.getMoney();
    }
}
