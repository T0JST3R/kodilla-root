package good.patterns.challenges.orderService;

public class OrderCalculator {
    public OrderCalculator() {
    }

    public boolean comparePriceWithWallet(Order order, User user) {
        double result = 0.0;
        for (Product product : order.getProducts()) {
            result = result + product.getPrice();
        }
        return (user.getMoney()>result);
    }
}
