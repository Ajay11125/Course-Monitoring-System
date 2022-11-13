package app.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import app.Utility.DBUtil;
import app.dao.BatchDAO;
import app.dao.BatchDAOimpl;
import app.dao.FacultyDAO;
import app.dao.FacultyDaoimpl;

public class AllocateFacultyPanel {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	BatchDAO dao=new BatchDAOimpl();
	dao.ViewAllBatches();
	System.out.println("===========================Choose from Above=======================");
	System.out.println("Enter Batch ID:");
	String batch_id=input.next();
	FacultyDAO fp=new FacultyDaoimpl();
	fp.ViewAllFaculty();
	System.out.println("===========================Choose from Above=======================");
	System.out.println("Enter Faculty ID you Want To Allocated:");
	int faculty_id=input.nextInt();
	try(Connection conn=DBUtil.provideConnection()){
		PreparedStatement ps=conn.prepareStatement("update Batch set facultyid=? where batchid=?;");
		ps.setString(2,batch_id);
		ps.setInt(1,faculty_id);
		int x=ps.executeUpdate();
		if(x>0) {
			System.out.println("Course Fee Is Updated");
		}
		else {
			System.out.println("Fail to Update");
		}
	}
	catch (SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	Admin_panel admin=new Admin_panel();
	admin.main(args);
}
}
