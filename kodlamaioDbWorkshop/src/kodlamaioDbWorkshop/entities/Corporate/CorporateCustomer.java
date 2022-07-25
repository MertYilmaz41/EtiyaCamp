package kodlamaioDbWorkshop.entities.Corporate;

import kodlamaioDbWorkshop.entities.BaseClasses.Canal;
import kodlamaioDbWorkshop.entities.BaseClasses.Customer;

public class CorporateCustomer extends Customer{
	
	private String title;
	private String taxNo;

	
	public CorporateCustomer() 
	{
		
	}


	public CorporateCustomer(int id, String customerNo, Canal canal, String title, String taxNo) {
		super(id, customerNo, canal);
		this.title = title;
		this.taxNo = taxNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getTaxNo() {
		return taxNo;
	}


	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}




	




	
	
	



	
	
	
	
}
