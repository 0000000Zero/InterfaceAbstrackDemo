
public class Main {

	public static void main(String[] args) 
	{
//		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		
		customer.setId(1);
		customer.setFirstName("0000000");
		customer.setLastName("Zero");
		customer.setCity("Ankara");
		
		customerManager.save(customer);
		
		
	}

}
