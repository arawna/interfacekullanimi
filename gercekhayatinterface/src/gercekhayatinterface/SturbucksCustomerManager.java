package gercekhayatinterface;

public class SturbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService;
	
	public SturbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this._customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Geçerli kiþi deðil");
		}
		
	}
	
}
