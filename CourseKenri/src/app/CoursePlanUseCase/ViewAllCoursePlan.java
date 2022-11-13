package app.CoursePlanUseCase;

import java.io.IOException;

import app.dao.CoursePlanDAO;
import app.dao.CoursePlanDAOimpl;
import app.main.CoursePlan_panel;


public class ViewAllCoursePlan {
public static void main(String[] args) throws IOException {
	CoursePlanDAO courseplan=new CoursePlanDAOimpl();
	courseplan.viewAllCoursePlan();
	CoursePlan_panel courseplanpanel=new CoursePlan_panel();
	courseplanpanel.main(args);
}
}
