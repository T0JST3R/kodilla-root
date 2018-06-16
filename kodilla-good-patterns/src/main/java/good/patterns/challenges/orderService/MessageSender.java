package good.patterns.challenges.orderService;

public interface MessageSender {

    String sendSuccesfull(User user, Order order);

    String sendFailed(User user);
}
