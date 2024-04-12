package org.petrolpump.admin.config;
import java.sql.*;
public class DBConfig {
	
	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	public DBConfig() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/petrolpump","root","Cvbn@2023");
			
		}catch(Exception ex) {
			System.out.println("Exception is "+ex);
		}
	}
	
}
