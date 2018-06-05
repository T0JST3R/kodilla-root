import good.patterns.challenges.flightChallenge.Flight;
import good.patterns.challenges.flightChallenge.FlightCenter;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlightTestSuite {

    @Test
    public void testFindFlightWithThreeArguments() {
        // Given
        FlightCenter flightCenter = new FlightCenter();
        Flight flight1 = new Flight(Flight.KRAKOW ,  Flight.POZNAN, Flight.WROCLAW , "12.12.18 : 12:00" , "12.12.18: 16:00");
        Flight flight2 = new Flight(Flight.POZNAN, Flight.WROCLAW, Flight.KRAKOW , "15.05.18 : 14:00" , "03.04.18: 17:00");
        Flight flight3 = new Flight(Flight.KRAKOW, Flight.WROCLAW, Flight.POZNAN , "04.01.18 : 17:00" , "01.02.18: 20:00");
        Flight flight4 = new Flight(Flight.WROCLAW, Flight.KRAKOW, Flight.POZNAN , "05.04.18 : 11:00" , "17.11.18: 16:00");
        Flight flight5 = new Flight(Flight.POZNAN, Flight.KRAKOW, Flight.WROCLAW , "09.08.18 : 14:00" , "14.09.18: 17:00");
        Flight flight6 = new Flight(Flight.WROCLAW, Flight.POZNAN, Flight.WROCLAW , "11.10.18 : 12:00" , "11.01.18: 15:00");
        //When
        flightCenter.flightAdd(flight1);
        flightCenter.flightAdd(flight2);
        flightCenter.flightAdd(flight3);
        flightCenter.flightAdd(flight4);
        flightCenter.flightAdd(flight5);
        flightCenter.flightAdd(flight6);
        List<Flight> flightList1 = flightCenter.findFlight(FlightCenter.KRAKOW, FlightCenter.POZNAN, FlightCenter.WROCLAW);
        List<Flight> flightList2 = flightCenter.findFlight(FlightCenter.KRAKOW, FlightCenter.WROCLAW, FlightCenter.POZNAN);
        List<Flight> flightList3 = flightCenter.findFlight(FlightCenter.KRAKOW, FlightCenter.POZNAN, FlightCenter.WROCLAW);
        List<Flight> flightList4 = flightCenter.findFlight(FlightCenter.KRAKOW, FlightCenter.POZNAN, FlightCenter.WROCLAW);
        List<Flight> flightList5 = flightCenter.findFlight(FlightCenter.KRAKOW, FlightCenter.POZNAN, FlightCenter.WROCLAW);
        //Then
        Assert.assertEquals(1 , flightList1.size());
        Assert.assertEquals(1 , flightList2.size());
        Assert.assertEquals(1 , flightList3.size());
        Assert.assertEquals(1 , flightList4.size());
        Assert.assertEquals(1 , flightList5.size());
    }
}
