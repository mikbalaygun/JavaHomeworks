package hmw4_3.Concretes;

import hmw4_3.Abstracts.CampaignService;
import hmw4_3.Entities.Campaign;
import hmw4_3.Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void createCampaign(Game[] games, Campaign campaign) {
			for(Game game:games) {
				game.setPrice(game.getPrice()-((game.getPrice()*campaign.getCampaignPercent())/100));
				System.out.println(campaign.getId()+" id'li kampanya dahilinde oyunda %"+campaign.getCampaignPercent()+"'luk bir kampanya uygulanmistir");
			}
	}

	
	
}
