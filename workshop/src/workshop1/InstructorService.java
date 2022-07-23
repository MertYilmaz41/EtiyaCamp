package workshop1;

import java.util.ArrayList;
import java.util.List;

public class InstructorService {
	
	public void add(Instructor instructor) 
	{
		System.out.println("E�itmen eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void update(Instructor instructor) 
	{
		System.out.println("E�itmen g�ncellendi : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void delete(Instructor instructor) 
	{
		System.out.println("E�itmen silindi : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public List<Instructor> getAll() 
	{
		return new ArrayList<Instructor>();
	}
}
