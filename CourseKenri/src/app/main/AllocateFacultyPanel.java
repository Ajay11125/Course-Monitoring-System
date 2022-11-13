package app.main;

import java.io.IOException;
import java.util.Scanner;

import app.dao.BatchDAO;
import app.dao.BatchDAOimpl;
import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;

public class AllocateFacultyPanel {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	BatchDAO dao=new BatchDAOimpl();
	dao.ViewAllBatches();
	System.out.println("===========================Choose from Above=======================");
	System.out.println("Enter Batch ID:");
	String batch_id=input.next();
	FacultyDAO fp=new FacultyDaoimpl();
	fp.ViewAllFaculty();
	System.out.println("===========================Choose from Above=======================");
	System.out.println("Enter Faculty ID you Want To Allocated:");
	int faculty_id=input.nextInt();
	Admin_panel admin=new Admin_panel();
	admin.main(args);
}
}
