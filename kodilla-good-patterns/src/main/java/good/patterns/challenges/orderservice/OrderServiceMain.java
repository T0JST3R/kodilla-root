package good.patterns.challenges.orderService;

import good.patterns.challenges.orderService.messageSenders.MailSender;
import good.patterns.challenges.orderService.messageSenders.MessageSender;
import good.patterns.challenges.orderService.orderProcessors.OrderCalculator;
import good.patterns.challenges.orderService.orderProcessors.OrderProcessor;
import good.patterns.challenges.orderService.orderProcessors.OrderSender;
import good.patterns.challenges.orderService.products.Book;
import good.patterns.challenges.orderService.products.Pen;
import good.patterns.challenges.orderService.products.Product;
import good.patterns.challenges.orderService.products.Tv;

import java.util.HashMap;

public class OrderServiceMain {
    public static void main(String[] args) {

        Product book = new Book("Ss", 12.0, "Author");
        Product pen = new Pen("Super Pen", 11.44);
        Product tv = new Tv(12.33, "Clear vision tv");
        HashMap<Product, Integer> products = new HashMap<>();
        products.put(book , 1);
        products.put(pen , 1);
        products.put(tv , 2);
        User user = new User("Jan", "Nowak", 222);
        MessageSender messageSender = new MailSender();
        Order order = new Order(122, products);
        OrderCalculator orderCalculator = new OrderCalculator();
        OrderSender orderSender = new OrderSender(order);

        OrderProcessor orderProcessor = new OrderProcessor.OrderProcessorBuilder()
                .order(order)
                .OrderCalculator(orderCalculator)
                .orderSender(orderSender)
                .messageSender(messageSender)
                .user(user)
                .build();

        orderProcessor.processOrder();

    }
}
