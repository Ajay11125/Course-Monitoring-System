package app.CoursePlanUseCase;

import java.io.IOException;
import java.util.Scanner;

import app.dao.CoursePlanDAO;
import app.dao.CoursePlanDAOimpl;
import app.main.CoursePlan_panel;

public class ViewByCoursePlanBatchID {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Batch ID");
	String id=input.next();
	CoursePlanDAO dao=new CoursePlanDAOimpl();
	dao.viewAllCoursePlanByBatchID(id);
	CoursePlan_panel courseplanpanel=new CoursePlan_panel();
	courseplanpanel.main(args);
}
}
