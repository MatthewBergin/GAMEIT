/**ShaunMcFadden_L0011443

 * 
 * @author Shaun McFadden
 *Devops
 *Flight Class
 */
import java.util.*;
public class Flight {
	int flightNo, size, maxBaggage, seatnum;
	String flightType, destination;
	Date depDate, arrDate;
	/**
	 * 
	 * @param flightNo
	 * @param size
	 * @param flightType
	 * @param destination
	 * @param depDate
	 * @param arrDate
	 * @param maxBaggage
	 * @param seatnum
	 */
	
	/**
	 * Flight Constructor
	 * enter all parameters
	 */
	public Flight(int flightNo, int size, String flightType, String destination, Date depDate, Date arrDate, int maxBaggage, int seatnum) {
		this.flightNo = flightNo;
		this.size = size;
		this.flightType = flightType;
		this.destination = destination;
		this.depDate = depDate;
		this.arrDate = arrDate;
		this.maxBaggage = maxBaggage;
		this.seatnum = seatnum;
	}
	/**
	 * 
	 * @return flightNo
	 */
	public int ReturnFlightNo()
	{
		return flightNo;
	}
	/**
	 * 
	 * @return size
	 */
	public int ReturnSize()
	{
		return size;
	}
	/**
	 * 
	 * @return flightType
	 */
	public String ReturnFlightType()
	{
		return flightType;
	}
	/**
	 * 
	 * @return destination
	 */
	public String ReturnDestination()
	{
		return destination;
	}
	/**
	 * 
	 * @return depDate
	 */
	public Date ReturnDepDate()
	{
		return depDate;
	}
	/**
	 * return all details
	 */
	public String toString()
	{
		return ("Flight Number: " + flightNo + " Size: " + size + " Flight Type: " + flightType + " Destination: " + destination + " Departure Date: " + depDate + " Arrival Date: " + arrDate + " Max Baggage: " + maxBaggage + "Seat Number: " + seatnum);
	}
}
