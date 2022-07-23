package oop2;



public class EmployeeManager {
	
	private Logger[] loggers;
	
	public EmployeeManager(Logger[] loggers) 
	{
		this.loggers = loggers;
	}
	
	public void add(Customer customer) 
	{
		System.out.println("Customer added");
		for (Logger logger : loggers) {
			logger.log("eklendi.");
		}
		
	}
	
	public void update(Customer customer) 
	{
		System.out.println("Customer updated");
		
	}
	
}
	

