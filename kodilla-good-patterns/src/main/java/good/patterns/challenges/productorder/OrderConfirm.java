package good.patterns.challenges.productorder;

public class OrderConfirm {

    private double getPrice(Product product) {

        return product.getPrice() * product.getQuantity();
    }


    public boolean orderConfirm(Product product) {

        if (getPrice(product) <= 30.0) {
            return true;
        } else return false;
    }
}
