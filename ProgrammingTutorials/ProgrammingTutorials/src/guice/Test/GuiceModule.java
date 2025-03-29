//package guice.Test;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
//import com.google.inject.AbstractModule;
//import com.google.inject.Provides;
//import com.google.inject.name.Named;
//import com.google.inject.name.Names;
//
//public class GuiceModule extends AbstractModule {
//	
//	@Override
//	public void configure() {
//		//bind(Sale.class).to(Bdiscount.class);
//		Properties prop=new Properties();
//		try {
//			prop.load(new FileInputStream("C:\\Users\\srajasekharreddy\\eclipse-workspace\\Test\\src\\main\\java\\Demo\\Test\\data.properties"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Names.bindProperties(binder(), prop);
//	}
//	
//	
//	  @Provides 
//	  public Sale cutCheck(@Named("Special") String spec) {
//		  return new Bdiscount(spec);
//		  }
//	 
//	
//	
//	  @Named("Special")
//	  
//	  @Provides public String getSpecialDiscount() { return
//	  "Special discount is awarded"; }
//	  
//	  @Provides
//	  public  TestProvidd testPro()
//	  {
//		  return new Adiscount();
//	  }
//	 
//	
//}
