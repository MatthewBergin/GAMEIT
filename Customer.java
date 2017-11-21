/**ShaunMcFadden_L0011443

 * 
 * @author Shaun McFadden
 *Devops
 *Customer Class
 */
public class Customer {
	String Fname, Lname;
	String Address, PhoneNo;
	int CreditCardNo;
	
	/**
	 * 
	 * @param fname
	 * @param lname
	 * @param address
	 * @param phoneNum
	 * @param credNo
	 */
	
	/**
	 * 
	 *Customer Constructor
	 *And all parameters
	 */
	public Customer(String fname, String lname, String address, String phoneNum, int credNo)
	{
		Fname = fname;
		Lname = lname;
		Address = address;
		PhoneNo = phoneNum; 
		CreditCardNo = credNo;
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
		return Address;
	}
	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address)
	{
		Address = address;
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
	 * 
	 * @param number
	 */
	public void setPhoneNo(String number)
	{
		PhoneNo = number;
	}
	/**
	 * 
	 * @return Credit card No
	 */
	public int getCreditNo()
	{
		return CreditCardNo;
	}
	
	public String toString()
	{
		return ("Fullname - " + Fname + Lname + " Address - " + Address + " PhoneNo - " + PhoneNo + " Credit Card Number - " + CreditCardNo);
	
	}
}

