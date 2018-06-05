package patterns.strategy;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import org.junit.Assert;
import org.junit.Test;

public class StrategyTestSuite {

    @Test
    public void testDefaultInvestingStrategies(){
        //Given
        Customer steven = new IndividualCustomer("Steven Links");
        Customer bartosz = new IndividualYoungCustomer("Bartosz");
        Customer piotr = new CorporateCustomer("Piotr");
        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should " + stevenShouldBuy);
        String bartoszShouldBuy = bartosz.predict();
        System.out.println("Bartosz should buy" + bartoszShouldBuy);
        String piotrShouldBuy = piotr.predict();
        System.out.println("Piotr should"+ piotrShouldBuy);

        //Then

        Assert.assertEquals("Conservative prediction" , stevenShouldBuy);
        Assert.assertEquals("Agressive prediction" , bartoszShouldBuy);
        Assert.assertEquals("Balanced prediction" , piotrShouldBuy);


    }
}
