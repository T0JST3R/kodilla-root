package good.patterns.challenges.foodToDoor;

import java.util.ArrayList;
import java.util.List;

public class MainFoodToDoor {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new ExampleProduct("Pen" , 20.0));
        productList.add(new ExampleProduct("Nuts" , 11.0));
        MessageSender mailSender = new MailSender();
        Company extraFoodShop = new  ExtraFoodShop("Extra food shop" );
        Company glutenFreeShop = new GlutenFreeShop("Gluten Free Shop");
        Order order = new Order(productList , 223);
        Customer customer = new Customer("Jan", "Nibylandia" , 110.0);
        extraFoodShop.processor.process(customer , order ,mailSender);


    }
}
