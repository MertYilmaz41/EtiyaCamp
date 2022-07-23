package javaKampDay5.core;

import javaKampDay5.Google.jGoogle;

public class jGoogleServiceAdapter implements ISignUpService{

	@Override
	public void signUp() {
		jGoogle google = new jGoogle();
		google.signWithGoogle();
	
	}

}
