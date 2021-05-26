package hmw4_3;

import java.time.LocalDate;

import hmw4_3.Abstracts.CampaignService;
import hmw4_3.Abstracts.CustomerCheckService;
import hmw4_3.Abstracts.SaleService;
import hmw4_3.Concretes.CampaignManager;
import hmw4_3.Concretes.CustomerCheckManager;
import hmw4_3.Concretes.CustomerManager;
import hmw4_3.Concretes.SaleManager;
import hmw4_3.Entities.Campaign;
import hmw4_3.Entities.Customer;
import hmw4_3.Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1,"Raft",31);
		Game game2 = new Game(2,"Rust",50);
		Game game3 = new Game(3,"GTA5",90);
		
		Game[] games = {game1,game2,game3};
		
		Customer customer1 = new Customer(1,"Ahmet","Aydin",LocalDate.of(1993, 2, 12),"123456789100");
		Customer customer2 = new Customer(2,"Mehmet","Gul",LocalDate.of(1985, 11, 23),"567891234500");
		
		
		Campaign campaign1 = new Campaign(1,"SummerTime Campaign",20);
		Campaign campaign2 = new Campaign(2,"SpringTime Campaign",18);
		
		CampaignService campaignManager = new CampaignManager();
		
		SaleService saleService = new SaleManager(campaign1, campaignManager);
		
		saleService.sale(customer1, games);
		
		System.out.println("-----------------------------------------");
		
		CustomerCheckService customerCheckService = new CustomerCheckManager();
		
		CustomerManager customerManager = new CustomerManager(customerCheckService);
		
		customerManager.add(customer1);
		customerManager.add(customer2);
		customerManager.delete(customer2);
		
		
	}

}
