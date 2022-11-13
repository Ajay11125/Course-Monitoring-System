package app.FacultyUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;
import app.main.Faculty_panel;

public class UpdateEmailByFacultyID {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Faculty ID:");
	int Id=input.nextInt();
	System.out.println("Enter Faculty New E-mail:");
	String name=input.next();
	FacultyDAO fk=new FacultyDaoimpl();
	System.out.println(fk.UpdateEmailByFacultyID(Id, name));
	Faculty_panel fp=new Faculty_panel();
	fp.main(args);
}
}
