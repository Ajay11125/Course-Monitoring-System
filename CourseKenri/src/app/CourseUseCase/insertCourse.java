package app.CourseUseCase;

import java.util.Scanner;

import app.dao.CourseDAO;
import app.dao.CourseDAOimpl;
import app.main.Course_Panel;
import app.model.Course;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class insertCourse {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner input2=new Scanner(System.in);
		System.out.println("Please fill the Following Details");
		System.out.print("Enter Course Name: ");
		String Cname=input.readLine();
		System.out.print("Enter Course Fee: ");
		int Cfees=input2.nextInt();
		System.out.print("Enter Course this Course Description(In less than 50 words): ");
		String Cdescp=input.readLine();	
		Course cp=new Course(Cname, Cfees, Cdescp);
		CourseDAO Cdao=new CourseDAOimpl();
		System.out.println(Cdao.InsertCourse(cp));
		Course_Panel course_p=new Course_Panel();
		course_p.main(args);
		
	}
	
}
