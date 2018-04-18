public class result {

    public boolean getAverage(double a, double b, double c) {

        if (a > b && a > c) {
            if (a > b + c) {
                return true;}
             else return false;}
         else if (b > a && b > c) {
            if (b > c + a) {
                return true;}
             else return false;}

         else if (c > a && c > b) {
            if (c > a + b) {
                return true;}
             else return false;}
        }
    }





