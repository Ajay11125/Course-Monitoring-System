package app.FacultyUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.CourseDAO;
import app.dao.CourseDAOimpl;
import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;
import app.main.Course_Panel;
import app.main.Faculty_panel;

public class DeleteFaculty {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Faculty ID:");
		int Id=input.nextInt();
		FacultyDAO fk=new FacultyDaoimpl();
		System.out.println(fk.DeleteFaculty(Id));
		Faculty_panel fp=new Faculty_panel();
		fp.main(args);
	}
}
