package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.Utility.DBTablePrinter;
import app.Utility.DBUtil;
import app.model.Batch;

public class BatchDAOimpl implements BatchDAO{
//====================================================Insert Batch=========================================
	@Override
	public String InsertBatch(Batch b) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into Batch(batchid,courseId,NumberOfStudents,batchStartDate,duration) values(?,?,?,?,?);");
			ps.setString(1, b.BatchID);
			ps.setInt(2, b.CourseID);
			ps.setInt(3, b.NumberOfStudent);
			ps.setString(4,b.Date);
			ps.setInt(5,b.duration);
			int x=ps.executeUpdate();
			if(x>0) {
				System.out.println("Please Note BatchID:- "+b.BatchID);
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
//========================================================Delete Batch========================================
	@Override
	public String DeleteCourse(String batchID) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("delete from Batch where batchID=?;");
			ps.setString(1, batchID);
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
//============================================================update no of student=================================
	@Override
	public String updateNoOfstudentById(String batchId,int noOfStu) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update batch set NumberOfStudents=? where batchid=?;");
			ps.setInt(2, noOfStu);
			ps.setString(1, batchId);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Number OF Students Is Updated";
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
	//============================================================update batchName=====================================
	@Override
	public String updatedurationById(String batchID, int duration) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update batch set duration=? where batchid=?;");
			ps.setInt(1, duration);
			ps.setString(2, batchID);
			int x=ps.executeUpdate();
			if(x>0) {
				return "batch Duration Is Updated";
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
	//=========================================================View Batches====================================================
	@Override
	public void ViewAllBatches() {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from batch;");
			ResultSet res=ps.executeQuery();
			System.out.println("--------------------------------------DATA--------------------------------");
			DBTablePrinter.printResultSet(res);
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	//======================================================View By faculty===================================================
	@Override
	public void ViewAllByfaculty(int facultyID) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from batch where facultyID=?;");
			ps.setInt(1, facultyID);
			ResultSet res=ps.executeQuery();
			System.out.println("-----------------------------------DATA------------------------------------");
			DBTablePrinter.printResultSet(res);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void viewAllBybatchID(String batchID) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from batch where batchID=?;");
			ps.setString(1, batchID);
			ResultSet res=ps.executeQuery();
			System.out.println("-----------------------------------DATA------------------------------------");
			DBTablePrinter.printResultSet(res);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
//======================================End==================================================