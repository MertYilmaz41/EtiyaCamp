package workshop1;

public class Course {

	 public Course() {
	    }

	    public Course(int id, String courseName, String pictureUrl, String description, Category category, Student student) {
	        this.id = id;
	        this.courseName = courseName;
	        this.pictureUrl = pictureUrl;
	        this.description = description;
	        this.category = category;
	        this.student = student;
	    }

	    private int id;
	    private String courseName;
	    private String pictureUrl;
	    private String description;
	    private Category category;
	    private Student student;
	    private Instructor instructor;


		public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }

	    public String getPictureUrl() {
	        return pictureUrl;
	    }

	    public void setPictureUrl(String pictureUrl) {
	        this.pictureUrl = pictureUrl;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public Category getCategory() {
	        return category;
	    }

	    public void setCategory(Category category) {
	        this.category = category;
	    }

	    public Student getStudent() {
	        return student;
	    }

	    public void setStudent(Student student) {
	        this.student = student;
	    }
	    
	    public Instructor getInstructor() {
			return instructor;
		}

		public void setInstructor(Instructor instructor) {
			this.instructor = instructor;
		}
}
