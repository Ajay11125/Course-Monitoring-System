package app.CourseUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.CourseDAO;
import app.dao.CourseDAOimpl;
import app.main.Admin_panel;
import app.main.facultyLogin_panel;

public class Login {
		public static String main(String[] args,int type) throws IOException {
			Scanner input=new Scanner(System.in);
			System.out.println("-------------------------Enter Details------------------------");
			System.out.println("Enter Your UserName: ");
			String username=input.next();
			System.out.println("Enter Your Password: ");
			String password=input.next();
			CourseDAO dao=new CourseDAOimpl();
			if(dao.Login(username, password, type)) {
				System.out.println("Login Succesfull...");
				if(type==1) {
					Admin_panel admin=new Admin_panel();
					admin.main(args);
				}
				if(type==2) {
					facultyLogin_panel faculty=new facultyLogin_panel();
					faculty.main(args,username);
				}
				
			}
			else {
				System.out.println("Login failed Please Check Again");
				System.out.println("\u001B[41m"+"Do you Want to Try again(N/Y):"+"\u001B[40m");
				String choice=input.next();
				if(choice.equals("N")||choice.equals("n")) {
					System.out.println("Exiting program...");
				}
				else {
					Login log=new Login();
					log.main(args, type);
				}
							
			}
			return password;
		}
}
