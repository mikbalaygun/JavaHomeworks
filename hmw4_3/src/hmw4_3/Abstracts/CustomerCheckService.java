package hmw4_3.Abstracts;

import hmw4_3.Entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);
}
