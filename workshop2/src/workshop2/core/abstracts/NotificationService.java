package workshop2.core.abstracts;

import workshop2.entities.concretes.User;

public interface NotificationService {
	
	void sendNotification(User user);
	void forgotPassword(User user);
}
