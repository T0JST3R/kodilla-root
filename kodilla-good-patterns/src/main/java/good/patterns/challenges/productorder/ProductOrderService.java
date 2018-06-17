package good.patterns.challenges.productorder;

public class ProductOrderService {

    public static void main(String[] args) {

        User user = new User("Bartosz", "Bartosz");
        Product book = new Book("Projekt Feniks", 2, 15.0);
        MessageSender mailsender = new MailSender();
        OrderConfirm orderConfirm = new OrderConfirm();
        ProductSender productSender = new ProductSender();


        if (orderConfirm.orderConfirm(book)) {
            mailsender.sendMessageSuccess(user, book);
            productSender.sendProduct(user, book);
        } else mailsender.sendMessageFail(user, book);


    }

}

