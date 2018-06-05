package good.patterns.challenges.productorder2;

public interface MessageSender {

    public void sendMessageSuccess(User user, Product product);

    public void sendMessageFail(User user, Product product);
}
