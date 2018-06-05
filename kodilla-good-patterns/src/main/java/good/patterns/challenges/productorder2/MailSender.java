package good.patterns.challenges.productorder2;

public class MailSender implements MessageSender {
    @Override
    public void sendMessageSuccess(User user, Product product) {

        System.out.println(user + "Ordered: " + product.getName() + " quantity: " + product.getQuantity() + " Message has been sent! ");

    }

    @Override
    public void sendMessageFail(User user, Product product) {

        System.out.println(user + "Ordered: " + product.getName() + " quantity: " + product.getQuantity() + " But can't be realized! ");

    }
}
