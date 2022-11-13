package app.BatchUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.BatchDAO;
import app.dao.BatchDAOimpl;
import app.main.Course_Panel;

public class updateDurationById {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Batch ID:");
	String Id=input.next();
	System.out.println("Enter New Duration:");
	int duration=input.nextInt();
	BatchDAO dao=new BatchDAOimpl();
	dao.updatedurationById(Id, duration);
	Course_Panel course_p=new Course_Panel();
	course_p.main(args);
}
}
