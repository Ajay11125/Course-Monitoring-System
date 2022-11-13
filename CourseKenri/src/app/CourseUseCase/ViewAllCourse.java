package app.CourseUseCase;

import java.io.IOException;

import app.dao.CourseDAO;
import app.dao.CourseDAOimpl;
import app.main.Course_Panel;

public class ViewAllCourse {
	public static void main(String[] args) throws IOException {
		CourseDAO dao=new CourseDAOimpl();
		dao.ViewAllCourses();
		Course_Panel course_p=new Course_Panel();
		course_p.main(args);
	}
}
