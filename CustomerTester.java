
public class CustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Shaun", "McFadden", "Donegal","0987667878", 7265638);
		customer.toString();
		
		customer.getName();
		
		customer.getAddress();
		customer.setAddress("letterkenny");
		customer.getAddress();
		
		customer.getPhoneNo();
		customer.setPhoneNo("187987236");
		customer.getPhoneNo();
		
		customer.getCreditNo();
		
		customer.toString();
	}

}
