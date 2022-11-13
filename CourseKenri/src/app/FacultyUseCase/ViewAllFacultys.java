package app.FacultyUseCase;

import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;
import app.main.Faculty_panel;

public class ViewAllFacultys {
public static void main(String[] args) {
	FacultyDAO dao=new FacultyDaoimpl();
	dao.ViewAllFaculty();
}
}
