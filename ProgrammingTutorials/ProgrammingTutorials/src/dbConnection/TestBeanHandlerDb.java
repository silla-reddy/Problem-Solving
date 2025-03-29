//package dbConnection;
//
//import java.sql.SQLException;
//
//public class TestBeanHandlerDb extends BeanHandlerDbSetup {
//
//	static String query="SELECT * FROM Persons WHERE FirstName= ?";
//	static String parameter="Raj";
//	public static void main(String[] args) throws SQLException {
//		
//		Persons p=mapResultSet("root", "qwe123", "jdbc:mysql://localhost:3308/mysql",query,parameter,Persons.class);
//		
//		System.out.println("ID "+p.getId()+"\n"+"Last Name "+p.getLastName());
//		
//		
//	}
//
//}
