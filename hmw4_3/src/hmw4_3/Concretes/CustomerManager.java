package hmw4_3.Concretes;

import hmw4_3.Abstracts.CustomerCheckService;
import hmw4_3.Abstracts.CustomerService;
import hmw4_3.Entities.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;
	
	
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" , musteri kaydin tamamlanmistir.iyi eglenceler!!");
		}else {
			System.out.println("not a valid person");
		}
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" , musteri kaydin silinmistir.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" , guncelleme basarili.");
		
	}
	
}
