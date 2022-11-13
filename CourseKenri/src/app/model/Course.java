package app.model;

public class Course {
	public int CourseID;
	public String coursName;
	public int fee;
	public String description;
	public Course(String coursName, int fee, String description) {
		super();
		this.coursName = coursName;
		this.fee = fee;
		this.description = description;
	}
	public Course(int courseID, String coursName, int fee, String description) {
		super();
		CourseID = courseID;
		this.coursName = coursName;
		this.fee = fee;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [CourseID=" + CourseID + ", coursName=" + coursName + ", fee=" + fee + ", description="
				+ description + "]";
	}
	
	
	
}
