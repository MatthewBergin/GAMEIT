
/**ShaunMcFadden_L0011443

 * 
 * @author Shaun McFadden
 *Devops
 *Flight Class Tester
 */
import java.util.*;

public class FlightTester {
	
	static Date date;
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * flight object
		 */
		Flight flight = new Flight(002, 3500, "business", "NewYork", date, date, 1000, 011);
		/**
		 * print out all the details of the flight object
		 */
		System.out.println(flight.toString());
		
		/**
		 * return the flight number
		 */
		System.out.println(flight.ReturnFlightNo());
		
		/**
		 * return the size of the flight
		 */
		System.out.println(flight.ReturnSize());
		
		/**
		 * return the type of flight
		 */
		System.out.println(flight.ReturnFlightType());
		
		/**
		 * return the destination
		 */
		System.out.println(flight.ReturnDestination());
		
		/**
		 * return the departure date
		 */
		System.out.println(flight.ReturnDepDate());
	}

}
