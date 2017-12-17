/**ShaunMcFadden_L0011443

 * 
 * @author Shaun McFadden
 *Devops
 *Booking Class
 */
import java.util.Date;

public class Booking {
	int bookingNo, seatnum;
	String flightType;
	Date flightDate;
	double cost;
	/**
	 * 
	 * @param bookingNo
	 * @param flightDate
	 * @param flightType
	 * @param cost
	 * @param seatnum
	 */
	
	/**
	 * 
	 * Booking Constructor
	 * Enter all parameters
	 */
	public Booking(int bookingNo, Date flightDate, String flightType, double cost, int seatnum)
	{
		try {
		this.bookingNo = bookingNo;
		this.flightDate = flightDate;
		this.flightType = flightType;
		this.seatnum = seatnum;
		CalculateCost(flightType);
		}
		catch(Exception e) {System.out.print(e); }
	}
	/**
	 * empty Booking Constructor
	 */
	public Booking()
	{
		
	}
	/**
	 * 
	 * @return bookingNo
	 */
	public int ReturnBookingNo()
	{
		return bookingNo;
	}
	/**
	 * 
	 * @return flightDate
	 */
	public Date ReturnDate()
	{
		return flightDate;
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
	 * Calculate Cost
	 * @param flightType
	 */
	public void CalculateCost(String flightType)
	{
		try
		{
			/**
			 * if business or personal set cost
			 */
		if(flightType.equals("business"))
		{
			this.cost = 2000.00; 
		}
		else if(flightType.equals("personal"))
		{
			this.cost = 4000.00;
		}
		else 
		{
			System.out.println("Incorrect Type");
		}
		}catch(Exception e) { System.out.println("Error null entered: " + e );}
	}
	/**
	 * 
	 * @return cost
	 */
	public double ReturnCost()
	{
		return cost;
	}
	/**
	 * return all details
	 */
	public String toString()
	{
		return ("Booking Number: " + bookingNo + " Flight Date: " + flightDate + " Flight Type: " + flightType + " Cost: " + cost + " SeatNumber: " + seatnum);
	}

}
