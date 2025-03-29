package programs;

public class SquareRootBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(55));
	}
	
	public static int squareRoot(int a)
	{
		int start=1;
		int end=a/2;
		
		
		if(a<2)
			return a;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(mid*mid==a) {
				return mid;
			}
			else if(mid*mid>a) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return end;
		
		
	}
}
