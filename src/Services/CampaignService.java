package Services;

import Entities.Campaign;

public interface CampaignService {
	
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	Campaign get();
	Campaign[] getAll();
	
}
