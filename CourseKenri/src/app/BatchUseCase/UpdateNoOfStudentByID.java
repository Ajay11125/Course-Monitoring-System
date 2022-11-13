package app.BatchUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.BatchDAO;
import app.dao.BatchDAOimpl;
import app.dao.CourseDAO;
import app.dao.CourseDAOimpl;
import app.main.Batch_panel;
import app.main.Course_Panel;

public class UpdateNoOfStudentByID {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Batch ID:");
		String Id=input.next();
		System.out.println("Enter New number of Student Fee:");
		int Strength=input.nextInt();
		BatchDAO dao=new BatchDAOimpl();
		dao.updateNoOfstudentById(Id, Strength);
		Batch_panel bp=new Batch_panel();
		bp.main(args);
	}
}
