/**ShaunMcFadden_L0011443

 * 
 * @author Shaun McFadden
 *Devops
 *Booking Class tester
 */
import java.util.*;
public class BookingTester {
	static Date date = new Date();
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * three different booking objects
		 */
		Booking booking1 = new Booking(123, date, "business", 0, 4);
		Booking booking2 = new Booking(333, date, "personal", 0, 3);
		Booking booking3 = new Booking(273, date, "", 0, 2);
		/**
		 * print all three booking objects
		 */
		System.out.println(booking1.toString());
		System.out.println(booking2.toString());
		System.out.println(booking3.toString());
		System.out.println(" ");
		
		/**
		 * return the booking number
		 */
		System.out.println(booking1.ReturnBookingNo());
		/**
		 * return the date
		 */
		System.out.println(booking1.ReturnDate());
		/**
		 * return the type of flight
		 */
		System.out.println(booking1.ReturnFlightType());
		/**
		 * return the cost
		 */
		System.out.println(booking1.ReturnCost());
	}

}
