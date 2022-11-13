package app.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import app.Utility.DBTablePrinter;
import app.Utility.DBUtil;

public class facultyLogin_panel {
	public static void main(String[] args,String username) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("===============================Faculty=============================");
		System.out.println("1.View Course Plan");
		System.out.println("2.Update password");
		System.out.println("4.LogOut ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("\u001B[41m"+"Enter Your Choice From Above(1,2,3,4,5,6,7,8):"+"\u001B[40m");
		int faculty_Choice=input.nextInt();
		int id=0;
		try(Connection conn=DBUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement(" select * from faculty where username=?");
			ps.setString(1, username);
			ResultSet res=ps.executeQuery();
			System.out.println("-----------------DATA--------------");
			if(res.next()) {
				id=res.getInt("facultyid");
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		if(faculty_Choice==4) {
			Main mainPage=new Main();
			mainPage.main(args);
		}
		else if(faculty_Choice==1) {
			try(Connection conn=DBUtil.provideConnection()){
				PreparedStatement ps=conn.prepareStatement("select * from courseplan c INNER JOIN batch b ON c.batchid=b.batchid and b.facultyid=?;");
				ps.setInt(1, id);
				ResultSet res=ps.executeQuery();
				System.out.println("-----------------DATA--------------");
				DBTablePrinter.printResultSet(res);
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			facultyLogin_panel fkp = new facultyLogin_panel();
			fkp.main(args, username);
		}
		else if(faculty_Choice==2) {
			Scanner input2=new Scanner(System.in);
			System.out.println("Enter New Password");
			String pass=input2.next();
			try(Connection conn=DBUtil.provideConnection()){
				PreparedStatement ps=conn.prepareStatement("update faculty set password=? where facultyid=?;");
				ps.setInt(2, id);
				ps.setString(1, pass);
				int x=ps.executeUpdate();
				if(x>0) {
					System.out.println("Update Succesfull");
				}
				else {
					System.out.println("Failed...");
				}
				
			}
			catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			facultyLogin_panel fkp = new facultyLogin_panel();
			fkp.main(args, username);
		}
	}
}
