package hmw4_3.Abstracts;

import hmw4_3.Entities.Customer;
import hmw4_3.Entities.Game;

public interface SaleService {
	void sale(Customer customer,Game[] games);
}
