package programs;

import java.util.Stack;

public class NextGreaterElementInArray {

	
	//Given array {2,32,22,43,5,43,3,4} next greater element of 2 is 32 for (32 ->43) for(22->43)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {12,2,55,5,34,23,34,45,65};
		nextGreaterElement(a);
		
	}
	
	public static void nextGreaterElement(int[] a)
	{
		Stack<Integer> s=new Stack<Integer>();
		int element;
		s.push(a[0]);
		for(int i=1;i<a.length;i++)
		{	 
			if(s.isEmpty()==false)
			{	
				element=s.pop();
				while(a[i]>element)
				{
					System.out.println(element +"---"+ a[i]);
					if(s.isEmpty()==true)
						break;
					element=s.pop();
				}
				if(element>a[i]) {
					s.push(element);
					
				}
				
			}
		
			s.push(a[i]);
				
			
			
		}
		while(s.isEmpty()==false)
		{
			element=s.pop();
			System.out.println(element+"---"+"-1");
			
		}
		
	}
}
