package patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaulSharingStrategies(){
        User tadek = new Millenials("Tadek");
        User czarek = new YGeneration("Czarek");
        User zenon = new ZGeneration("Zenon");

        String resultTadek = tadek.favouriteMedia();
        String resultCzarek = czarek.favouriteMedia();
        String resultZenon = zenon.favouriteMedia();
        System.out.println(resultTadek);
        System.out.println(resultCzarek);
        System.out.println(resultZenon);
    }

    @Test
    public void testIndividualSharingStrategies(){
        User tadek = new Millenials("Tadek");
        User czarek = new YGeneration("Czarek");
        User zenon = new ZGeneration("Zenon");


        tadek.setSocialPublisher(new FacebookPublisher());
        czarek.setSocialPublisher(new TwitterPublisher());
        zenon.setSocialPublisher(new TwitterPublisher());
        String resultTadek = tadek.favouriteMedia();
        String resultCzarek = czarek.favouriteMedia();
        String resultZenon = zenon.favouriteMedia();
        System.out.println(resultTadek);
        System.out.println(resultCzarek);
        System.out.println(resultZenon);

    }
}
