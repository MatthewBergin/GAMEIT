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
		System.out.println(customer.toString());
		/**
		 * Return name
		 */
		System.out.println(customer.getName());
		/**
		 * get and set address
		 */
		System.out.println(customer.getAddress());
		customer.setAddress("letterkenny");
		System.out.println(customer.getAddress());
		/**
		 * get and set phone number
		 */
		System.out.println(customer.getPhoneNo());
		customer.setPhoneNo("187987236");
		System.out.println(customer.getPhoneNo());
		/**
		 * get credit card number
		 */
		System.out.println(customer.getCreditNo());
		/**
		 * return all info
		 */
		System.out.println(customer.toString());
	}

}
