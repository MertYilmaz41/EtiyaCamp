package workshop2.entities.concretes;

import workshop2.entities.abstracts.Entity;

public class User implements Entity{
	int id;
	String firstName;
	String lastName;
	String email;
	String password;
	String phoneNumber;
	
	public User() 
	{
		
	}
	
	public User(int id, String firstName, String email, String password, String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	
	
}

