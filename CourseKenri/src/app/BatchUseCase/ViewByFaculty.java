package app.BatchUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.BatchDAO;
import app.dao.BatchDAOimpl;
import app.main.Batch_panel;

public class ViewByFaculty {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Faculty ID: ");
	int id=input.nextInt();
	BatchDAO dao=new BatchDAOimpl();
	dao.ViewAllByfaculty(id);
	Batch_panel bp=new Batch_panel();
	bp.main(args);
}
}
