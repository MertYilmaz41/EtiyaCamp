package javaKampDay4.Business.Abstract;

import javaKampDay4.Entities.Concrete.Gamer;

public interface GamerService {
	void signUp(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
