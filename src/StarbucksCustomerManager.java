
public class StarbucksCustomerManager extends BaseCustomerManager 
{
	
	public StarbucksCustomerManager () 
	{ 
		
	}
	public CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) 
	{
		if(_customerCheckService.CheckIfRealPerson(customer)) 
		{
			System.out.println("Starcucks save kodu ovverride");
			super.save(customer);
		}
		else
		{
			System.out.println("Not a Valid person");
		}
		
		
	}


	
	
	
	
}
