package kodlamaIODemo.entities;

public class Course {
	private String courseName;
	private int id;
	private double unitPrice;

	
	public Course () {
		
	}

	public Course (String courseName, int id, double unitPrice) {
		super();
		this.courseName = courseName;
		this.id = id;
		this.unitPrice = unitPrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}

