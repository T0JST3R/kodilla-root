package good.patterns.challenges.flightChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightCenter {
    public static String WROCLAW = "Wroclaw";
    public static String KRAKOW = "Krakow";
    public static String POZNAN = "Poznan";
    private List<Flight> flights = new ArrayList<>();

    public List<Flight> getFlights() {
        return flights;
    }

    public List findFlight(String from, String to, String through) {
        List<Flight> flight = new ArrayList();
        flight = flights.stream()
                .filter(d -> d.from.equals(from) && d.to.equals(to) && d.through.equals(through))
                .collect(Collectors.toList());
        return flight;
    }

    public List findFlight(String from, String to) {
        List<Flight> flight = new ArrayList<>();
        flight = flights.stream()
                .filter(d -> d.from.equals(from) && d.to.equals(to))
                .collect(Collectors.toList());
        return flight;
    }

    public void flightAdd(Flight flight) {
        flights.add(flight);
    }
}
