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
//public class BeanHandlerDbSetup {
//	
//private  final static String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
//
// static Connection conn = null;
//	
//	public static void connectToDb(String userName,String password,String dbUrl) throws SQLException
//	{
//		
//		//Step 1: Register JDBC driver
//	    DbUtils.loadDriver(JDBC_DRIVER);
//
//	    //Step 2: Open a connection
//	    System.out.println("Connecting to database...");
//	    conn = DriverManager.getConnection(dbUrl, userName, password);
//	    
//	}
//	
//	public static <T> T mapResultSet(String userName,String password,String dbUrl,String query, String parameter,Class<T> className) throws SQLException
//	{
//		connectToDb(userName,password,dbUrl);
//		T result=null;
//		QueryRunner queryRunner = new QueryRunner();
//		
//		ResultSetHandler<T> rsHandlerList = new BeanHandler<T>(className);
//		
//		result=queryRunner.query(conn, query,rsHandlerList, parameter);
//		return result;
//	}
//}
