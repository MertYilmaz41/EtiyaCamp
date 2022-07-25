package kodlamaioDbWorkshop.entities.BaseClasses;

import java.time.LocalDate;

import kodlamaioDbWorkshop.entities.Individual.IndividualCustomer;

public class FinancialAction {

    private int id;
    private IndividualCustomer individualCustomer;
    private LocalDate dateOfStart;
    
    
   
	public FinancialAction() 
	{
		
	}


	public FinancialAction(int id, IndividualCustomer individualCustomer, LocalDate dateOfStart) {
		
		this.id = id;
		this.individualCustomer = individualCustomer;
		this.dateOfStart = dateOfStart;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public IndividualCustomer getIndividualCustomer() {
		return individualCustomer;
	}


	public void setIndividualCustomer(IndividualCustomer individualCustomer) {
		this.individualCustomer = individualCustomer;
	}


	public LocalDate getDateOfStart() {
		return dateOfStart;
	}


	public void setDateOfStart(LocalDate dateOfStart) {
		this.dateOfStart = dateOfStart;
	}

    
    
}
