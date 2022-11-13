package app.FacultyUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;
import app.main.Faculty_panel;

public class ViewFacultyByName {
public static void main(String[] args) throws IOException {
	Scanner input= new  Scanner(System.in);
	System.out.println("Enter Name of Faculty:");
	String name=input.next();
	FacultyDAO fk=new FacultyDaoimpl();
	fk.ViewFacultyByName(name);
	Faculty_panel fp=new Faculty_panel();
	fp.main(args);
}
}
