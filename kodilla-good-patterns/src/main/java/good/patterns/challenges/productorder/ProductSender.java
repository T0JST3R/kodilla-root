package good.patterns.challenges.productorder;

public class ProductSender {

    public void sendProduct(User user, Product product) {

        System.out.println("Dear " + user.getUserName() + " your " + product.getName() + " in quantity " + product.getQuantity() + " has been sent!");
    }
}
