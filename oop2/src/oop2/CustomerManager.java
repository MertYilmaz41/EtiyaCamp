package oop2;

public class CustomerManager {
	
	private Logger logger;
	
	
	public CustomerManager(Logger logger ) 
	{
		super();
		this.logger = logger;
	}
	
	public void add(Customer customer) 
	{
		System.out.println("Customer added");
		
		this.logger.log(customer.getFirstName());
	}
	
	public void update(Customer customer) 
	{
		System.out.println("Customer updated");
		this.logger.log(customer.getFirstName());
	}
}

//User,id,firstName,notificationMethod
//UserList
//user register
//email,sms
//user decides which notification method to be used
//UserManager, register, forgotPassword