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
		runLoggers(customer);
				
	}
	
	public void update(Customer customer) 
	{
		System.out.println("Customer updated");
		
	}
	
	private void runLoggers(Customer customer) 
	{
		for (Logger logger : loggers) {
			logger.log("data");
		}
	}
}
	
//employee classýný açmayý unutma
