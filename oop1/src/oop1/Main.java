package oop1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Meyve");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yemek");
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Elma");
		product1.setUnitPrice(50);
		product1.setCategory(category1);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Kuru Fasulye");
		product2.setUnitPrice(60);
		product2.setCategory(category2);
		
		System.out.println(product1.getName());
		System.out.println(product1.getUnitPrice());
		System.out.println(product1.getDiscountedPrice());
		System.out.println(product1.getCategory().getName());
		
		ProductService productService = new ProductService();
		productService.add(product2);
	}

}

