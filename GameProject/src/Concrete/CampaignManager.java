package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign has been added to the system");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "campaign has been deleted from the system.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign information updated");
	}

}
