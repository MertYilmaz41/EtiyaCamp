package workshop2.business.abstracts;

import workshop2.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void forgotPassword(User user);
}
