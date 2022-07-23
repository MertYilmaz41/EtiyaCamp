package javaKampDay4.Business.Abstract;

import javaKampDay4.Entities.Concrete.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void activateCampaign();
}
