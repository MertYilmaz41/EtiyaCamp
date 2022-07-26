package telcoProject;

import java.util.Date;

public class Invoice {
	
	private int id;
	private Customer customer;
	private Subscription subscription;
	private Date dateCreated;
	private Date dueDate;
	
	
	public Invoice() 
	{
		
	}


	public Invoice(int id, Customer customer, Subscription subscription, Date dateCreated, Date dueDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.subscription = subscription;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Subscription getSubscription() {
		return subscription;
	}


	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	
	
	
	
	
}
