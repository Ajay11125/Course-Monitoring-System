package app.dao;

import app.model.CoursePlan;

public interface CoursePlanDAO {
	public String InsertCoursePlan(CoursePlan coureP);
	public String DelteCoursePlanByID(String id);
	public String updateTopicByID(String id,String topic);
	public void viewAllCoursePlan();
	public void viewAllCoursePlanByBatchID(String batchID);
	public void viewAllCoursePlanByplanID(String planID);
}
