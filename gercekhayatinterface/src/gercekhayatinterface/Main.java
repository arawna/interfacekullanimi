package gercekhayatinterface;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer(1,"Ali","Hocaoglu",new Date(1995,8,24),"11224458723");
		customerManager.save(customer);

	}

}
