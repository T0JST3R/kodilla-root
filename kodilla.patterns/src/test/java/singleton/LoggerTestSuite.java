package singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void loggerTest(){
        Logger.getInstance().log("connection");
        String result = Logger.getInstance().getLastLog();


        Assert.assertEquals("connection" , result);
        Logger.getInstance().log("connection lost");
        result = Logger.getInstance().getLastLog();
        Assert.assertEquals("connection lost" , result);



    }
}
