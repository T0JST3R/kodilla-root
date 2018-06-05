package patterns.bigmac;

import com.kodilla.patterns.builder.bigmac.BigMac;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BigMacTestSuite {

    @Test
    public void testMakeBigMac() {

        // Given

        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(BigMac.BigMacBuilder.BUN)
                .burgers(12)
                .ingredients(BigMac.BigMacBuilder.BECON)
                .ingredients(BigMac.BigMacBuilder.CHILI)
                .ingredients(BigMac.BigMacBuilder.Mushrooms)
                .sauce(BigMac.BigMacBuilder.FIRSTSAUSE)
                .sesame(true)
                .build();


        //When

        System.out.println(bigMac);

        //Then
        Assert.assertEquals(bigMac.getBun() , "BUN");
        Assert.assertEquals(bigMac.getSauce() , "FIRSTSAUCE");
        Assert.assertEquals(bigMac.getBurgers() , 12);
        Assert.assertEquals(bigMac.getIngredients().size() , 3);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(333);
        list.add(2123);
        list.add(222);
        list.add(330400);
        list.add(21212);

        list.trimToSize();


    }
}
