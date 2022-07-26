package kodlamaioDbWorkshop.entities.BaseClasses;

import java.time.LocalDate;
import java.util.List;

import kodlamaioDbWorkshop.entities.Individual.IndividualCustomer;

public class FinancialAction {

    private int id;
    private IndividualCustomer individualCustomer;
    private LocalDate dateOfStart;
    private List<Balance> balances;
    
    
   
	public FinancialAction() 
	{
		
	}


	public FinancialAction(int id, IndividualCustomer individualCustomer, LocalDate dateOfStart,
			List<Balance> balances) {
		super();
		this.id = id;
		this.individualCustomer = individualCustomer;
		this.dateOfStart = dateOfStart;
		this.balances = balances;
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





	public List<Balance> getBalances() {
		return balances;
	}





	public void setBalances(List<Balance> balances) {
		this.balances = balances;
	}






    
    
}
