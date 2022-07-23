package workshop1;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

	public void add(Category category) 
	{
		System.out.println("Kategori eklendi : " + category.getCategoryName());
	}
	
	public void update(Category category) 
	{
		System.out.println("Kategori güncellendi : " + category.getCategoryName());
	}
	
	public void delete(Category category) 
	{
		System.out.println("Kategori silindi : " +category.getCategoryName());
	}
	
	public List<Category> getAll() 
	{
		return new ArrayList<Category>();
	}
}
