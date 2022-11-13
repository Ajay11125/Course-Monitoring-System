package app.FacultyUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;
import app.main.Faculty_panel;

public class UpdateMobileByFacultyID {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Faculty ID:");
	int Id=input.nextInt();
	System.out.println("Enter Faculty New Number:");
	String mobile=input.next();
	FacultyDAO fk=new FacultyDaoimpl();
	System.out.println(fk.UpdateMobileByFacultyID(Id, mobile));
	Faculty_panel fp=new Faculty_panel();
	fp.main(args);
}
}
