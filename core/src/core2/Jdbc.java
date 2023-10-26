package core2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	
	
	public static void main(String[] args)throws SQLException {
		
		try {
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/gagandb?useSSL=false", "root", "root");
			
			Statement stmt =con.createStatement();
			
//			
//			
			int rows = stmt.executeUpdate("delete from student where usn=39");
			
			ResultSet rs=stmt.executeQuery("select * from student order by name");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"   "+rs.getInt(2)+"  "+rs.getInt(3)+"   "+rs.getString(4)+"  "+rs.getString(5));
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
