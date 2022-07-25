package javaKampDay5;

import javaKampDay5.Entities.Concretes.User;
import javaKampDay5.business.concretes.UserManager;
import javaKampDay5.core.EmailSenderManager;
import javaKampDay5.core.jGoogleServiceAdapter;
import javaKampDay5.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
			
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Mert");
		user1.setLastName("Yýlmaz");
		user1.setEmail("mertylmz2001@gmail.com");
		user1.setPassword("12345");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Baþar");
		user2.setLastName("Abak");
		user2.setEmail("baþarabak2001gmail.com");
		user2.setPassword("123456");
		
		User user3 = new User();
		user3.setId(3);
		user3.setFirstName("Ýlkerlqw");
		user3.setLastName("Kayallewq");
		user3.setEmail("ilkerkaya@gmail.com");
		user3.setPassword("123456");
		
		UserManager userManager = new UserManager(new HibernateUserDao(),new EmailSenderManager(), new jGoogleServiceAdapter());
		userManager.signUp(user3);
		userManager.login(user3);
		

	}

}
