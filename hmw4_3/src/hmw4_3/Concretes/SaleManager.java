package hmw4_3.Concretes;

import hmw4_3.Abstracts.CampaignService;
import hmw4_3.Abstracts.SaleService;
import hmw4_3.Entities.Campaign;
import hmw4_3.Entities.Customer;
import hmw4_3.Entities.Game;

public class SaleManager implements SaleService {
	
	CampaignService campaignService;
	Campaign campaign;
	int total;
	
	public SaleManager() {
		
	}
	
	public SaleManager(Campaign campaign,CampaignService campaignService) {
		this.campaign = campaign;
		this.campaignService = campaignService;
	}

	@Override
	public void sale(Customer customer, Game[] games) {
		if(campaign != null) {
			this.campaignService.createCampaign(games, this.campaign);
			for(Game game:games) {
				total += game.getPrice();
				System.out.println(game.getName()+" adli oyun "+campaign.getCampaignName()+" adli kampanya ile %"+campaign.getCampaignPercent()+" indirime ugramistir");
				System.out.println(game.getName()+": "+game.getPrice());
			}
			System.out.println(customer.getFirstName()+" , toplam borcunuz: "+total);
		}else {
			for(Game game:games) {
				total += game.getPrice();
				System.out.println(game.getName()+" adli oyun: fiyati "+game.getPrice());
			}
			System.out.println(customer.getFirstName()+" , toplam borcunuz: "+total);
		}
		
		
	}

	
}
