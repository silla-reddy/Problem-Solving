package selenium;

import java.util.Scanner;

public class HackerrankPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[][] arr=new int[6][6];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("sssssss"+hourglass(arr));
	}
	
	public static int hourglass(int[][] arr)
	{
		int temp1,temp2;
		int count=Integer.MIN_VALUE;
        if(arr.length<3||arr[0].length<3)
        return 0;

        for(int i=0;i<=arr.length-3;i++)
        {
            
            for(int j=0;j<=arr[0].length-3;j++)
            {
                int sum=0;
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum=sum+arr[i+1][j+1];
                sum=sum+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>count)
                    count=sum;
                
            }
            
        }
        return count;
	}

}
