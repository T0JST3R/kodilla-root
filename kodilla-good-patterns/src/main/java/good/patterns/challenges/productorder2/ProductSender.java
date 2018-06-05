package good.patterns.challenges.productorder2;

import good.patterns.challenges.productorder2.Product;
import good.patterns.challenges.productorder2.User;

public class ProductSender {

    public void sendProduct(User user, Product product) {

        System.out.println("Dear " + user.getUserName() + " your " + product.getName() + " in quantity " + product.getQuantity() + " has been sent!");
    }
}
