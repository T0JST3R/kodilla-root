package good.patterns.challenges.foodtodoor;

import good.patterns.challenges.foodtodoor.companiesabstract.Company;
import good.patterns.challenges.foodtodoor.companies.ExtraFoodShop;
import good.patterns.challenges.foodtodoor.companies.GlutenFreeShop;
import good.patterns.challenges.foodtodoor.messageSenders.MailSender;
import good.patterns.challenges.foodtodoor.messageSenders.MessageSender;
import good.patterns.challenges.foodtodoor.products.ExampleProduct;
import good.patterns.challenges.foodtodoor.products.Product;

import java.util.ArrayList;
import java.util.List;

public class MainFoodToDoor {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new ExampleProduct("Pen" , 20.0));
        productList.add(new ExampleProduct("Nuts" , 11.0));
        MessageSender mailSender = new MailSender();
        Company extraFoodShop = new ExtraFoodShop("Extra food shop" );
        Company glutenFreeShop = new GlutenFreeShop("Gluten Free Shop");
        Order order = new Order(productList , 223);
        Customer customer = new Customer("Jan", "Nibylandia" , 110.0);
        Customer customer1 = new Customer("Jan", "Nibylandia" , 2);
        extraFoodShop.process(customer , order , mailSender);
        glutenFreeShop.process(customer1 , order , mailSender);
    }
}
