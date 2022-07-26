package telcoProject;

import java.util.List;

public class Service {
	
	private int id;
	private String name;
	private Invoice invoice;
	private List<Subscription> subscriptions;
	
	public Service() 
	{
		
		
	}

	public Service(int id, String name, Invoice invoice, List<Subscription> subscriptions) {
		super();
		this.id = id;
		this.name = name;
		this.invoice = invoice;
		this.subscriptions = subscriptions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}


	
	
	
}
