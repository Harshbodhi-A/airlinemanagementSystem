package AirlineManagement;

import java.util.ArrayList;

public class Passenger {
	
	private String name;
	private String passportNumber;
	private ArrayList<Flight> bookedFlight;
	
	
	public Passenger(String name, String passportNumber) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
		this.bookedFlight = new ArrayList<>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassportNumber() {
		return passportNumber;
	}


	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}


	public ArrayList<Flight> getBookedFlight() {
		return bookedFlight;
	}


	public void setBookedFlight(ArrayList<Flight> bookedFlight) {
		this.bookedFlight = bookedFlight;
	}
	
	
	public void bookFlight(Flight flight) {
		bookedFlight.add(flight);
		flight.cancelBooking();
	}
	
	public void cancelBooking(Flight flight) {
		bookedFlight.remove(flight);
		flight.cancelBooking();
	}


	@Override
	public String toString() {
		return "Passenger [name=" + name + ", passportNumber=" + passportNumber + ", bookedFlight=" + bookedFlight
				+ "]";
	}
	
	
	

}
