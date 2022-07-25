package kodlamaioDbWorkshop.entities.BaseClasses;

import java.util.Date;

public class Balance {
	
	private int id;
	private int customerId;
	private Date dateOfStart;
	private double amount;
	
	
	public Balance() 
	{

	}


	public Balance(int id, int customerId, Date dateOfStart, double amount) {
		this.id = id;
		this.customerId = customerId;
		this.dateOfStart = dateOfStart;
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
		return dateOfStart;
	}


	public void setDateOfStart(Date dateOfStart) {
		this.dateOfStart = dateOfStart;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}



	
	
	
}
