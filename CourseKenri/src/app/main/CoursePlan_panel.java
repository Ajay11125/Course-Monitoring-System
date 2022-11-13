package app.main;

import java.io.IOException;
import java.util.Scanner;

import app.CoursePlanUseCase.DeleteCoursePlanUsingID;
import app.CoursePlanUseCase.InsertCoursePlan;
import app.CoursePlanUseCase.ViewAllCoursePlan;
import app.CoursePlanUseCase.ViewByCoursePlanBatchID;
import app.CoursePlanUseCase.ViewCoursePlanByPlanID;
import app.CoursePlanUseCase.updateTopicByid;
import app.dao.CoursePlanDAO;
import app.dao.CoursePlanDAOimpl;

public class CoursePlan_panel {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("============================Course================================");
		System.out.println("1.Insert New CoursePlan: ");
		System.out.println("2.Delete CoursePLan By PlanId: ");
		System.out.println("3.Update Topic By PlanId: ");
		System.out.println("4.View All CoursePlan:");
		System.out.println("5.View CoursePlan Detail By BatchID");
		System.out.println("6.View Course Detail By PlanID");
		System.out.println("7.Back To Main Menu: ");
		System.out.println("\u001B[41m"+"Enter Your Choice From Above(1,2,3,4,5,6,7):"+"\u001B[40m");
		int coursePlan_Choice=input.nextInt();
		if(coursePlan_Choice==7) {
			Admin_panel admin=new Admin_panel();
			admin.main(args);
		}
		else if(coursePlan_Choice==1) {
			InsertCoursePlan insertplan=new InsertCoursePlan();
			insertplan.main(args);
		}
		else if(coursePlan_Choice==2) {
			DeleteCoursePlanUsingID del=new DeleteCoursePlanUsingID();
			del.main(args);
		}
		else if(coursePlan_Choice==3) {
			updateTopicByid updatetopic=new updateTopicByid();
			updatetopic.main(args);
		}
		else if(coursePlan_Choice==4) {
			ViewAllCoursePlan viewCoursePlan=new ViewAllCoursePlan();
			viewCoursePlan.main(args);
		}
		else if(coursePlan_Choice==5) {
			ViewByCoursePlanBatchID viewBybatch=new ViewByCoursePlanBatchID();
			viewBybatch.main(args);
		}
		else if(coursePlan_Choice==6) {
			ViewCoursePlanByPlanID viewByplan=new ViewCoursePlanByPlanID();
			viewByplan.main(args);
		}
		else {
			CoursePlan_panel courseplanpanel=new CoursePlan_panel();
			courseplanpanel.main(args);
		}
	}
}
