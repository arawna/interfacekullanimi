package gercekhayatinterface;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService;
	
	public NeroCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
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
