package exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightMap {
    private Map<String, Boolean> flights;

    public FlightMap() {
        this.flights = new HashMap<>();
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
