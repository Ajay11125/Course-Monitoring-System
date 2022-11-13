package app.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.Utility.DBTablePrinter;
import app.Utility.DBUtil;
import app.model.Batch;

public class GenerateReportOfAllBatches {
	public static void main(String[] args) throws IOException {
		List<Batch> ls1=new ArrayList<Batch>();
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from batch;");
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String BatchId=res.getString("BatchID");
				int CourseID=res.getInt("courseid");
				int facultyID=res.getInt("facultyid");
				int NumberOfStudent=res.getInt("numberOfStudents");
				String batchStartDate=res.getString("BatchStartDate");
				int duration=res.getInt("durationInMonth");
				Batch batch_data=new Batch(BatchId, CourseID, NumberOfStudent, batchStartDate, duration);
				ls1.add(batch_data);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		ls1.forEach(ele->{
			System.out.println("Batch ID:-"+" "+ele.BatchID);
			System.out.println("Course Details:-");
			//==============================Course Details====================================
			try(Connection conn=DBUtil.provideConnection()){
				PreparedStatement ps=conn.prepareStatement("select * from course where courseid=?;");
				ps.setInt(1, ele.CourseID);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println("Course ID:"+" "+rs.getInt("Courseid"));
					System.out.println("Course Name:"+" "+rs.getString("CourseName"));
					System.out.println("Course Fee:"+" "+rs.getInt("fee"));
					System.out.println("Course Description:"+" "+rs.getString("courseDescription"));
				}
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			//================================Faculty Details====================================
			System.out.println("Course Details:-");
			try(Connection conn=DBUtil.provideConnection()){
				PreparedStatement ps=conn.prepareStatement("select * from faculty where facultyid=?;");
				ps.setInt(1, ele.FacultyID);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println("Faculty ID:"+" "+rs.getInt("Facultyid"));
					System.out.println("Faculty Name:"+" "+rs.getString("facultyName"));
					System.out.println("faculty Address:"+" "+rs.getString("facultyAddress"));
					System.out.println("Mobile:"+" "+rs.getString("mobile"));
					System.out.println("E-mail:"+" "+rs.getString("email"));
				}
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Number Of Student In this Batch :-"+" "+ele.NumberOfStudent);
			System.out.println("Batch Start Date:-"+" "+ele.Date);
			System.out.println("Duration In Month :-"+" "+ele.duration);
			
		});
		Admin_panel admin=new Admin_panel();
		admin.main(args);
	}
}

