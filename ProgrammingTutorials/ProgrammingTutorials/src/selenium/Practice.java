package selenium;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Practice {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//String dates= {"20 Oct 2052","06 Jun 1933","26 May 1960"};
		
		List<String> dict=new ArrayList<String>();
		List<String> query=new ArrayList<String>();
//		dates.add("20 Oct 2052");
//		dates.add("06 Jun 1933");
//		dates.add("26 May 1960");
//		dates.add("26 May 1978");
//		
//		//compressedString("aabccdd");
//		
//		String[] mails= {"test.emailalex@leetcode.com","test.e.mailbob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//		System.out.println(numUniqueEmails(mails));
		dict.add("rods");
		dict.add("a");
		dict.add("adf");
		dict.add("rods");
		dict.add("a");
		dict.add("adf");
		dict.add("rods");
		dict.add("a");
		dict.add("adf");
		dict.add("rods");
		dict.add("a");
		dict.add("adf");
		dict.add("rods");
		dict.add("a");
		dict.add("adf");
		dict.add("rods");
		dict.add("a");
		dict.add("adf");
		dict.add("rods");
		dict.add("a");
		dict.add("adf");
		dict.add("rods");
		dict.add("a");
		dict.add("adf");
		query.add("odsr");
		query.add("d");
		query.add("a");
		System.out.println(mostActive(dict));
		
	}
	
	 public static List<String> mostActive(List<String> customers) {
		    // Write your code here
		        Map<String,Integer> map=new TreeMap<>();
		        List<String> s=new ArrayList<>();
		        int total=0;
		        for(String customer:customers)
		        {
		            total++;
		            if(map.containsKey(customer))
		                map.put(customer,map.get(customer)+1);
		                
		            else{
		                map.put(customer,1);
		            }
		        }
		        Set<String> set=map.keySet();
		        for(String st:set)
		        {
		            int val=(map.get(st)*100)/total;
		            int rem=(map.get(st)*100)%total;
		            if(rem!=0)
		                val=val+1;
		            if(val>4)
		            {
		                System.out.println(st);
		                s.add(st);
		            }
		        }
		        return s;
		    }
	
	 public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
		    // Write your code here
		    List<Integer> count=new ArrayList<>();
		        for(String q:query)
		        {
		            int c=0;
		            for(String d:dictionary)
		            {
		                
		                if(q.length()==d.length())
		                {
		                    for(int i=0;i<q.length();i++)
		                    {
		                    	if(d.indexOf(q.charAt(i))!=-1)
		                       d=d.substring(0,d.indexOf(q.charAt(i))).concat(d.substring(d.indexOf(q.charAt(i))+1,d.length()));
		                    }
		                    //System.out.println("D"+d);
		                    if(d.equals(""))
		                    {
		                        c++;
		                    }
		                }
		            }
		            count.add(c);
		        }
		        return count;
		    }
	public static List<String> sortDates(List<String> dates)  {
	    // Write your code here
		List<Date> sorteddates=new ArrayList<Date>();	
		//DateFormat dateFormatter = new SimpleDateFormat("dd MMM yyyy");
		for(int i=0;i<dates.size();i++)
		{
			Date date = null;
			try {
				date = new SimpleDateFormat("dd MMM yyyy").parse(dates.get(i));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		    
		      
			System.out.println(date);
			sorteddates.add(date);
		}
		Collections.sort(sorteddates);
		DateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd");
		List<String> dates1=new ArrayList<String>();
		for(Date a: sorteddates)
		{
			String str = dateFormat.format(a);
			dates1.add(str);
			System.out.println(str);
			
		}
		
		System.out.println(dates1);
		return dates1;
	    }
	
	
	public static String compressedString(String message) {
		int count=1;
		String[] a=new String[message.length()];
		
		for(int i=0;i<message.length();i++)
		{
			char curr=message.charAt(i);
			int j=0;
			if(i<message.length()-2)
			 j=i+1;
			
			
			while(curr==message.charAt(j)&&j<message.length()-1)
			{
				count++;
				i=i+1;
				j++;
			}
			if(j>i+1)
			{	
				System.out.println("inlook");
				System.out.print(curr);
				System.out.print(j);
			}
			else
			{
				System.out.println("nop[e");
				System.out.print(curr);
			}
		}
		
		return message;
	    // Write your code here

	    }
	
	 public static int numUniqueEmails(String[] emails) {
	        Set<String> emailSet=new HashSet<String>();
	        String mail=null;
	        for(String e: emails)
	        {
	            String local=e.split("@")[0];
	            String domain=e.split("@")[1];
	            mail=local;
	            
	           while (mail.contains("+") || mail.contains("."))
	           {
	        	   if(mail.contains("+"))
	               mail=local.substring(0,e.indexOf("+"));
	              
	        	   if(mail.contains("."))
	                   mail=mail.substring(0,mail.indexOf(".")).concat(mail.substring(mail.indexOf(".")+1,mail.length()));
	               
	               
	           }
	           
	                
	            
	                   
	                
	            String mailAddress=mail.concat("@").concat(domain);
	            emailSet.add(mailAddress);
	            System.out.println(emailSet);
	        }
	        return emailSet.size();
	    }
	 
	 public static int numUniqueEmails1(String[] emails) {
	       Set<String> emailSet=new HashSet<String>();
	        String mail=null;
	        for(String e: emails)
	        {
	            String local=e.split("@")[0];
	            String domain=e.split("@")[1];
	            mail=local;
	            
	           while (mail.contains("+"))
	           {
	               mail=local.substring(0,e.indexOf("+"));
	               while(mail.contains("."))
	               {
	                   mail=mail.substring(0,mail.indexOf(".")).concat(mail.substring(mail.indexOf(".")+1,mail.length()));
	               }
	                   
	               
	           }
	            while (mail.contains("."))
	            {
	                mail=local.substring(0,local.indexOf(".")).concat(local.substring(local.indexOf(".")+1,local.length()));
	            }
	                
	            
	                   
	                
	            String mailAddress=mail.concat("@").concat(domain);
	            emailSet.add(mailAddress);
	            System.out.println(emailSet);
	        }
	        return emailSet.size();
	    }
}
