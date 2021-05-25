package hmw4_2.Concrete;

import hmw4_2.Abstract.BaseCustomerManager;
import hmw4_2.Abstract.CustomerCheckService;
import hmw4_2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService; 
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("not valid person");
		}
	}
	
}
