package app.main;

import java.io.IOException;
import java.util.Scanner;

import app.CourseUseCase.DeleteCourseById;
import app.CourseUseCase.UpdateCourseFee;
import app.CourseUseCase.ViewAllCourse;
import app.CourseUseCase.ViewCourseById;
import app.CourseUseCase.ViewCourseByName;
import app.CourseUseCase.insertCourse;
import app.CourseUseCase.updateCourseNameById;
import app.dao.CourseDAO;
import app.dao.CourseDAOimpl;

public class Course_Panel {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("============================Course================================");
		System.out.println("1.Insert New Course: ");
		System.out.println("2.Delete Course By CourseId: ");
		System.out.println("3.Update Course Fee By CourseId: ");
		System.out.println("4.Update Course Name By courseID: ");
		System.out.println("5.View All Courses:");
		System.out.println("6.View Course Detail By Name");
		System.out.println("7.View Course Detail By CourseID");
		System.out.println("8.Back To Main Menu: ");
		System.out.println("\u001B[41m"+"Enter Your Choice From Above(1,2,3,4,5,6,7,8):"+"\u001B[40m");
		int course_Choice=input.nextInt();
		if(course_Choice==8) {
			Admin_panel admin=new Admin_panel();
			admin.main(args);
		}
		else if(course_Choice==1) {
			insertCourse InsertCourse=new insertCourse();
			InsertCourse.main(args);
		}
		else if(course_Choice==2) {
			DeleteCourseById delete_course=new DeleteCourseById();
			delete_course.main(args);
		}
		else if(course_Choice==3) {
			UpdateCourseFee CourseFee=new UpdateCourseFee();
			CourseFee.main(args);
		}
		else if(course_Choice==4) {
			updateCourseNameById CourseName=new updateCourseNameById();
			CourseName.main(args);
		}
		else if(course_Choice==5) {
			ViewAllCourse viewAll=new ViewAllCourse();
			viewAll.main(args);
		}
		else if(course_Choice==6) {
			ViewCourseByName ViewByName=new ViewCourseByName();
			ViewByName.main(args);
		}
		else if(course_Choice==7) {
			ViewCourseById viewById=new ViewCourseById();
			viewById.main(args);
		}
		else {
			System.out.println("*wrong Choice Choose Again...**");
			Course_Panel cp=new Course_Panel();
			cp.main(args);
		}
		
		
	}
}
