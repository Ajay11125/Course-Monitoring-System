package app.model;

public class Batch {
	public String BatchID;
	public int CourseID;
	public int FacultyID;
	public int NumberOfStudent;
	public String Date;
	public int duration;
	public Batch(String batchID, int courseID, int facultyID, int numberOfStudent, String date, int duration) {
		super();
		BatchID = batchID;
		CourseID = courseID;
		FacultyID = facultyID;
		NumberOfStudent = numberOfStudent;
		Date = date;
		this.duration = duration;
	}
	public Batch(String batchID, int courseID, int numberOfStudent, String date, int duration) {
		super();
		BatchID = batchID;
		CourseID = courseID;
		NumberOfStudent = numberOfStudent;
		Date = date;
		this.duration = duration;
	}
	
	
}
