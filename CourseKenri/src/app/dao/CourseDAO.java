package app.dao;

import java.sql.ResultSet;
import java.util.List;

import app.model.Course;

public interface CourseDAO {
	public boolean Login(String username,String password,int type);
	public String InsertCourse(Course course);
	public String DeleteCourse(int CourseID);
	public String updateCourseFeeByID(int CourseID,int fee);
	public String updateCourseNamebyID(int CourseID,String Cname);
	public void ViewAllCourses();
	public void ViewByCourseName(String Cname);
	public void ViewByCourseID(int Id);
}
