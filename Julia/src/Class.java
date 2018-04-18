public class PoleTrojkataa {

    public static boolean sprawdzenie(double a, double b, double c) {

        if (a < b + c && b < c + a && c < b + a) {
            return true;
        } else return false;

    }

    public static double poleTrojkata(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double wynik = p * (p - a) * (p - b) * (p - c);
        Math.sqrt(wynik);
        return wynik;
    }


      if (a < b + c && b < c + a && c < b + a)
}