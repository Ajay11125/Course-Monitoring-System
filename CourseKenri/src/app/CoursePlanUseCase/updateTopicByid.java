package app.CoursePlanUseCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import app.dao.CoursePlanDAO;
import app.dao.CoursePlanDAOimpl;
import app.main.CoursePlan_panel;
import app.model.CoursePlan;

public class updateTopicByid {
public static void main(String[] args) throws IOException {
	BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Plan ID:");
	String planid=input.next();
	System.out.println("Enter New Topic Name:-");
	String topic=input2.readLine();
	CoursePlanDAO dao=new CoursePlanDAOimpl();
	dao.updateTopicByID(planid, topic);
	CoursePlan_panel courseplanpanel=new CoursePlan_panel();
	courseplanpanel.main(args);
}
}
