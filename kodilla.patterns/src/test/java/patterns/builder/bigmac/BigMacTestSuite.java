package patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.BigMac;
import org.junit.Assert;
import org.junit.Test;

import java.beans.ExceptionListener;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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


        //Then
        assertEquals(bigMac.getBun(), "BUN");
        assertEquals(bigMac.getSauce(), "FIRSTSAUCE");
        assertEquals(bigMac.getBurgers(), 12);
        assertEquals(bigMac.getIngredients().size(), 3);

    }
}
