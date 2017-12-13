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
		Customer customer = new Customer(12345, "Shaun", "McFadden", "Ashlawn", "Letterkenny", "Domegal","7667878", "125151");
		System.out.println(customer.toString());
		/**
		 * Return name
		 */
		System.out.println(customer.getName());
		/**
		 * get and set address
		 */
		System.out.println(customer.getAddress());
		customer.setAddress("Gortlee", "Letterfrack", "Cork");
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
