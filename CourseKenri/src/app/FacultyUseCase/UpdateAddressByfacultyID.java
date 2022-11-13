package app.FacultyUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;
import app.main.Faculty_panel;

public class UpdateAddressByfacultyID {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Faculty ID: ");
	int Id=input.nextInt();
	System.out.println("Enter Faculty New Address(City): ");
	String Address=input.next();
	FacultyDAO fk=new FacultyDaoimpl();
	System.out.println(fk.UpdateAddressByFacultyID(Id, Address));
	Faculty_panel fp=new Faculty_panel();
	fp.main(args);
}
}
