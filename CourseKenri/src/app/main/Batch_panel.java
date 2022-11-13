package app.main;

import java.io.IOException;
import java.util.Scanner;

import app.BatchUseCase.DeleteBatchById;
import app.BatchUseCase.InsertBatch;
import app.BatchUseCase.UpdateNoOfStudentByID;
import app.BatchUseCase.ViewAllBatches;
import app.BatchUseCase.ViewBatchesByID;
import app.BatchUseCase.ViewByFaculty;
import app.BatchUseCase.updateDurationById;

public class Batch_panel {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("============================Course================================");
		System.out.println("1.Insert New Batch: ");
		System.out.println("2.Delete Batch By batchId: ");
		System.out.println("3.Update Number of Student By BatchId: ");
		System.out.println("4.Update Duration By BatchID: ");
		System.out.println("5.View All Batches:");
		System.out.println("6.View Batch Detail By facultyID");
		System.out.println("7.View Batch Detail By batchID");
		System.out.println("8.Back To Main Menu: ");
		System.out.println("\u001B[41m"+"Enter Your Choice From Above(1,2,3,4,5,6,7,8,9):"+"\u001B[40m");
		int batch_Choice=input.nextInt();
		if(batch_Choice==8) {
			Admin_panel admin=new Admin_panel();
			admin.main(args);
		}
		else if(batch_Choice==1) {
			InsertBatch insertbatch=new InsertBatch();
			insertbatch.main(args);
		}
		else if(batch_Choice==3) {
			UpdateNoOfStudentByID upID=new UpdateNoOfStudentByID();
			upID.main(args);
		}
		else if(batch_Choice==2){
			DeleteBatchById delByID=new DeleteBatchById();
			delByID.main(args);
		}
		else if(batch_Choice==4) {
			updateDurationById upDuration=new updateDurationById();
			upDuration.main(args);
		}
		else if(batch_Choice==5) {
			ViewAllBatches viewAll=new ViewAllBatches();
			viewAll.main(args);
		}
		else if(batch_Choice==6) {
			ViewByFaculty viewbyfaculty=new ViewByFaculty();
			viewbyfaculty.main(args);
		}
		else if(batch_Choice==7) {
			ViewBatchesByID viewByid=new ViewBatchesByID();
			viewByid.main(args);
		}
		else {
			System.out.println("*Wrong Choice please Choose Again");
			Batch_panel bp=new Batch_panel();
			bp.main(args);
		}
	}
	
}
