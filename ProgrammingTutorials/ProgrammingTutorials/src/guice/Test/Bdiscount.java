//package guice.Test;
//
//import com.google.inject.Inject;
//import com.google.inject.name.Named;
//
//public class Bdiscount implements Sale{
//	
//	@Inject
//	@Named("db.specialDis")
//	String isSpecial;
//	
//	private String spec;
//	
//	  public Bdiscount(String specialDiscount) { spec=specialDiscount; }
//	 
//	public void discount()
//	{
//		
//			System.out.println("Bdiscount is deducted"+" another " + spec+"  "+isSpecial );
//		
//		
//			System.out.println("Only B Discount");
//		
//	}
//}
