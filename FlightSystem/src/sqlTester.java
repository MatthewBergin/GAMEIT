/**ShaunMcFadden_L0011443

 * 
 * @author Shaun McFadden
 *Devops
 *Database Class
 */
import java.sql.*;

public class sqlTester {
	/**
	 * Variables
	 */
	Booking booking;
	Customer customer;
	Flight flight;
	
	/**
	 * SQL Constructor
	 */
	public sqlTester()
	{
		/**
		 * begin of try catch
		 */
		try 
		{
			/**
			 * import the needed data and connect to the database
			 */
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightdb", "root", "password");
			/**
			 * create a new statement
			 */
			Statement stmt = con.createStatement();
			/**
			 * select from the ticket table
			 */
			ResultSet rs = stmt.executeQuery("select * from ticket");

			System.out.println("Database Records: ");
			/**
			 * step through the ticket table contents
			 */
			while(rs.next())
				//System.out.println("TicketId: " + rs.getInt(1) + " Date: " + rs.getDate(2) + " Flight Type: " + rs.getString(3) + " Price: " + rs.getDouble(4) + " Seat Number: " + rs.getInt(5));
				booking = new Booking(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getDouble(4),  rs.getInt(5));
			con.close();
				/**
				 * catch any exceptions
				 */
		}catch(Exception e) { System.out.println(e);}
		System.out.println(booking.toString());
		
		
		try 
		{
			/**
			 * import the needed data and connect to the database
			 */
			Class.forName("com.mysql.jdbc.Driver");
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightdb", "root", "password");
			/**
			 * create a new statement
			 */
			Statement stmt2 = con2.createStatement();
			/**
			 * select from the customer table
			 */
			ResultSet rs2 = stmt2.executeQuery("select * from customer");
			System.out.println("Database Records: ");
			/**
			 * step through the customer table contents 
			 */
			while(rs2.next())
				customer = new Customer(rs2.getInt(1), rs2.getString(2), rs2.getString(3), rs2.getString(4), rs2.getString(5) ,rs2.getString(6) , rs2.getInt(7),  rs2.getInt(8));
			con2.close();
			
	
		}catch(Exception e) { System.out.println(e);}
		System.out.println(customer.toString());
		
		try 
		{
			/**
			 * import the needed data and connect to the database
			 */
			Class.forName("com.mysql.jdbc.Driver");
			Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightdb", "root", "password");
			/**
			 * create a new statement
			 */
			Statement stmt3 = con3.createStatement();
			/**
			 * select the flight table
			 */
			ResultSet rs3 = stmt3.executeQuery("select * from flight");
			System.out.println("Database Records: ");
			/**
			 * step through the flight table contents
			 */
			while(rs3.next())
				flight = new Flight(rs3.getInt(1), rs3.getInt(2), rs3.getString(3), rs3.getString(4), rs3.getDate(5), rs3.getDate(6), rs3.getInt(7), rs3.getInt(8));
			con3.close();
			
	
		}catch(Exception e) { System.out.println(e);}
		System.out.println(flight.toString());
	}

}
