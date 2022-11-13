package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app.Utility.DBTablePrinter;
import app.Utility.DBUtil;
import app.model.Faculty;

public class FacultyDaoimpl implements FacultyDAO{
//==========================================================Insert Faculty=================================================
	@Override
	public String InsertFaculty(Faculty fakLT) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into faculty(facultyName,facultyAddress,facultyAddress,mobile,email,userName,password) values(?,?,?,?,?,?);");
			ps.setString(1, fakLT.facultyName);
			ps.setString(1, fakLT.facultyName);
			ps.setString(1, fakLT.facultyAddress);
			ps.setString(1, fakLT.mobile);
			ps.setString(1, fakLT.email);
			ps.setString(1, fakLT.Username);
			ps.setString(1, fakLT.Password);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Faculty Is Now Added";
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
//=======================================================Delete Faculty=====================================================
	@Override
	public String DeleteFaculty(int facultyID) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("delete from faculty where facultyID=?;");
			ps.setInt(1, facultyID);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Faculty Is deleted";
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
	//======================================================Faculty Panel=====================================================
	@Override
	public String updateNameByID(int FacultyID, String Name) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update faculty set FacultyName=? where facultyid=?;");
			ps.setInt(2, FacultyID);
			ps.setString(1, Name);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Faculty Name Is Updated";
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
	//========================================================Update Address of Faculty===========================================
	@Override
	public String UpdateAddressByFacultyID(int FacultyID, String address) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update faculty set FacultyAddress=? where facultyid=?;");
			ps.setInt(2, FacultyID);
			ps.setString(1, address);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Faculty Address Is Updated";
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
	//=========================================================Update Mobile======================================================
	@Override
	public String UpdateMobileByFacultyID(int FacultyID, String mobile) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update faculty set mobile=? where facultyid=?;");
			ps.setInt(2, FacultyID);
			ps.setString(1, mobile);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Faculty Address Is Updated";
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
	//=======================================================Update Email=========================================================
	@Override
	public String UpdateEmailByFacultyID(int FacultyID, String Email) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update faculty set Email=? where facultyid=?;");
			ps.setInt(2, FacultyID);
			ps.setString(1, Email);
			int x=ps.executeUpdate();
			if(x>0) {
				return "Faculty Email Is Updated";
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
	//========================================================View All Faculty============================================================
	@Override
	public void ViewAllFaculty() {
		
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Faculty;");
			ResultSet res=ps.executeQuery();
			System.out.println("------------------------------------------DATA-------------------------------------");
			DBTablePrinter.printResultSet(res);
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//====================================================View By Name=============================================================
	@Override
	public void ViewFacultyByName(String Name) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Faculty where facultyName=?;");
			ps.setString(1, Name);
			ResultSet res=ps.executeQuery();
			System.out.println("------------------------------------------DATA-------------------------------------");
			DBTablePrinter.printResultSet(res);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	//========================================================View By ID=============================================================
	@Override
	public void ViewFacultyByID(int FacultyId) {
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Faculty where facultyID=?;");
			ps.setInt(1, FacultyId);
			ResultSet res=ps.executeQuery();
			System.out.println("------------------------------------------DATA-------------------------------------");
			DBTablePrinter.printResultSet(res);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
