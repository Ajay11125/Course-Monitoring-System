package app.dao;

import app.model.Faculty;

public interface FacultyDAO {
	public String InsertFaculty(Faculty fakLT);
	public String DeleteFaculty(int facultyID);
	public String updateNameByID(int FacultyID,String Name);
	public String UpdateAddressByFacultyID(int FacultyID,String address);
	public String UpdateMobileByFacultyID(int FacultyID,String mobile);
	public String UpdateEmailByFacultyID(int FacultyID,String Email);
	public void ViewAllFaculty();
	public void ViewFacultyByName(String Name);
	public void ViewFacultyByID(int FacultyId);
}
