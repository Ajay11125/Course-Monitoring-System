package app.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
		public static String DbName="";
		public static String pass="";
		public static Connection provideConnection() {
			Connection conn=null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url="jdbc:mysql://localhost/"+DbName;
			try {
				conn=DriverManager.getConnection(url, "root", pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
			
		}
		
}
