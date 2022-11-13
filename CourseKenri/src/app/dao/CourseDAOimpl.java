package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.Utility.DBTablePrinter;
import app.Utility.DBUtil;
import app.model.Course;

public class CourseDAOimpl implements CourseDAO{
//====================================================Login=============================================================
	@Override
	public boolean Login(String username, String password,int type) {
		String tableName;
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=null;
			if(type==1) {
				ps=conn.prepareStatement("select * from Admin where username=? and password=?");
			}
			else {
				ps=conn.prepareStatement("select * from faculty where username=? and password=?");
			}
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
			
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
//========*********************=====================AdminTasks===========***********************=======================

//==============================================CreateCourse=========================================================
	@Override
	public String InsertCourse(Course course) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into course(courseName,fee,courseDescription) values(?,?,?);");
			ps.setString(1, course.coursName);
			ps.setInt(2, course.fee);
			ps.setString(3, course.description);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Course Is Now Added";
			}
			else {
				return "Fail to Update";
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
//=====================================================Delete Course============================================================
	@Override
	public String DeleteCourse(int CourseID) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("delete from course where courseID=?;");
			ps.setInt(1, CourseID);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Course Is deleted";
			}
			else {
				return "Fail to delete";
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
//==========================================================Update Fee============================================================
	@Override
	public String updateCourseFeeByID(int CourseID, int fee) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update course set fee=? where courseid=?;");
			ps.setInt(2, CourseID);
			ps.setInt(1, fee);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Course Fee Is Updated";
			}
			else {
				return "Fail to Update";
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
//==========================================================Update Course Name======================================================
	@Override
	public String updateCourseNamebyID(int CourseID, String Cname) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update course set courseName=? where courseid=?;");
			ps.setInt(2, CourseID);
			ps.setString(1, Cname);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Course Name Is Updated";
			}
			else {
				return "Fail to Update";
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
//============================================================View Course===========================================================
	@Override
	public void ViewAllCourses() {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Course;");
			ResultSet res=ps.executeQuery();
			System.out.println("-----------------DATA--------------");
			DBTablePrinter.printResultSet(res);
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
//===========================================================View Course By Name===================================================
@Override
public void ViewByCourseName(String Cname) {
	try(Connection conn=DBUtil.provideConnection()){
		PreparedStatement ps=conn.prepareStatement("select * from Course where CourseName=?;");
		ps.setString(1,Cname);
		ResultSet res=ps.executeQuery();
		System.out.println("-----------------------------------------DATA---------------------------------------");
		DBTablePrinter.printResultSet(res);	
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
}
//=============================================================View Course By ID========================================================
@Override
public void ViewByCourseID(int Id) {
	try(Connection conn=DBUtil.provideConnection()){
		PreparedStatement ps=conn.prepareStatement("select * from Course where CourseId=?;");
		ps.setInt(1,Id);
		ResultSet res=ps.executeQuery();
		System.out.println("-----------------------------------------DATA---------------------------------------");
		DBTablePrinter.printResultSet(res);	
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
}
	
}
