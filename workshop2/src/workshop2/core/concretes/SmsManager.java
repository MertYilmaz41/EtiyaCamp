package workshop2.core.concretes;

import workshop2.core.abstracts.SmsService;
import workshop2.entities.concretes.User;

public class SmsManager implements SmsService{

	@Override
	public void sendNotification(User user) {
		
		System.out.println("Sms yolland�");
		
	}

	@Override
	public void forgotPassword(User user) {
		
		System.out.println(user.getPhoneNumber() + " : �u numaraya �ifre yenileme mesaj� yolland�.");
		
	}

}
