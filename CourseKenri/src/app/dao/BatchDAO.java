package app.dao;

import app.model.Batch;

public interface BatchDAO {
	public String InsertBatch(Batch b);
	public String DeleteCourse(String batchID);
	public String updateNoOfstudentById(String batchId,int noOfStu);
	public String updatedurationById(String batchID, int duration);
	public void ViewAllBatches();
	public void ViewAllByfaculty(int facultyID);
	public void viewAllBybatchID(String batchID);
}
