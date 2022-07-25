package workshop2;

import workshop2.business.concretes.UserManager;
import workshop2.core.concretes.EmailManager;
import workshop2.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setEmail("mertylmz2001@gmail.com");
		user.setFirstName("Mert");
		user.setLastName("Yýlmaz");
		user.setPassword("1234");
		user.setPhoneNumber("05554443322");
		
		UserManager userManager = new UserManager(new EmailManager());
		userManager.register(user);
		userManager.forgotPassword(user);
				
		
	}

}
