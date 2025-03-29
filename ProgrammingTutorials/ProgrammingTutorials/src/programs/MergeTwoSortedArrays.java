package programs;

/*
 * a1={1,3,5,6,7,8}
 * a2={1,2,3,4,4,6,9}
 * output {1,1,2,3,3,4,4,5,6,6,7,8,9}
 */


public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={1,3,5,6,7,8};
		int[] a2={1,2,3,4,4,8,9};
		int[] a3=new int[a1.length+a2.length];
		
		int i=0,j=0,k=0;
		
		while(i<a1.length&&j<a2.length)
		{
			if(a1[i]==a2[j])
			{
				a3[k++]=a1[i++];
				a3[k++]=a2[j++];
				
			}
			else if(a1[i]<a2[j])
			{
				a3[k++]=a1[i++];
			}
			else
			{
				a3[k++]=a2[j++];
			}
		}
		while(i<a1.length)
		{
			a3[k++]=a1[i++];
		}
		while(j<a2.length)
		{
			a3[k++]=a2[j++];
		}
		for(int l:a3)
			System.out.println(l);
	}

}
