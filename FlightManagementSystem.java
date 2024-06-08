// Requirements:
// 1. Customer can book flight;
// 2. Can flights have adhoc schedule or weekly schedule
// 3. Will there be classes of seats
// 4. do i need to take care of 


class Flight {
    Airline airline;
    Airport departure;
    Airport arrival;
    String flightCode;
    Schedule schedule;
}

class FlightInstance {
    DateTime dateOfDeparture;
    Flight flight;
    Aircraft aircraft;
    Guid flightInstanceId;
    List<Seat> seats;
}

class Airport {
    String airportCode;
    Coordinates coordinates; // lat, long
    String cityName;
}

class AirLine {
    String name;
    String airlineCode;
}

class AirCraft {
    Model model;
    int id;
}

class Seat {
    String seat;
    Guid bookingId;
    SeatClass seatClass;
    double price;
}

class Schedule {
    int day;
    int departureTimeMin;
}

class WeeklySchedule {
    Map<Integer, List<Integer>> dayDepartureTimes;
}

class Person {
    String name;
    String address;
    String phoneNumber;
    String email;
}

class Employee extends Person {
    String employeeId;

}

class Customer extends Person {
    Guid customerId;
}

class Booking {
    Guid bookingId;
    Guid customerId;
    Guid flightInstanceId;
    Guid bookerId;
}

public interface IFlightManager  {
    List<FlightInstance> getFlights(String departureAirportCode, String arrivalAirportCode, DateTime departureDateTime);
    FlightInstance getFlight(Guid flightInstanceId);
    FlightInstance addAdhocFlight(Flight flight, DateTime departureDateTime);
    List<FlightInstance> addFlight(Flight flight, DateTime startDateTime, WeeklySchedule weeklySchedule);
    Status cancelFlight(FlightInstance flightInstance);
}

public interface IBookingManager {
    FlightManager flightManager;

    Booking createBooking(FlightInstanceId flightInstanceId, List<Seat> seats, Customer customer);
    List<Booking> getBookings(FlightInstanceId flightInstanceId, Customer customer);
    BookingId getBooking(Guid bookingId);
}