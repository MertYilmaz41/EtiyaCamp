package kodlamaioDbWorkshop.entities.BaseClasses;

public class Canal {

	 private int id;
	    private String name;

	    public Canal() {
	    }

	    public Canal(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
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
}
