package practicing;

import java.util.Scanner;

public class TwoDArray1
{

	public static void main(Strings[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		
		int rows= sc.nextInt();
		int cols= sc.nextInt();
		
		int[][] arr= new int[rows][cols];
		// input
		
		//Rows
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter a number to match in array");
		int x=sc.nextInt();
		
		// Output
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0; j<cols; j++)
			{
				//System.out.print(arr[i][j]+" ");
				
				  if(arr[i][j]==x) {
				  
				  System.out.println("Present number index is ::"+i + " ," + j); }
				 
				
			}
			
		}

	}

}
