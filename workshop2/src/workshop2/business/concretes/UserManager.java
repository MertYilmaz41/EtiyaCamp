package workshop2.business.concretes;

import java.util.ArrayList;
import java.util.List;

import workshop2.business.abstracts.UserService;
import workshop2.core.abstracts.NotificationService;
import workshop2.entities.concretes.User;

public class UserManager implements UserService{
	List<User> users = new ArrayList<User>();
	NotificationService notificationService;
	
	
	public UserManager(NotificationService notificationService) 
	{
		this.notificationService = notificationService;
	}

	@Override
	public void register(User user) {
		this.users.add(user);
		this.notificationService.sendNotification(user);
		System.out.println("Kayýt tamamlandý");
		
	}

	@Override
	public void forgotPassword(User user) 
	{
		this.notificationService.forgotPassword(user);
		System.out.println("Þifre deðiþtirme tamamlandý.");
		
	}

	

	
}
