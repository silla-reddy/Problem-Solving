package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice {
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int a=scanner.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=scanner.nextInt();
		}
		priority(arr);		
		
		
	}
		
	
	
	public static void priority(int[] arr)
	{
		int p=1;
		List<Integer> list=new ArrayList();
		for(int i:arr)
		{
			list.add(i);
		}
		Collections.sort(list);
		Map<Integer,Integer> assignP=new HashMap();
		
		for(int i: list)
		{
			if(!assignP.containsKey(i))
			{
				assignP.put(i,p);
				p++;
			}
		}
		for(int i:arr)
		{  
			System.out.println(assignP.get(i));
		}
		
		
		
	}
	
}

