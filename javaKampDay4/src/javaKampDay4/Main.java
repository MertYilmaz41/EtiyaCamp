package javaKampDay4;

import javaKampDay4.Business.Concrete.CampaignManager;
import javaKampDay4.Business.Concrete.GameManager;
import javaKampDay4.Business.Concrete.GamerManager;
import javaKampDay4.Core.GamerValidatorAdapter;
import javaKampDay4.Entities.Concrete.Game;
import javaKampDay4.Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Mert");
		gamer1.setLastName("Yýlmaz");
		gamer1.setNationalityId("54070251374");
		gamer1.setYearOfBirth(2001);
		
		GamerManager gamerManager = new GamerManager(new GamerValidatorAdapter());
		gamerManager.signUp(gamer1);
		
		Game game = new Game();
		game.setId(1);
		game.setName("League of Legends");
		game.setPrice(100);
		
		GameManager gameManager = new GameManager(new CampaignManager());
		gameManager.sell(game);

	}

}
