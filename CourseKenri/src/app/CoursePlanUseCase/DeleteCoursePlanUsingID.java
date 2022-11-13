package app.CoursePlanUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.CoursePlanDAO;
import app.dao.CoursePlanDAOimpl;
import app.main.CoursePlan_panel;

public class DeleteCoursePlanUsingID {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Plan ID:");
		String Id=input.next();
		CoursePlanDAO dao=new CoursePlanDAOimpl();
		System.out.println(dao.DelteCoursePlanByID(Id));
		CoursePlan_panel courseplanpanel=new CoursePlan_panel();
		courseplanpanel.main(args);
		
	}
}
