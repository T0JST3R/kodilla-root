package good.patterns.challenges.flightChallenge;

import java.time.LocalDate;
import java.util.Objects;

public class Flight {
   public final String from;
    public final String to;
    public final String through;
    public final String departure;
    public final String arrival;
    public static String WROCLAW = "Wroclaw";
    public static String POZNAN = "Poznan";
    public static String KRAKOW = "Krakow";


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
                Objects.equals(through, flight.through);
    }

    @Override
    public int hashCode() {

        return Objects.hash(from, to, through);
    }
}
