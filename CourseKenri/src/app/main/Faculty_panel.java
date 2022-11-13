package app.main;

import java.io.IOException;
import java.util.Scanner;

import app.BatchUseCase.DeleteBatchById;
import app.FacultyUseCase.InsertFacultyInsert;
import app.FacultyUseCase.UpdateAddressByfacultyID;
import app.FacultyUseCase.UpdateEmailByFacultyID;
import app.FacultyUseCase.UpdateMobileByFacultyID;
import app.FacultyUseCase.UpdateNameByID;
import app.FacultyUseCase.ViewAllFacultys;
import app.FacultyUseCase.ViewByFacultyID;
import app.FacultyUseCase.ViewFacultyByName;

public class Faculty_panel {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("============================Course================================");
		System.out.println("1.Insert New Faculty: ");
		System.out.println("2.Delete Faculty By facultyId: ");
		System.out.println("3.Update faculty Name By FacultyId: ");
		System.out.println("4.Update faculty Address By facultyID: ");
		System.out.println("5.Update faculty Mobile By facultyID: ");
		System.out.println("6.Update faculty E-mail By facultyID: ");
		System.out.println("7.View All Facultys:");
		System.out.println("8.View Faculty Detail By Name");
		System.out.println("9.View Faculty Detail By FacultyID");
		System.out.println("10.Back To Main Menu: ");
		System.out.println("\u001B[41m"+"Enter Your Choice From Above(1,2,3,4,5,6,7,8,9,10):"+"\u001B[40m");
		int faculty_Choice=input.nextInt();
		if(faculty_Choice==10) {
			Admin_panel admin=new Admin_panel();
			admin.main(args);
		}
		else if(faculty_Choice==1) {
			InsertFacultyInsert insertFak=new InsertFacultyInsert();
			insertFak.main(args);
		}
		else if(faculty_Choice==2) {
			DeleteBatchById deleteFaculty=new DeleteBatchById();
			deleteFaculty.main(args);
		}
		else if(faculty_Choice==3) {
			UpdateNameByID updateName=new UpdateNameByID();
			updateName.main(args);
		}
		else if(faculty_Choice==4) {
			UpdateAddressByfacultyID updateAddress=new UpdateAddressByfacultyID();
			updateAddress.main(args);
		}
		else if(faculty_Choice==5) {
			UpdateMobileByFacultyID updateMobile=new UpdateMobileByFacultyID();
			updateMobile.main(args);
		}
		else if(faculty_Choice==6) {
			UpdateEmailByFacultyID updateEmail=new UpdateEmailByFacultyID();
			updateEmail.main(args);
		}
		else if(faculty_Choice==7) {
			ViewAllFacultys viewFaculty=new ViewAllFacultys();
			viewFaculty.main(args);
		}
		else if(faculty_Choice==8) {
			ViewFacultyByName viewFaculty=new ViewFacultyByName();
			viewFaculty.main(args);
			
		}
		else if(faculty_Choice==9) {
			ViewByFacultyID viewID=new ViewByFacultyID();
			viewID.main(args);
		}
		else {
			Faculty_panel fp=new Faculty_panel();
			fp.main(args);
		}
		
	}
}
