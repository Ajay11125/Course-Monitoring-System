package app.BatchUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.BatchDAO;
import app.dao.BatchDAOimpl;
import app.main.Batch_panel;
import app.model.Batch;

public class InsertBatch {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a word Realted to Course:");
		String word=input.next();
		word+=System.currentTimeMillis()%1000;
		System.out.println("Enter Course ID from Course table:");
		int id=input.nextInt();
		System.out.println("Enter Number Of Student:");
		int NoOfStu=input.nextInt();
		System.out.println("Enter Batch Start Date:");
		String BatchStartDate=input.next();
		System.out.println("Enter Duration of Course In no. of Months: ");
		int duration=input.nextInt();
		Batch batch=new Batch(word, id,NoOfStu,BatchStartDate, duration);
		BatchDAO dao=new BatchDAOimpl();
		System.out.println(dao.InsertBatch(batch));
		Batch_panel bp=new Batch_panel();
		bp.main(args);
	}
}
