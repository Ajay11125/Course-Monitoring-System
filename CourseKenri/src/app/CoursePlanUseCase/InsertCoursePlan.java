package app.CoursePlanUseCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import app.Utility.DBTablePrinter;
import app.Utility.DBUtil;
import app.dao.CoursePlanDAO;
import app.dao.CoursePlanDAOimpl;
import app.main.CoursePlan_panel;
import app.model.CoursePlan;

public class InsertCoursePlan {
public static void main(String[] args) throws IOException {
	Scanner input=new Scanner(System.in);
	BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter A word Related to CoursePlan:");
	String planID=input.next()+System.currentTimeMillis();
	try(Connection conn=DBUtil.provideConnection()){
		PreparedStatement ps=conn.prepareStatement("select * from batch;");
		ResultSet res=ps.executeQuery();
		System.out.println("--------------------------------------DATA--------------------------------");
		DBTablePrinter.printResultSet(res);
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	System.out.println("Enter Batch ID From Above Table Table:");
	String batchID=input.next();
	int Date = 0;
	try(Connection conn=DBUtil.provideConnection()){
		PreparedStatement ps=conn.prepareStatement("SELECT DATEDIFF( batchStartDate, ?) AS DateDiff from batch where batchID=?;");
		String todayDate="";
		todayDate+=java.time.LocalDate.now();
		ps.setString(1,todayDate);
		ps.setString(2,batchID);
		ResultSet res=ps.executeQuery();
		if(res.next()) {
			Date=res.getInt("DateDiff");
		}
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	System.out.print("Enter Topic Of Course:-");
	String topic=input2.readLine();
	System.out.println("Enter Status 1 for pending and 2 for complete):-");
	int status_type=input.nextInt();
	String status;
	if(status_type==1) {
		status="Pending";
	}
	else {
		status="Complete";
	}
	CoursePlan courseP=new CoursePlan(planID, batchID, Date, topic, status);
	CoursePlanDAO dao=new CoursePlanDAOimpl();
	System.out.println(dao.InsertCoursePlan(courseP));
	CoursePlan_panel courseplanpanel=new CoursePlan_panel();
	courseplanpanel.main(args);
	
	
}
}
