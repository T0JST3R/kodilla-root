package exception.test;

public class FirstChallenge {

    public double divide(double b, double a) throws ArithmeticException {
        try {
            if (a == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero! :" + e);

        } finally {
            System.out.println("Thank for using calculator! Result is : ");
        }

        return b / a;

    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}

