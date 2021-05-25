package hmw4_2.Concrete;

import hmw4_2.Abstract.CustomerCheckService;
import hmw4_2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Boolean checkIfRealPerson(Customer customer) {
		
		return false;
		
		
	}

}
