/**ShaunMcFadden_L0011443

 * 
 * @author Shaun McFadden
 *Devops
 *Customer Class
 */

public class Customer {
	String Fname, Lname;
	String street, town, county, creditCardNo,PhoneNo;
	int  passportNo;
	
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
	public Customer(int passportNo, String fname, String lname, String street, String town, String county, String phoneNum, String credNo)
	{
		try
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
		catch(Exception e) {System.out.print(e); }
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
		try {
		this.street = street;
		this.town = town;
		this.county = county;
		}
		catch(Exception e) {System.out.print(e); }
		
		}
	/**
	 * 
	 * @return phone number
	 */
	public String getPhoneNo()
	{
		return PhoneNo;
	}
	/**
	 * Set the phone number
	 * @param number
	 */
	public void setPhoneNo(String number)
	{
		try
		{
		PhoneNo = number;
		}
		catch(Exception e) {System.out.print(e); }
	}
	/**
	 * 
	 * @return Credit card No
	 */
	public String getCreditNo()
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
