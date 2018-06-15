package good.patterns.challenges.orderService;

public class MailSender implements MessageSender {
    public MailSender() {
    }

    @Override
    public String sendSuccesfull(User user , Order order) {
        return "Dear " + user.getName() + " Your order has been sent!. Number of order is :  " + order.getNumber();
    }

    @Override
    public String sendFailed(User user) {
        return "Dear " + user.getName() + " Your order couldn't been sent because of your amount of money in wallet. Your wallet status : " + user.getMoney();
    }
}
