package good.patterns.challenges.productorder2;

public class ProductOrderService {

    private MessageSender messageSender;
    private Product product;
    private User user;

    public ProductOrderService(final MessageSender messageSender, final Product product, final User user) {
        this.messageSender = messageSender;
        this.product = product;
        this.user = user;
    }


    public void orderCompletor(User user, Product product, MessageSender messageSender) {

        if (new OrderConfirm().orderConfirm(product)) {
            messageSender.sendMessageSuccess(user, product);
            new ProductSender().sendProduct(user, product);
        } else messageSender.sendMessageFail(user, product);

    }


}