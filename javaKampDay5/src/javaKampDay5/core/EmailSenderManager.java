package javaKampDay5.core;

public class EmailSenderManager implements IEmailSender{

	@Override
	public void sendVerifyEmail() 
	{
		System.out.println("Do�rulama e-postas� yolland�.");
	}

	@Override
	public void isEmailClicked() 
	{
		System.out.println("Do�rulama e-postas�na t�kland� ve kay�t tamamland�.");
	}

	@Override
	public void signUpIsFail() 
	{
		System.out.println("Kay�t olma ba�ar�s�z.");
	}

}
