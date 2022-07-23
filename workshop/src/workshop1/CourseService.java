package workshop1;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

	public void add(Course course) 
	{
		System.out.println("Kurs eklendi : " + course.getCourseName());
	}
	
	public void update(Course course) 
	{
		System.out.println("Kurs güncellendi : " + course.getCourseName());
	}
	
	public void delete(Course course) 
	{
		System.out.println("Kurs silindi : " +course.getCourseName());
	}
	
	public List<Course> getAll() 
	{
		return new ArrayList<Course>();
	}
}
