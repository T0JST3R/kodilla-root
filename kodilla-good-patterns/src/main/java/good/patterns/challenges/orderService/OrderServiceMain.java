package good.patterns.challenges.orderService;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceMain {
    public static void main(String[] args) {

        Product book = new Book("Ss", 12.0, "Author");
        Product pen = new Pen("Super Pen", 11.44);
        Product tv = new Tv(12.33, "Clear vision tv");
        List<Product> products = new ArrayList<>();
        products.add(book);
        products.add(pen);
        products.add(tv);
        MessageSender messageSender = new MailSender();
        Order order = new Order(122, products);
        OrderCalculator orderCalculator = new OrderCalculator();
        OrderSender orderSender = new OrderSender(order);
        User user = new User("Jan", "Nowak", 2);
        OrderProcessor orderProcessor = new OrderProcessor(messageSender, order, orderCalculator, user, orderSender);

        orderProcessor.processOrder();

    }
}
