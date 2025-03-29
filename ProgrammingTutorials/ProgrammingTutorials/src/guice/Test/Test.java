package guice.Test;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	
	 public static void main(String[] args) throws Exception {
	     // BufferedInputStream bis = null;
	      

	      try {
	         // open input stream test.txt for reading purpose.
	    	  InputStream inStream = new FileInputStream("C:\\Users\\srajasekharreddy\\Desktop\\output001.txt");

	       
	    	  Integer nBytes = inStream.available();
	    	  byte[] contents = new byte[20];
	          inStream.read(contents);
	        for(byte b:contents)
	        {
	        	System.out.println(b);
	        }
	         }
	       catch(Exception e) {
	         e.printStackTrace();
	      } finally {
	         // releases any system resources associated with the stream
//	         if(inStream!=null)
//	            inStream.close();
//	         if(bis!=null)
//	            bis.close();
	      }
	   }
	}