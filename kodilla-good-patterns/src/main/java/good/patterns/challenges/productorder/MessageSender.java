package good.patterns.challenges.productorder;

public interface MessageSender {

    public void sendMessageSuccess(User user, Product product);

    public void sendMessageFail(User user, Product product);
}
