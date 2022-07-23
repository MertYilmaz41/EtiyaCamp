package javaKampDay4.Business.Concrete;


import javaKampDay4.Business.Abstract.GamerService;
import javaKampDay4.Core.ValidatorService;
import javaKampDay4.Entities.Concrete.Gamer;


public class GamerManager implements GamerService{
	private ValidatorService validatorService;
	
	public GamerManager(ValidatorService validatorService) 
	{
		this.validatorService = validatorService;
	}

	
	@Override
	public void signUp(Gamer gamer) 
	{	
		isGamerValid(gamer);
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "  : " + "oyuncu sisteme kayýt oldu.");
	}

	@Override
	public void update(Gamer gamer) 
	{
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "  : " + "oyuncu hesabýný güncelledi.");
	}

	@Override
	public void delete(Gamer gamer) 
	{
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "  : " + "oyuncu hesabýný sildi.");
	}

	
	private void isGamerValid(Gamer gamer) 
	{
		if(validatorService.Validate(gamer.getFirstName(), gamer.getLastName(), gamer.getYearOfBirth(), gamer.getNationalityId())==true) 
		{
			System.out.println("Oyuncu doðrulandý.");
		}
		else 
		{
			System.out.println("Oyuncu doðrulanamadý.");
		}
	}
}
