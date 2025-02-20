package abstracts;

import entities.GameCampaign;


public interface GameCampaignService {
	
	void add(GameCampaign GameCampaign);

	void save(GameCampaign GameCampaign);

	void delete(GameCampaign GameCampaign);

	void update(GameCampaign GameCampaign);
}
