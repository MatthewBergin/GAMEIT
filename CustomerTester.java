/*
 * @author ShaunMcFadden
 * Devops
 * Customer Tester
 */
public class CustomerTester {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Create customer object
		 */
		Customer customer = new Customer("Shaun", "McFadden", "Donegal","0987667878", 7265638);
		customer.toString();
		/**
		 * Return name
		 */
		customer.getName();
		/**
		 * get and set address
		 */
		customer.getAddress();
		customer.setAddress("letterkenny");
		customer.getAddress();
		/**
		 * get and set phone number
		 */
		customer.getPhoneNo();
		customer.setPhoneNo("187987236");
		customer.getPhoneNo();
		/**
		 * get credit card number
		 */
		customer.getCreditNo();
		/**
		 * return all info
		 */
		customer.toString();
	}

}

