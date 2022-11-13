package app.FacultyUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;
import app.main.Faculty_panel;
import app.model.Faculty;

public class InsertFacultyInsert {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Faculty Name:");
		String name=input.next();
		System.out.println("Enter Faculty Address(city):");
		String Address=input.next();
		System.out.println("Enter Faculty Mobile Number:");
		String mobile=input.next();
		System.out.println("Enter Faculty E-mail:");
		String email=input.next();
		String usrname="";
		usrname+=name+System.currentTimeMillis();
		System.out.println("Enter Password for Faculty:");
		String password=input.next();
		Faculty fkl=new Faculty(name, Address, mobile, email, usrname, password);
		FacultyDAO dao=new FacultyDaoimpl();
		System.out.println(dao.InsertFaculty(fkl));
		Faculty_panel fp=new Faculty_panel();
		fp.main(args);
	}
}
