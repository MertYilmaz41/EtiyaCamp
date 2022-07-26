package telcoProject;

import java.util.Date;
import java.util.List;

public class Subscription {
	
	private int id;
	private Date dateStarted;
	private Service service;
	private List<Customer> customers;
	private List<Invoice> invoices;
	
	
	public Subscription() 
	{
		
	}


	public Subscription(int id, Date dateStarted, List<Customer> customers, Service service, List<Invoice> invoices) {
		super();
		this.id = id;
		this.dateStarted = dateStarted;
		this.customers = customers;
		this.service = service;
		this.invoices = invoices;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDateStarted() {
		return dateStarted;
	}


	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}


	public List<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}


	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	}


	public List<Invoice> getInvoices() {
		return invoices;
	}


	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}



	

	
	
	
	

	
}
