package javaKampDay5.core;

public class EmailSenderManager implements IEmailSender{

	@Override
	public void sendVerifyEmail() 
	{
		System.out.println("Doðrulama e-postasý yollandý.");
	}

	@Override
	public void isEmailClicked() 
	{
		System.out.println("Doðrulama e-postasýna týklandý ve kayýt tamamlandý.");
	}

	@Override
	public void signUpIsFail() 
	{
		System.out.println("Kayýt olma baþarýsýz.");
	}

}
