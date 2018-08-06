package exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightMap {
    private Map<String, Boolean> flights = new HashMap<>();

    public FlightMap() {

        flights.put("Poznan", true);
        flights.put("Wroclaw", false);
        flights.put("Berlin", true);
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (flights.containsKey(flight.arrivalAirport)) {
            return flights.get(flight.arrivalAirport);
        }
        throw new RouteNotFoundException("Route not found! to " + flight.arrivalAirport);


    }
}
