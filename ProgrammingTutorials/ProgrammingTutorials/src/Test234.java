import java.util.HashMap;
import java.util.Map;

public class Test234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String xpath="//div[@id='forid']/following-sibiling::div";
//		
//		String xpath1="//table/tr/td[2]";
		
//		Connection con=DriverManager.getConnection("dburl",username,password);
//		Statement st=con.createStatement();
//		Result rs=st.execute("Select query");
		
		//Base
		//Map<String,String> map=new HashMap<>();
		
		//Test class
		
		//AfterMethod  -- Itestresult result
		/*
		 * map.put(rresult.methodName,result.status);
		 * 
		 * 
		 * 
		 * for(String s: map.keySet()) { System.out.println("key "+ s+
		 * " value "+map.get(s)); }
		 */
		
//		public void selectBy(WebElement e,String type,String data)
//		{
//			Select select=new Select(e);
//			if(type.equals("value"))
//				select.selectByValue(data);
//			
//			else if(type.equals("visibleText"))
//			{
//				select.selectByVisibleText(data);
//			}
//			else
//			{
//				select.selectByIndex(data);
//			}
//		}
		
		
		int[] a= {1,3,4,10,5};
		String str="Rajasekhar QA Engineer";
		
		secondHighest(a);
		reverseString(str);
		collectiveReverse(str);
		
	}
	
	public static void reverseString(String str)
	{
		String[] arr=str.split(" ");
		//StringBuilder sb=new StringBuilder();
		String reversed="";
		for(int i=0;i<arr.length;i++)
		{
//			sb.append(arr[i]);
//			sb=sb.reverse().append(" ");
			String rev="";
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				rev=rev+arr[i].charAt(j);
			}
			reversed=reversed+rev+" ";
		}
		System.out.println(reversed);
	}
	
	public static void collectiveReverse(String str)
	{
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		reverse=reverse.trim();
		System.out.println(reverse);
	}
	
	
	
	
	
	
	public static void secondHighest(int[] a)
	{
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max2)
			{
				if(a[i]>max1)
				{
					max2=max1;
					max1=a[i];
				
				}
				else
				{
					max2=a[i];
				}
			}
			else if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
		}
		System.out.println("1st "+max1);
		System.out.println("2nd "+max2);
	}

}
