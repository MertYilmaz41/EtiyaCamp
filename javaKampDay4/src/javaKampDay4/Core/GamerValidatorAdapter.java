package javaKampDay4.Core;

import javaKampDay4.Utilities.jGamerValidator;

public class GamerValidatorAdapter implements ValidatorService{

	@Override
	public boolean Validate(String firstName, String lastName, int yearOfBirth, String nationalityId) {
		jGamerValidator jGamerValidator = new jGamerValidator();
		jGamerValidator.isPersonReal();
		return true;
		
	}

}
