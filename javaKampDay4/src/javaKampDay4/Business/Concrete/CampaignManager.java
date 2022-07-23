package javaKampDay4.Business.Concrete;


import javaKampDay4.Business.Abstract.CampaignService;
import javaKampDay4.Entities.Concrete.Campaign;


public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign)
	{
		System.out.println("Kampya sisteme eklendi.");
	}

	@Override
	public void update(Campaign campaign) 
	{
		System.out.println("Kampya güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) 
	{
		System.out.println("Kampanya sistemden silindi.");
	}

	public void activateCampaign() 
	{
		System.out.println("Kampanya aktifleþtirildi.");
	}
}
