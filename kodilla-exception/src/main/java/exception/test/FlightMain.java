package exception.test;

public class FlightMain {

    public static void main(String[] args) {

        FlightMap flightMap = new FlightMap();

        try {
            Boolean result = flightMap.findFlight(new Flight("Poznan", "Warszawa"));
            System.out.println(result);
        } catch (RouteNotFoundException e) {
            System.out.println(e);

        }
        try {
            Boolean result1 = flightMap.findFlight(new Flight("Poznan", "Wroclaw"));
            System.out.println(result1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);

        }


    }

}
