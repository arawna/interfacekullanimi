package gercekhayatinterface;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return customer.getNationalityId().length()==11;
	}

}
