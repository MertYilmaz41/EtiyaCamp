package oop1;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	public void add(Product product) 
	{
		System.out.println("Ürün eklendi: " + product.getName());
	}
	
	public void update(Product product) 
	{
		System.out.println("Ürün güncellendi: " + product.getName());
	}
	
	public void delete(Product product) 
	{
		System.out.println("Ürün silindi: " + product.getName());
	}
	
	public List<Product> getAll() 
	{
		return new ArrayList<Product>();
	}
}
