package app.main;

import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;

import app.CourseUseCase.Login;
import app.CourseUseCase.insertCourse;
import app.Utility.DBUtil;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		DataBase_Login.main(args);
		while(true) {
		System.out.println("------------------"+"\u001B[0m"+"WELCOME TO COURSE KENRI"+"\u001B[33m"+"--------------------");
		Login log=new Login();
		System.out.println("1.Login as Admin Enter 1");
		System.out.println("2.Login as Faculty Enter 2");
		System.out.println("3.Exit");
		System.out.println("Enter Your Choice: ");
		int type=input.nextInt();
		if(type==3) {
			break;
		}
		else {
			log.main(args,type);
		}
	
	 }
  }
}
