package oop1;

public class Product {
	public Product() 
	{
		
	}
	
	public Product(int _id, String _name, double _unitPrice) 
	{
		this.id = _id;
		this.name = _name;
		this.unitPrice = _unitPrice;
	}
	
	private int id;
	private String name;
	private double unitPrice;
	private double discountedPrice;
	private Category category;
	
	public int getId() 
	{
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public double getDiscountedPrice() {
		return this.unitPrice - (this.unitPrice * 0.90);
	}
	
}
