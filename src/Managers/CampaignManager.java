package Managers;

import Entities.Campaign;
import Services.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası eklendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası güncellendi");
		
	}

	@Override
	public Campaign get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Campaign[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
