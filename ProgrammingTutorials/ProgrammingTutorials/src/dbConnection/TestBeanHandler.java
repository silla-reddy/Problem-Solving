//package dbConnection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//import org.apache.commons.dbutils.DbUtils;
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.ResultSetHandler;
//import org.apache.commons.dbutils.handlers.BeanHandler;
//
///*
// * resultHandler − BeanHandler object to map result set to Employee object.
// * 
// * queryRunner − QueryRunner object to read employee object from database.
// */
//
//public class TestBeanHandler {
//	// JDBC driver name and database URL
//	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
//	   static final String DB_URL = "jdbc:mysql://localhost:3308/mysql";
//
//	   //  Database credentials
//	   static final String USER = "root";
//	   static final String PASS = "qwe123";
//	   
//	   
//	public static void main(String[] args) throws SQLException {
//		Connection conn = null;
//	      QueryRunner queryRunner = new QueryRunner();
//	      
//	      //Step 1: Register JDBC driver
//	      DbUtils.loadDriver(JDBC_DRIVER);
//
//	      //Step 2: Open a connection
//	      System.out.println("Connecting to database...");
//	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
//
//	      //Step 3: Create a ResultSet Handler to handle Employee Beans
//	      ResultSetHandler<Persons> resultHandler = new BeanHandler<Persons>(Persons.class);
//	      
//	      try {
//	          Persons person = queryRunner.query(conn, "SELECT * FROM Persons WHERE firstName= ?",resultHandler, "Raja");
//	          //Display values
//	         System.out.println("ID :"+person.getId());
//	         System.out.println("Last Name :"+person.getLastName());
//	       } finally {
//	          DbUtils.close(conn);
//	       } 
//		
//	}
//
//}
