package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app.Utility.DBTablePrinter;
import app.Utility.DBUtil;
import app.model.CoursePlan;

public class CoursePlanDAOimpl implements CoursePlanDAO{
//============================================================Insert Plan======================================================
	@Override
	public String InsertCoursePlan(CoursePlan coureP) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement(" insert into coursePlan values(?,?,?,?,?);");
			ps.setString(1, coureP.planid);
			ps.setString(2, coureP.Batchid);
			ps.setInt(3, coureP.DayNumber);
			ps.setString(4,coureP.Topic);
			ps.setString(5,coureP.Status);
			int x=ps.executeUpdate();
			if(x>0) {
				return "CoursePlan Is Now Added";
				
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
//================================================================delete Plan===================================================
	@Override
	public String DelteCoursePlanByID(String id) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("delete from courseplan where planID=?;");
			ps.setString(1, id);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Plan Is deleted";
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
	//=========================================================update topic===================================================
	@Override
	public String updateTopicByID(String id, String topic) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update courseplan set topic=? where planeid=?;");
			ps.setString(2, id);
			ps.setString(1, topic);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Course Topic Is Updated";
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
	//=========================================================view all=====================================================
	@Override
	public void viewAllCoursePlan() {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Courseplan;");
			ResultSet res=ps.executeQuery();
			System.out.println("-----------------DATA--------------");
			DBTablePrinter.printResultSet(res);
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	//======================================================viewBy batch id=====================================
	@Override
	public void viewAllCoursePlanByBatchID(String batchID) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Courseplan where batchid=?;");
			ps.setString(1, batchID);
			ResultSet res=ps.executeQuery();
			System.out.println("----------------------------------------DATA---------------------------------");
			DBTablePrinter.printResultSet(res);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	//==================================================view Plan id=============================================
	@Override
	public void viewAllCoursePlanByplanID(String planID) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Courseplan where planid=?;");
			ps.setString(1, planID);
			ResultSet res=ps.executeQuery();
			System.out.println("---------------------------------------------DATA---------------------------------");
			DBTablePrinter.printResultSet(res);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
//=====================================================End==================================================
