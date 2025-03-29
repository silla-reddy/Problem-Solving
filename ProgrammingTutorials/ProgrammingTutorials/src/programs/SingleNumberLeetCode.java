package programs;

public class SingleNumberLeetCode {
	
	/*
	 * given an array {1,1,2,2,3,3,4} find out the number which appears only once
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,3,4,2,1};
		System.out.println(findSingleNumber(a));

	}
	
	public static int findSingleNumber(int[] a)
	{
		int singleNumber=0;
		for(int i=0;i<a.length-2;i++)
		{
			singleNumber=singleNumber^a[i+1];
		}
		return singleNumber;
	}
	
}
