package app.CourseUseCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import app.dao.CourseDAO;
import app.dao.CourseDAOimpl;
import app.main.Course_Panel;

public class updateCourseNameById {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Course ID:");
		int Id=input.nextInt();
		System.out.println("Enter Course New Name:");
		String Cname=input2.readLine();
		CourseDAO dao=new CourseDAOimpl();
		dao.updateCourseNamebyID(Id, Cname);
		Course_Panel course_p=new Course_Panel();
		course_p.main(args);
	}
}
