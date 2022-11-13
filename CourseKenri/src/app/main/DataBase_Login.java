package app.main;

import java.sql.Connection;
import java.util.Scanner;

import app.Utility.DBUtil;

public class DataBase_Login {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("--------------------------*******--------------------");
			System.out.print("Please Enter DataBase Name: ");
			String Db=input.next();
			System.out.print("Please Enter DataBase Password: ");
			String pass=input.next();
			System.out.println("--------------------------*******--------------------");
			DBUtil.DbName=Db;
			DBUtil.pass=pass;
			Connection conn=DBUtil.provideConnection();
			if(conn!=null) {
				System.out.println("Connected");
			}
			else {
				DataBase_Login dblog=new DataBase_Login();
				dblog.main(args);
			}
		}
}
