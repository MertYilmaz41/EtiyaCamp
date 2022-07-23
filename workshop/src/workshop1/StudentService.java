package workshop1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

	public void add(Student student) 
	{
		System.out.println("��renci eklendi : " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void update(Student student) 
	{
		System.out.println("��renci g�ncellendi : " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void delete(Student student) 
	{
		System.out.println("��renci silindi : " + student.getFirstName() + " " + student.getLastName());
	}
	
	public List<Student> getAll() 
	{
		return new ArrayList<Student>();
	}
}
