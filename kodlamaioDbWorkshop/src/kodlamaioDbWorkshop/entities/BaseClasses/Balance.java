package kodlamaioDbWorkshop.entities.BaseClasses;

import java.util.Date;

public class Balance {
	
	private int id;
	private int customerId;
	private Date date;
	private double amount;
	
	
	public Balance() 
	{

	}


	public Balance(int id, int customerId, Date date, double amount) {
		this.id = id;
		this.customerId = customerId;
		this.date = date;
		this.amount = amount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public Date getDateOfStart() {
		return date;
	}


	public void setDateOfStart(Date date) {
		this.date = date;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}



	
	
	
}
