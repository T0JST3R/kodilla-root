package good.patterns.challenges.flightchallenge;

import java.util.Objects;

public class Flight {

    private final String from;

    private final String to;

    private final String through;

    private final String departure;

    private final String arrival;

    public static final String WROCLAW = "Wroclaw";

    public static final String POZNAN = "Poznan";

    public static final String KRAKOW = "Krakow";

    public Flight(String from, String to, String through, String departure, String arrival) {
        this.from = from;
        this.to = to;
        this.through = through;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getFrom() {
        return from;
    }


    public String getTo() {
        return to;
    }

    public String getThrough() {
        return through;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to) &&
                Objects.equals(through, flight.through) &&
                Objects.equals(departure, flight.departure) &&
                Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {

        return Objects.hash(from, to, through, departure, arrival);
    }
}
