package patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaulSharingStrategies() {
        //Given
        User tadek = new Millenials("Tadek");
        User czarek = new YGeneration("Czarek");
        User zenon = new ZGeneration("Zenon");
        //When

        //Then
        assertEquals("Snapchat", tadek.sharePost());
        assertEquals("Facebook", czarek.sharePost());
        assertEquals("Twitter", zenon.sharePost());
    }

}
