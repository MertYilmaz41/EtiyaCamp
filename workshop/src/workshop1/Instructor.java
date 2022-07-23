package workshop1;

import java.util.List;

public class Instructor {

	 public Instructor() {
	    }

	    public Instructor(int id, String firstName, String lastName, String description, List<Course> courses) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.description = description;
	        this.courses = courses;
	    }

	    private int id;
	    private String firstName;
	    private String lastName;
	    private String description;
	    private List<Course> courses;

	    public int getId() {
	        return id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public List<Course> getCourses() {
	        return courses;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public void setCourses(List<Course> courses) {
	        this.courses = courses;
	    }
}
