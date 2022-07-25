package workshop2.core.concretes;

import workshop2.core.abstracts.EmailService;
import workshop2.entities.concretes.User;


public class EmailManager implements EmailService{

	@Override
	public void sendNotification(User user) {
		
		System.out.println("Email yollandý");
		
	}

	@Override
	public void forgotPassword(User user) 
	{
		
		System.out.println(user.getEmail() + " : Þu adrese þifre yenileme maili yollandý.");
		
	}



}
