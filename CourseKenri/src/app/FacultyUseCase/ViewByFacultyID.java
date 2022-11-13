package app.FacultyUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;
import app.main.Faculty_panel;

public class ViewByFacultyID {
public static void main(String[] args) throws IOException {
	Scanner input= new  Scanner(System.in);
	System.out.println("Enter ID of Faculty:");
	int Id=input.nextInt();
	FacultyDAO fk=new FacultyDaoimpl();
	fk.ViewFacultyByID(Id);
	Faculty_panel fp=new Faculty_panel();
	fp.main(args);
}
}
