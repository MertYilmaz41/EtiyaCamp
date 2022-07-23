package javaKampDay4.Business.Abstract;

import javaKampDay4.Entities.Concrete.Game;


public interface GameService {
	void sell(Game game);
	void add(Game game);
	void update(Game game);
}
