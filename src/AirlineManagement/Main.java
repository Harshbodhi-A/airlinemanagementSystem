package AirlineManagement;

public class Main {
	
	public static void main(String[] args) {
		
		Flight flight1 = new Flight("AA123", "New York" , "Los Angeles", "08:00" , "11:00");
		Flight flight2 = new Flight("BA456", "London" , "Paris", "09:00" , "10:30");
		Flight flight3 = new Flight("CA789", "Sydney" , "Melbourne", "07:30" , "09:00");
		
		Passenger passenger1 = new Passenger("Aniket", "P1234567");
		Passenger passenger2 = new Passenger("Nikhil", "P7654321");
		
		Airline airline = new Airline();
		airline.addFlight(flight1);
		airline.addFlight(flight2);
		airline.addFlight(flight3);
		
		airline.registerPassanger(passenger1);
		airline.registerPassanger(passenger2);
		
		airline.bookFlight("P1234567", "AA123");
		airline.bookFlight("P7654321", "BA456");
		airline.cancelBooking("P7654321", "BA456");
		
		
		System.out.println("Available Flight:");
		airline.listAvailableFlight();
		
		System.out.println("\n Booked Flights:");
		airline.listBookingFlights();
	}

}
