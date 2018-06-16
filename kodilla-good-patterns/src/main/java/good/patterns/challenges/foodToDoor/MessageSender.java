package good.patterns.challenges.foodToDoor;

public interface MessageSender {
    String messageSendSuccesfull(Customer customer , Order order);
    String messageSendFail(Customer customer);
}
