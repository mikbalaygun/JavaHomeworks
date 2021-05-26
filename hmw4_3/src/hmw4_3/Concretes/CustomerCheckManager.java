package hmw4_3.Concretes;

import hmw4_3.Abstracts.CustomerCheckService;
import hmw4_3.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getSigned()) {
			return true;
		}else {
			return false;
		}
	}
	
}
