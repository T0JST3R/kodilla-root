package exception.test;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandling {
    private static final Logger LOGGER = Logger.getLogger(ExceptionHandling.class.toString());
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3, 3);
          //  secondChallenge.probablyIWillThrowException(3, 4);

        } catch (Exception e) {
            System.out.println("Exception!" + e.getMessage());
            LOGGER.log(Level.SEVERE , "Exception" , e);
        } finally {
            System.out.println("Program finished work");
        }
    }
}
