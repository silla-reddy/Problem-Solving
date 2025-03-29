package dbConnection;

import java.sql.*;

public class TestDbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3308/mysql","root","qwe123");   
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Persons");  
			while(rs.next()) 
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			  
			con.close();
			}catch(Exception e){ System.out.println(e);}  
			} 
	}


