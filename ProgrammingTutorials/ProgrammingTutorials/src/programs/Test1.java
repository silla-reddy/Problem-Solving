package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="My name is Raj";
//		highestOccured(a);
		
		int[] a= {7,9,54,41,12,32,1,2,2,2};
		
		//System.out.println(sumoftwo(a,8));
		second(a);
		
	}
	
	public static void highestOccured(String str)
	{
		str=str.replaceAll(" ", "");
		char[] ch=str.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		int repeat=0;
		
		for(char c: ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
				
		}
		Set<Character> set=map.keySet();
		char highest=ch[0];
		for(char c: set)
		{
			if(map.get(c)>repeat)
			{
				highest=c;
				repeat=map.get(c);
			}
		}
		System.out.println("char "+highest+" val "+repeat);
		
		
		
	}
	//1 2 345
	
	public static Boolean sumoftwo(int[] arr,int sum)
	{
		Arrays.sort(arr);
		
		int start=0;
		int end=arr.length-1;
		Boolean b=false;
	
		
		
		
		while(start<end)
		{
			if((arr[start]+arr[end])==sum)
			{
				b= true;
				return b;
			
			}
			else if((arr[start]+arr[end])<sum)
			{
				start=start+1 ;
			}
			else {
				end=end-1;
			}
		}
		
		return b;
	}
	
	
	public static void second(int[] a)
	{
		int highest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>highest)
			{
				if(a[i]>second)
				{
				second=highest;
				highest=a[i];
				}
				
			}
			
		}
		System.out.println(second);
	}

}
