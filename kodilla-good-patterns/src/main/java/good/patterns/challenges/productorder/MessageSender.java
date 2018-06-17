package good.patterns.challenges.productOrder;

public interface MessageSender {

    public void sendMessageSuccess(User user, Product product);

    public void sendMessageFail(User user, Product product);
}
