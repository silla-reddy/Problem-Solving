package programs;

import java.util.Arrays;

public class SortArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//shift all even numbers to left and odd to right
		int[] a= {2,1,3,5,34,2,4,54,43};
		System.out.println(Arrays.toString(sortEvenOdd(a)));
	}
	
	public static int[]  sortEvenOdd(int[] a)
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				int temp=a[j];
				a[j++]=a[i];
				a[i]=temp;
			}
		}
		return a;
	}
	
	
}
