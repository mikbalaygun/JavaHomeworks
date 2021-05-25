package hmw4_2;

import java.time.LocalDate;

import hmw4_2.Abstract.BaseCustomerManager;
import hmw4_2.Abstract.CustomerCheckService;
import hmw4_2.Concrete.CustomerCheckManager;
import hmw4_2.Concrete.NeroCustomerManager;
import hmw4_2.Concrete.StarbucksCustomerManager;
import hmw4_2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CustomerCheckService checkService = new CustomerCheckManager();
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(checkService);
		
		Customer customer1 = new Customer(1,"Muhammed","Aygun",LocalDate.of(2004, 11, 23),"12345665432");
		customerManager.save(customer1);
	}

}
