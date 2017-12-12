/**ShaunMcFadden_L0011443

 * 
 * @author Shaun McFadden
 *Devops
 *Customer Class
 */

public class Customer {
	String Fname, Lname;
	String street, town, county;
	int creditCardNo, passportNo, PhoneNo;
	
	/**
	 * 
	 * @param fname
	 * @param lname
	 * @param street
	 * @param town
	 * @param county
	 * @param phoneNum
	 * @param creditCardNo
	 * @param passportNo
	 * @param PhoneNo
	 */
	
	/**
	 * 
	 *Customer Constructor
	 *And all parameters
	 */
	public Customer(int passportNo, String fname, String lname, String street, String town, String county, int phoneNum, int credNo)
	{
		this.passportNo = passportNo;
		Fname = fname;
		Lname = lname;
		this.street = street;
		this.town = town;
		this.county = county;
		PhoneNo = phoneNum; 
		creditCardNo = credNo;
	}
	/**
	 * 
	 * @return name
	 */
	public String getName()
	{
		return (Fname + Lname);
	}
	/**
	 * 
	 * @return address
	 */
	public String getAddress()
	{
		return (street + town + county);
	}
	/**
	 * set the address
	 * @param address
	 */
	public void setAddress(String street, String town, String county)
	{
		this.street = street;
		this.town = town;
		this.county = county;
	}
	/**
	 * 
	 * @return phone number
	 */
	public int getPhoneNo()
	{
		return PhoneNo;
	}
	/**
	 * Set the phone number
	 * @param number
	 */
	public void setPhoneNo(int number)
	{
		PhoneNo = number;
	}
	/**
	 * 
	 * @return Credit card No
	 */
	public int getCreditNo()
	{
		return creditCardNo;
	}
	/**
	 * return all details
	 */
			
	public String toString()
	{
		return ("Fullname - " + Fname + Lname + " Address - " + street + " " + town + " " + county + " PhoneNo - " + PhoneNo + " Credit Card Number - " + creditCardNo);
	
	}
}
