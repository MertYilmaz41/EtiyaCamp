package kodlamaioDbWorkshop.entities.BaseClasses;

public class Union extends Customer{
	 private String name;
	 
	 public Union(String name) 
	 {
		 this.name = name;
	 }
	 
	public Union(int id, String customerNo, Canal canal, String name) {
		super(id, customerNo, canal);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	 
}
