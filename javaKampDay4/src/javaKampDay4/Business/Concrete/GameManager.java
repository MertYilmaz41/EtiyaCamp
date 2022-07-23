package javaKampDay4.Business.Concrete;


import javaKampDay4.Business.Abstract.CampaignService;
import javaKampDay4.Business.Abstract.GameService;
import javaKampDay4.Entities.Concrete.Game;


public class GameManager implements GameService{

	private CampaignService campaignService;
	
	public GameManager(CampaignService campaignService) 
	{
		this.campaignService = campaignService;
	}
	
	public void add(Game game) 
	{
		System.out.println("Sisteme yeni oyun eklendi : " + game.getName());
	}
	
	public void update(Game game) 
	{
		System.out.println("Sistemdeki oyun güncellendi : " + game.getName());
	}

		public void update(Game game) 
	{
		System.out.println("Sistemdeki oyun silindi : " + game.getName());
	}
	
	@Override
	public void sell(Game game) 
	{
		this.campaignService.activateCampaign();
		System.out.println(game.getName() + " :" + " Oyun satýþý gerçekleþtirildi.");
	}

}
