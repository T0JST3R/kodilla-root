package patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaulSharingStrategies(){
        User tadek = new Millenials("Tadek");
        User czarek = new YGeneration("Czarek");
        User zenon = new ZGeneration("Zenon");

        String resultTadek = tadek.sharePost();
        String resultCzarek = czarek.sharePost();
        String resultZenon = zenon.sharePost();
        System.out.println(resultTadek);
        System.out.println(resultCzarek);
        System.out.println("zenon" + resultZenon);
    }

}
