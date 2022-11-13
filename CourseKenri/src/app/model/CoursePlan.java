package app.model;

public class CoursePlan {
	public String planid;
	public String Batchid;
	public int DayNumber;
	public String Topic;
	public String Status;
	public CoursePlan(String planid, String batchid, int dayNumber, String topic, String status) {
		super();
		this.planid = planid;
		Batchid = batchid;
		DayNumber = dayNumber;
		Topic = topic;
		Status = status;
	}
	
}
