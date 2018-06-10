package good.patterns.challenges.flightChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightCenter {

    public static final String WROCLAW = "Wroclaw";
    public static final String KRAKOW = "Krakow";
    public static final String POZNAN = "Poznan";
    private List<Flight> flights = new ArrayList<>();

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Flight> findFlight(String from, String to, String through) {
        List<Flight> resultList = new ArrayList();
        resultList = flights.stream()
                .filter(d -> d.getFrom().equals(from) && d.getTo().equals(to) && d.getThrough().equals(through))
                .collect(Collectors.toList());
        return resultList;
    }

    public List<Flight> findFlight(String from, String to) {
        List<Flight> resultList = new ArrayList<>();
        resultList = flights.stream()
                .filter(d -> d.getFrom().equals(from) && d.getTo().equals(to))
                .collect(Collectors.toList());
        return resultList;
    }
    public List<Flight> findFlightFrom(String from){
        List<Flight> resultList = new ArrayList<>();
         resultList = flights.stream()
                .filter(d-> d.getFrom().equals(from))
                .collect(Collectors.toList());
         return resultList;
    }
    public List<Flight> findFlightTo(String to){
        List<Flight> resultList = new ArrayList<>();
        resultList = flights.stream()
                .filter(d-> d.getTo().equals(to))
                .collect(Collectors.toList());
        return resultList;
    }
    public List<Flight> findFlightThrough(String through){
        List<Flight> resultList = new ArrayList<>();
        resultList = flights.stream()
                .filter(d-> d.getThrough().equals(through))
                .collect(Collectors.toList());
        return resultList;
    }

    public void flightAdd(Flight flight) {
        flights.add(flight);
    }
}
