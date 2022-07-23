package oop2;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer();
		customer1.setFirstName("mert");
		customer1.setLastName("yýlmaz");
		customer1.setId(1);
		
		Logger[] loggers = {new CloudLogger(), new DatabaseLogger(), new ElasticLogger()};
		EmployeeManager employeeManager = new EmployeeManager(loggers);
		employeeManager.add(customer1);
			
	}

}
