package good.patterns.challenges.foodtodoor;

import good.patterns.challenges.foodtodoor.companiesProcessors.ExtraFoodShopProcessor;
import good.patterns.challenges.foodtodoor.companiesProcessors.GlutenFreeProcessor;
import good.patterns.challenges.foodtodoor.companiesProcessors.Processor;
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
        Processor glutenFreeProcessor = new GlutenFreeProcessor();
        Processor extraFoodShopProcessor = new ExtraFoodShopProcessor();
        Company extraFoodShop = new  ExtraFoodShop("Extra food shop" ,extraFoodShopProcessor );
        Company glutenFreeShop = new GlutenFreeShop("Gluten Free Shop" , glutenFreeProcessor);
        Order order = new Order(productList , 223);
        Customer customer = new Customer("Jan", "Nibylandia" , 110.0);
        Customer customer1 = new Customer("Jan", "Nibylandia" , 2);
        extraFoodShop.processor.process(customer , order ,mailSender);
        glutenFreeShop.processor.process(customer1 , order ,mailSender);


    }
}
