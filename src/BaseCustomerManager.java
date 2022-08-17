
public abstract class BaseCustomerManager implements CustomerServices
{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Save to Db : " + customer.getFirstName());
	}

}
