package app.main;

import java.io.IOException;
import java.util.Scanner;

public class Admin_panel {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("===============================Admin=============================");
		System.out.println("1.Insert Update or View Course");
		System.out.println("2.Insert Update or View Batch");
		System.out.println("3.Insert Update or View Faculty");
		System.out.println("4.Insert Update or View Course Plan");
		System.out.println("5.Allocate Faculty To batches");
		System.out.println("6.Generate Report for Batches ");
		System.out.println("7.LogOut ");
		System.out.println("8.Exit ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("\u001B[41m"+"Enter Your Choice From Above(1,2,3,4,5,6,7,8):"+"\u001B[40m");
		int admin_Choice=input.nextInt();
		if(admin_Choice==7) {
			Main mainPage=new Main();
			mainPage.main(args);
		}
		else if(admin_Choice==8) {
			System.out.println("You Closed The Program....");
		}
		else if(admin_Choice==1) {
			Course_Panel cp=new Course_Panel();
			cp.main(args);
		}
		else if(admin_Choice==2) {
			Batch_panel Bp=new Batch_panel();
			Bp.main(args);
		}
		else if(admin_Choice==3) {
			Faculty_panel fp=new Faculty_panel();
			fp.main(args);
		}
		else if(admin_Choice==5) {
			AllocateFacultyPanel allocateFaculty=new AllocateFacultyPanel();
			allocateFaculty.main(args);
		}
		else if(admin_Choice==6) {
			GenerateReportOfAllBatches generateReport=new GenerateReportOfAllBatches();
			generateReport.main(args);
		}
		else if(admin_Choice==4) {
			
		}
		else {
			System.out.println("Wrong Choice choose Again");
			Admin_panel ap=new Admin_panel();
			ap.main(args);
		}
		
		
	}
}
