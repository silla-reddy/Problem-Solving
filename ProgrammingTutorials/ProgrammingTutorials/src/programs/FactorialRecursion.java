package programs;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to find factorial for given number
		System.out.println(factorial(4));
		
		//to find the factorial number for given value
		System.out.println(findFactorialNumber(24));

	}
	
	public static int factorial(int n)
	{
		if(n<=1)
			return n;
		
		return n*factorial(n-1);
	}
	
	public static int findFactorialNumber(int n)
	{
		int i=1;
		int number=1;
		if(n==1)
			return n;
		while(number!=n) {
			
			number=number*i;
			i++;
			
		}
		return i-1;
	}
}
