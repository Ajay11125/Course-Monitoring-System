package app.CourseUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.CourseDAO;
import app.dao.CourseDAOimpl;
import app.main.Course_Panel;

public class ViewCourseByName {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Name of Course: ");
		String Cname=input.next();
		CourseDAO dao=new CourseDAOimpl();
		dao.ViewByCourseName(Cname);
		Course_Panel course_p=new Course_Panel();
		course_p.main(args);
	}
}
