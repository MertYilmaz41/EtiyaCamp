package javaKampDay5.dataAccess.abstracts;

import javaKampDay5.Entities.Concretes.User;

public interface UserDao {
	void signUp(User user);
	void update(User user);
	void delete(User user);
	
}
