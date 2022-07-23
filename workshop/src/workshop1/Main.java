package workshop1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
        course1.setId(1);
        course1.setCourseName("Java Programlama");
        course1.setDescription("java SE ve EE içerir");
        course1.setPictureUrl("deneme.jpg");
        
        
        Course course2 = new Course();
        course2.setId(1);
        course2.setCourseName("C++ Programlama");
        course2.setDescription("C dilini OOP dahil olarak içerir");
        course2.setPictureUrl("arjuvak.jpg");
        
        List<Course> courses = new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);
        
        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("Mert");
        instructor1.setLastName("Yýlmaz");
        instructor1.setDescription("Çok iyi bir hoca");
        instructor1.setCourses(courses);
        
        course1.setInstructor(instructor1);
        
        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setFirstName("Mert");
        instructor2.setLastName("Aktaþ");
        instructor2.setDescription("Çok iyi bir hoca");
        instructor2.setCourses(courses);
        
        course2.setInstructor(instructor2);
        
        Instructor instructor3 = new Instructor();
        instructor3.setId(3);
        instructor3.setFirstName("Ýlker");
        instructor3.setLastName("Kaya");
        instructor3.setDescription("Kötü bir hoca");
        instructor3.setCourses(courses);
        
        Category category1 = new Category();
        category1.setId(1);
        category1.setCategoryName("Programlama");
        category1.setDescription("Kod yazdýðýmýz bir alan");
        
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Göksel");
        student1.setLastName("Doðan");
        student1.setCourse(course1);
        student1.setDescription("Çok azimli bir öðrenci");
        
        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Görkem");
        student2.setLastName("Doðan");
        student2.setCourse(course2);
        student2.setDescription("Çok çalýþkan bir öðrenci");
        
        InstructorService instructorService = new InstructorService();
        CategoryService categoryService = new CategoryService();
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        
        instructorService.add(instructor1);
        categoryService.add(category1);
        studentService.add(student1);
        courseService.add(course1);
        
        
           
	}

}
